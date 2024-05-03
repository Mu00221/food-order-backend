package food.foodordering;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Configuration
@EnableJpaRepositories(basePackages = "food.repository")
@EntityScan(basePackages = "food.model")

public class ApplicationConfig {
    

   
}
