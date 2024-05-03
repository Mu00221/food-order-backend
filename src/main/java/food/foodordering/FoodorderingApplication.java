package food.foodordering;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ComponentScan(basePackages = "food")
@SpringBootApplication
public class FoodorderingApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodorderingApplication.class, args);
	}

	 @GetMapping("/hello")
    public String greeting() {
        return "Hello world";
    }

}
