package TextEditor;

public class ReplaceTextCommand implements TextDocumentCommand{
    private TextDocument textDocument;
    private int position;
    private int length;
    private String newText;

    public ReplaceTextCommand(TextDocument textDocument, int position, int length, String newText){
        this.textDocument = textDocument;
        this.position = position;
        this.length = length;
        this.newText = newText;
    }

    @Override
    public void execute(){
        this.textDocument.replaceText(this.position, this.length, this.newText);
    }
}
