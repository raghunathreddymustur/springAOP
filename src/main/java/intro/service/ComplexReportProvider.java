package intro.service;

import intro.annotations.PerformanceLogger;
import intro.pojo.Report;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;
@Component
public class ComplexReportProvider {
    @PerformanceLogger
    public Report getReport() throws InterruptedException {
        System.out.println("Fetching the report...");
        Thread.sleep(TimeUnit.SECONDS.toMillis(3));
        System.out.println("Report created");

        return new Report();
    }
}
