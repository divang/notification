package sf.pl.notification.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "sf.pl" })
@SpringBootApplication
public class LauncherApplication {

	public static void main(String[] args) {
		new SpringApplication(LauncherApplication.class).run(args);
	}
}
