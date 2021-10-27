import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.davor.spring"})
public class PetClinicDavorApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetClinicDavorApplication.class, args);
	}

}
