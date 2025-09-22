package logic.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import logic.learn.facil.Ex_000_HelloWorld;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
		Ex_000_HelloWorld exemplo = new Ex_000_HelloWorld();
		
		exemplo.HelloWorld();
		
		
	}

}
