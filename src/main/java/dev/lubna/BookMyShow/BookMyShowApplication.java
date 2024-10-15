package dev.lubna.BookMyShow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import services.InitService;

@SpringBootApplication
public class BookMyShowApplication implements CommandLineRunner {
	@Autowired
	private InitService initService;
	public static void main(String[] args) {
		SpringApplication.run(BookMyShowApplication.class, args);

	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("STARTING DATA INITIALIZATION");
		initService.initialise();
	}


}
