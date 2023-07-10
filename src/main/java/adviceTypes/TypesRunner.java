package adviceTypes;

import adviceTypes.config.AppConfig;
import adviceTypes.repo.EmployeeRepository;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TypesRunner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        EmployeeRepository repository = context.getBean(EmployeeRepository.class);
        repository.findEmployeeById(8);

        try{
            repository.findEmployeeById(-1);
        }
        catch (Exception exception)
        {

        }

    }
}
