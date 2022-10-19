package hello.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoreApplication extends MemberApp {

	public static void main(String[] args) {
		SpringApplication.run(CoreApplication.class, args);
	}

}
