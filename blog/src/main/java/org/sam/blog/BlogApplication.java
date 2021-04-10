package org.sam.blog;


import lombok.extern.slf4j.Slf4j;
import org.sam.blog.model.User;
import org.sam.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@Slf4j
public class BlogApplication  implements CommandLineRunner {

	@Autowired
	UserService userService;

	@Autowired
	PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
		log.info(passwordEncoder.encode("1234"));
		User user = new User("bui",passwordEncoder.encode("1234"),"tran@gmal.com");
		userService.save(user);
		log.info(user.toString());
	}
}
