package com.springboot.web;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.springboot.web.dao.UserRepository;
import com.springboot.web.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
	// @formatter:off
	 
		User user3=new User();
		user3.setName("asif");
		user3.setCity("delhi");
		user3.setStatus("i am java programer");
	User user4 = userRepository.save(user3);
     System.out.println(user4);
	// @formatter:on

	
	
	
	///create object of user
	User user1=new User();
	user1.setName("owaisi");
	user1.setCity("hydrabad");
	user1.setStatus("MP");
	
	User user2=new User();
	user2.setName("modi");
	user2.setCity("gujrat");
	user2.setStatus("PM");
	
//	//saving single user
//	//User resultUser = userRepository.save(user2);
//	List<User> users = List.of(user1,user2);
////	//save multipal object
//	Iterable<User> result = userRepository.saveAll(users);
//	result.forEach(user->{
//		System.out.println(user);
//	});
//	
//	
//	//System.out.println("save user"+resultUser);
//	System.out.println("done");

//	//update the user
//	Optional<User> optional = userRepository.findById(53);
//	User user = optional.get();
//	//System.out.println(user);
//	user.setName("narendra modi");
//	User result = userRepository.save(user);
//	System.out.println(result);
	
	
	//how to get data
	//findbyId(id)-return optional containing your data
	Iterable<User> itr = userRepository.findAll();
	Iterator<User> iterator = itr.iterator();
//	while(iterator.hasNext())
//	{
//	User user = iterator.next();
//	System.out.println(user);
//	
//	}
//	itr.forEach(new Consumer<User>() {
//
//		@Override
//		public void accept(User t) {
//			// TODO Auto-generated method stub
//			System.out.println(t);
			
	//	}
	//});
	//itr.forEach(user->System.out.println(user));
	
//	//deleting the user element
//	userRepository.deleteById(53);
//	System.out.println("deleted");
//	Iterable<User> allusers = userRepository.findAll();
//	allusers.forEach(user->System.out.println(user));
//	
//	userRepository.deleteAll(allusers);
//	
	
	
	
	
	}

}
