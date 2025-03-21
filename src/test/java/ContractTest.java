import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContractTest {
    @Test
    void testGenerateContract() {
        Document contract = new Contract();
        assertDoesNotThrow(contract::generate);
    }
}