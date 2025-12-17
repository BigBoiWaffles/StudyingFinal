package PrintSpooler;

public class PrintJob {
    private String documentName;
    private int pages;
    private String owner;
    private int priority; // 1=low, 2=normal, 3=high

    public PrintJob(String documentName, int pages, String owner, int priority) {
        this.documentName = documentName;
        this.pages = pages;
        this.owner = owner;
        this.priority = priority;
    }

    public String getDocumentName() { return documentName; }
    public int getPages() { return pages; }
    public String getOwner() { return owner; }
    public int getPriority() { return priority; }

    @Override
    public String toString() {
        return String.format("%s (%d pages) by %s [Priority: %d]",
                documentName, pages, owner, priority);
    }
}
