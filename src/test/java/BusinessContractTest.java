import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BusinessContractTest {
    @Test
    void testGenerateBusinessContract() {
        Document businessContract = new BusinessContract();
        assertDoesNotThrow(businessContract::generate);
    }
}