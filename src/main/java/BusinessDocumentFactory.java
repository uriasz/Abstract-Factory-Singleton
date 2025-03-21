class BusinessDocumentFactory implements DocumentFactory {
    private static BusinessDocumentFactory instance;

    private BusinessDocumentFactory() {}

    public static BusinessDocumentFactory getInstance() {
        if (instance == null) {
            instance = new BusinessDocumentFactory();
        }
        return instance;
    }

    @Override
    public Document createPrimaryDocument() {
        return new BusinessContract();
    }

    @Override
    public Document createSecondaryDocument() {
        return new TaxReport();
    }
}