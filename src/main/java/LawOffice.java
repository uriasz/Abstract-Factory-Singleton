public class LawOffice {
    public static void main(String[] args) {

        DocumentFactory individualFactory = IndividualDocumentFactory.getInstance();
        Document individualPrimary = individualFactory.createPrimaryDocument();
        Document individualSecondary = individualFactory.createSecondaryDocument();

        individualPrimary.generate();
        individualSecondary.generate();


        DocumentFactory businessFactory = BusinessDocumentFactory.getInstance();
        Document businessPrimary = businessFactory.createPrimaryDocument();
        Document businessSecondary = businessFactory.createSecondaryDocument();

        businessPrimary.generate();
        businessSecondary.generate();
    }
}