package intro.service;

import intro.annotations.PerformanceLogger;
import intro.pojo.FormattedReport;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class ComplexReportRepository {
    @PerformanceLogger
    public void save(FormattedReport report) throws InterruptedException {
        System.out.println("Saving the report...");
        Thread.sleep(TimeUnit.SECONDS.toMillis(2));
        System.out.println("Report saved");
    }
}
