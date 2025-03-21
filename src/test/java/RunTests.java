import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class AllTests {

    @Test
    void testLoggerUtil() {
        LoggerUtilTest loggerTest = new LoggerUtilTest();
        loggerTest.testLogMessage();
    }

    @Test
    void testContract() {
        ContractTest contractTest = new ContractTest();
        contractTest.testGenerateContract();
    }

    @Test
    void testLegalAdvice() {
        LegalAdviceTest legalAdviceTest = new LegalAdviceTest();
        legalAdviceTest.testGenerateLegalAdvice();
    }

    @Test
    void testBusinessContract() {
        BusinessContractTest businessContractTest = new BusinessContractTest();
        businessContractTest.testGenerateBusinessContract();
    }

    @Test
    void testTaxReport() {
        TaxReportTest taxReportTest = new TaxReportTest();
        taxReportTest.testGenerateTaxReport();
    }

    @Test
    void testIndividualDocumentFactory() {
        IndividualDocumentFactoryTest individualDocumentFactoryTest = new IndividualDocumentFactoryTest();
        individualDocumentFactoryTest.testSingletonInstance();
        individualDocumentFactoryTest.testCreatePrimaryDocument();
        individualDocumentFactoryTest.testCreateSecondaryDocument();
    }

    @Test
    void testBusinessDocumentFactory() {
        BusinessDocumentFactoryTest businessDocumentFactoryTest = new BusinessDocumentFactoryTest();
        businessDocumentFactoryTest.testSingletonInstance();
        businessDocumentFactoryTest.testCreatePrimaryDocument();
        businessDocumentFactoryTest.testCreateSecondaryDocument();
    }
}
