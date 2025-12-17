package TextEditor;

public class InsertTextCommand implements TextDocumentCommand{
    private TextDocument textDocument;
    private int position;
    private String text;

    public InsertTextCommand(TextDocument textDocument, int position, String text){
        this.textDocument = textDocument;
        this.position = position;
        this.text = text;
    }

    @Override
    public void execute(){
        this.textDocument.insertText(this.position, this.text);
    }
}
