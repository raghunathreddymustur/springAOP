package intro.actions;

import intro.pojo.FormattedReport;
import intro.pojo.Report;
import intro.service.ComplexReportFormatter;
import intro.service.ComplexReportProvider;
import intro.service.ComplexReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComplexReportAction {
    @Autowired
    private ComplexReportProvider complexReportProvider;
    @Autowired
    private ComplexReportFormatter complexReportFormatter;
    @Autowired
    private ComplexReportRepository complexReportRepository;

    public void perform() throws InterruptedException {
        Report report = complexReportProvider.getReport();
        FormattedReport formattedReport = complexReportFormatter.formatReport(report);
        complexReportRepository.save(formattedReport);

        report = complexReportProvider.getReport();
    }
}
