package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//there will be no external server, it will be embedded as HTTP runtime
@SpringBootApplication
public class Application{
	public static void main(String[] args) {
		//spring framework will call this
		SpringApplication.run(Application.class, args);
	}
}