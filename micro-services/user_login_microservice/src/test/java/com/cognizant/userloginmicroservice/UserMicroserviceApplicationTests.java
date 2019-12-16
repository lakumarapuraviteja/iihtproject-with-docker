package com.cognizant.userloginmicroservice;
//package com.cognizant.usermicroservice;
//
//import static org.junit.Assert.*;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import com.cognizant.usermicroservice.entity.User;
//import com.cognizant.usermicroservice.exception.UserAlreadyExistsException;
//import com.cognizant.usermicroservice.repository.RegistrationRepository;
//import com.cognizant.usermicroservice.service.RegistrationService;
//
//@SpringBootTest
//public class UserMicroserviceApplicationTests {
//
//	@InjectMocks
//	private RegistrationService registrationService;
//	
//	@Mock
//	private RegistrationRepository registrationRepository;
//	
//	@Before
//	public void init() {
//		MockitoAnnotations.initMocks(this);
//	}
//	
//	@Test
//	public void signUpTest() throws UserAlreadyExistsException {
//		User user = new User();
//		user.setActive(true);
//		user.setConfirmedSignup(true);
//		user.setContactNumber("9876549877");
//		user.setFirstName("qwerty");
//		user.setLastName("qwertyui");
//		user.setLinkedinUrl(null);
//		user.setPassword("pass");
//		user.setRegCode("P");
//		user.setResetPassword(false);
//		user.setResetPasswordDate(null);
//		user.setRole("ROLE_U");
//		user.setUserName("qwertifier500");
//		user.setYearsOfExperience(3.6f);
//		registrationService.register(user);
//		assertEquals(user.toString(), registrationRepository.findById(user.getId()));
//	}
//
//}
//
