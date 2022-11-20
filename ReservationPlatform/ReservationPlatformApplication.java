package pl.msi.ReservationPlatform;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = {"pl.msi.Entity"})
public class ReservationPlatformApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReservationPlatformApplication.class, args);
	}

}
