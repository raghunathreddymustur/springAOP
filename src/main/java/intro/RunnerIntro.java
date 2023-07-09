package intro;


import intro.actions.ComplexReportAction;
import intro.config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunnerIntro {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        context.registerShutdownHook();

        ComplexReportAction complexReportAction = context.getBean(ComplexReportAction.class);

        complexReportAction.perform();
    }
}
