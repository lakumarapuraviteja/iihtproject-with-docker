FROM openjdk:8-jdk-alpine
COPY target/user_login_microservice-0.0.1-SNAPSHOT app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom -Djava.net.preferIPv4Stack=true","-jar","/app.jar"]

