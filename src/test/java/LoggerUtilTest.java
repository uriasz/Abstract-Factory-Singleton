import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.logging.Logger;

class LoggerUtilTest {
    @Test
    void testLogMessage() {
        Logger logger = Logger.getLogger(LoggerUtil.class.getName());
        assertDoesNotThrow(() -> LoggerUtil.log("Test log message"));
    }
}