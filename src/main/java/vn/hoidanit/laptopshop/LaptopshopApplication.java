package vn.hoidanit.laptopshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
// Dùng để disable Spring Security tạm thời (để khi vào web không cần phải login)
@SpringBootApplication(
	exclude = org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class)
public class LaptopshopApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaptopshopApplication.class, args);
	}

}
