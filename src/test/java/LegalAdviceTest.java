import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LegalAdviceTest {
    @Test
    void testGenerateLegalAdvice() {
        Document legalAdvice = new LegalAdvice();
        assertDoesNotThrow(legalAdvice::generate);
    }
}
