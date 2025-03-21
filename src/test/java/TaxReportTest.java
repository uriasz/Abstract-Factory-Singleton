import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaxReportTest {
    @Test
    void testGenerateTaxReport() {
        Document taxReport = new TaxReport();
        assertDoesNotThrow(taxReport::generate);
    }
}