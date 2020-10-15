package org.handson9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoxConfig {
	
	@Bean("box")
	public Box getBox() {
		Box box = new Box();
		box.setWidth(12);
		box.setLength(10);
		return box;
	}
	
	@Bean("user")
	public User getuser() {
		User user = new User();
		user.setName("Surya");
		user.setPassword("surya");
		return user;
	}
	
}
