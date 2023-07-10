package adviceTypes.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "adviceTypes")
@EnableAspectJAutoProxy
public class AppConfig {
}
