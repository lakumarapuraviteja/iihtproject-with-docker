-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: mentor_on_demand
-- ------------------------------------------------------
-- Server version	5.7.10-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `mentor`
--

DROP TABLE IF EXISTS `mentor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mentor` (
  `mentor_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `mentor_linkedin_url` varchar(255) NOT NULL,
  `mentor_timeslot` varchar(11) NOT NULL,
  `mentor_years_of_experience` float NOT NULL,
  `mentor_user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`mentor_id`),
  KEY `FKtfkx403mra3pna073o3h1k5ti` (`mentor_user_id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mentor`
--

LOCK TABLES `mentor` WRITE;
/*!40000 ALTER TABLE `mentor` DISABLE KEYS */;
INSERT INTO `mentor` VALUES (1,'linkedin.com','11:00-13:00',4,1),(2,'linkedin','09:00-11:00',5,3);
/*!40000 ALTER TABLE `mentor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mentor_skill`
--

DROP TABLE IF EXISTS `mentor_skill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mentor_skill` (
  `ms_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `ms_self_rating` float NOT NULL,
  `ms_years_of_experience` float NOT NULL,
  `ms_mentor_id` bigint(20) NOT NULL,
  `ms_skill_id` bigint(20) NOT NULL,
  PRIMARY KEY (`ms_id`),
  KEY `FKtnf1q2bkex81ftw7t7omvb83l` (`ms_mentor_id`),
  KEY `FKqcj1pqkrdlvbu4nkiqvc8q3io` (`ms_skill_id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mentor_skill`
--

LOCK TABLES `mentor_skill` WRITE;
/*!40000 ALTER TABLE `mentor_skill` DISABLE KEYS */;
INSERT INTO `mentor_skill` VALUES (1,4,4,1,1),(2,10,9.5,1,2),(3,4,5,2,3),(4,8,10,2,4);
/*!40000 ALTER TABLE `mentor_skill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `skill`
--

DROP TABLE IF EXISTS `skill`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `skill` (
  `skill_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `skill_name` varchar(255) NOT NULL,
  `skill_toc` varchar(255) DEFAULT NULL,
  `skill_prerequisite` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`skill_id`),
  KEY `FKlwmdyofh8pruxjahcf88weuuv` (`skill_prerequisite`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `skill`
--

LOCK TABLES `skill` WRITE;
/*!40000 ALTER TABLE `skill` DISABLE KEYS */;
INSERT INTO `skill` VALUES (1,'java','java',NULL),(2,'html','html',1),(3,'css','css',2),(4,'java script','java script',3);
/*!40000 ALTER TABLE `skill` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `training`
--

DROP TABLE IF EXISTS `training`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `training` (
  `training_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `training_end_date` date NOT NULL,
  `training_progress` int(11) NOT NULL,
  `training_rating` float DEFAULT NULL,
  `training_start_date` date NOT NULL,
  `training_status` varchar(20) NOT NULL,
  `training_mentor_id` bigint(20) NOT NULL,
  `training_skill_id` bigint(20) NOT NULL,
  `training_user_id` bigint(20) NOT NULL,
  PRIMARY KEY (`training_id`),
  KEY `FKb9n4i7r331uhflndhjj64kgr9` (`training_mentor_id`),
  KEY `FK8dfju72gnd7gmvmjhcjyjv1p` (`training_skill_id`),
  KEY `FKbesfm9lgjyrcjrn45gkjv5lci` (`training_user_id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `training`
--

LOCK TABLES `training` WRITE;
/*!40000 ALTER TABLE `training` DISABLE KEYS */;
INSERT INTO `training` VALUES (1,'2019-12-24',0,0,'2019-12-11','Accepted',1,1,2),(2,'2020-01-13',0,0,'2019-12-23','Denied',1,1,2),(3,'2019-12-13',0,0,'2019-12-12','Accepted',2,3,2),(4,'2019-12-31',0,0,'2019-12-12','Request Pending',1,1,2),(5,'2019-12-31',0,0,'2019-12-12','Denied',1,1,2);
/*!40000 ALTER TABLE `training` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_contact_number` varchar(10) NOT NULL,
  `user_first_name` varchar(45) NOT NULL,
  `user_last_name` varchar(45) NOT NULL,
  `user_password` varchar(75) NOT NULL,
  `user_reset_password` bit(1) NOT NULL,
  `user_reset_password_date` date DEFAULT NULL,
  `user_role` varchar(6) NOT NULL,
  `user_name` varchar(45) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'9840282403','Lakumarapu','RaviTeja','$2a$10$L3TXl8inWOmG.DXEQ1D7vewBQsxujKsN43KcmBF7NHGehvw82PLIS','\0',NULL,'ROLE_M','mentor@gmail.com'),(2,'9876543322','RaviTeja','Lakumarapu','$2a$10$X4uVouZwTr9svIfnkLeSn.lWfKkGdo0sxbvgVm8.OAp1CWzjlRXa6','\0',NULL,'ROLE_U','user@gmail.com'),(3,'1230456789','ken','bay','$2a$10$uNWg4UR0Gq9GVXls.z7SCukkw/3N0ONfNLH2yxSYa0Oq346cIJZFW','\0',NULL,'ROLE_M','ken@gmail.com');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-11 16:25:32
