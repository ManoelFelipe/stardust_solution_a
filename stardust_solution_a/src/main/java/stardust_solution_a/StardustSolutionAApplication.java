package stardust_solution_a;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EntityScan(basePackages = "stardust_solution_a.model")
@ComponentScan(basePackages = { "stardust_*" })
@EnableJpaRepositories(basePackages = { "stardust_solution_a.repository" })
@EnableTransactionManagement
public class StardustSolutionAApplication {

	public static void main(String[] args) {
		SpringApplication.run(StardustSolutionAApplication.class, args);
		// System.out.println(new BCryptPasswordEncoder().encode("123"));
	}

}
