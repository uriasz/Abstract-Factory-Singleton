import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BusinessDocumentFactoryTest {
    @Test
    void testSingletonInstance() {
        BusinessDocumentFactory instance1 = BusinessDocumentFactory.getInstance();
        BusinessDocumentFactory instance2 = BusinessDocumentFactory.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    void testCreatePrimaryDocument() {
        DocumentFactory factory = BusinessDocumentFactory.getInstance();
        assertTrue(factory.createPrimaryDocument() instanceof BusinessContract);
    }

    @Test
    void testCreateSecondaryDocument() {
        DocumentFactory factory = BusinessDocumentFactory.getInstance();
        assertTrue(factory.createSecondaryDocument() instanceof TaxReport);
    }
}
