package org.handson7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
	
	@Bean("user")
	public User getUser() {
		User user = new User();
		user.setName("Jegan");
		user.setAge(24);
		user.setCity("Chennai");
		return user;
	}
	
	@Bean("order1")
	public Order getOrder1() {
		Order order = new Order();
		order.setItemName("Item1");
		order.setPrice(230.07);
		return order;
	}
	@Bean("order2")
	public Order getOrder2() {
		Order order = new Order();
		order.setItemName("Item2");
		order.setPrice(230.07);
		return order;
	}
	
}
