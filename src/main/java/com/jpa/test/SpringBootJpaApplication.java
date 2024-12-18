package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
@ComponentScan(basePackages = "com.jpa.test")
public class SpringBootJpaApplication {

	public static <T> void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootJpaApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
//		User user = new User();
//		
//		user.setName("Ramkumar");
//		user.setCity("Kalaburagi");
//		user.setStatus("I am java Programmer");
//		
//		User user1 = userRepository.save(user);
//		System.out.println(user1);

		// Create object of user

//		User user1 = new User();
//		user1.setName("Utaam");
//		user1.setCity("City1");
//		user1.setStatus("I am java Programmer");
//
//		User user2 = new User();
//		user2.setName("Ati-Utaam");
//		user2.setCity("City2");
//		user2.setStatus("I am javaScript Programmer");

		// saving single user

//		User resultUser = userRepository.save(user1);

//		List<User> users = List.of(user1,user2);
		// Save multiple objects
//		Iterable<User> result = userRepository.saveAll(users);
//		System.out.println("Saved user " +users);
//		System.err.println("Done");

//		result.forEach(user ->{
//			System.out.println(user);
//		});

		// Updating
//		Optional<User> optional = userRepository.findById(1);
//		User user = optional.get();
//		
//		user.setName("Karan");
//		User result = userRepository.save(user);
//		System.out.println(result);

		// how to get the data
		// findById(id) - return Optional Containing your data

		
//		Iterable<User> itr = userRepository.findAll();
//		Iterator<User> iterator = itr.iterator();
//		while(iterator.hasNext())
//		{
//			User user = iterator.next();
//			System.err.println(user);
//		}

		
		//itr.forEach(user -> {System.out.println(user);});
	
		
		// Deleting the user 
		userRepository.deleteById(52);
		System.out.println("deleted");
		
		Iterable<User> allusers = userRepository.findAll();
		allusers.forEach(user -> System.out.println(user));
	
		userRepository.deleteAll(allusers);
	}
	

}
