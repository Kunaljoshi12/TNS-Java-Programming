package Day25;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name,int age ,String city) {};

@Configuration
public class SpringConfiguration1 {
	
	@Bean
	public String getName() {
		return "Kunal";
	}
	
	@Bean
	public int getAge() {
		return 21;
	}
	
	@Bean
	public Person getPerson() {
		var Person = new Person ("Kunal",23,"Khamgaon" );
		return Person;
	}

}