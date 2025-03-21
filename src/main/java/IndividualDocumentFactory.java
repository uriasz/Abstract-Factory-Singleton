class IndividualDocumentFactory implements DocumentFactory {
    private static IndividualDocumentFactory instance;

    private IndividualDocumentFactory() {}

    public static IndividualDocumentFactory getInstance() {
        if (instance == null) {
            instance = new IndividualDocumentFactory();
        }
        return instance;
    }

    @Override
    public Document createPrimaryDocument() {
        return new Contract();
    }

    @Override
    public Document createSecondaryDocument() {
        return new LegalAdvice();
    }
}
