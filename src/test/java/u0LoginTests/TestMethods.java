package u0LoginTests;


import Reports.AnswersReport;
import Reports.VisitsReport;
import org.junit.Test;

public class TestMethods {

    @Test
    public void login() throws InterruptedException {
        ChromeLoginTest chromeManufTest = new ChromeLoginTest();
        chromeManufTest.createManuf();
    }
    @Test
    public void answers() throws InterruptedException {
        AnswersReport answersReport = new AnswersReport();
        answersReport.findAnswers();
    }
    @Test
        public void visits() throws InterruptedException {
            VisitsReport visitsReport = new VisitsReport();
            visitsReport.findVisit();
    }
}
