import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IndividualDocumentFactoryTest {
    @Test
    void testSingletonInstance() {
        IndividualDocumentFactory instance1 = IndividualDocumentFactory.getInstance();
        IndividualDocumentFactory instance2 = IndividualDocumentFactory.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    void testCreatePrimaryDocument() {
        DocumentFactory factory = IndividualDocumentFactory.getInstance();
        assertTrue(factory.createPrimaryDocument() instanceof Contract);
    }

    @Test
    void testCreateSecondaryDocument() {
        DocumentFactory factory = IndividualDocumentFactory.getInstance();
        assertTrue(factory.createSecondaryDocument() instanceof LegalAdvice);
    }
}