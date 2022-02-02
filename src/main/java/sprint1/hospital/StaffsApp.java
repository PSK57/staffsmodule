package sprint1.hospital;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StaffsApp {

	public static void main(String[] args) {
		SpringApplication.run(StaffsApp.class, args);
		System.out.println("Staffs Module Started...");
	}
}