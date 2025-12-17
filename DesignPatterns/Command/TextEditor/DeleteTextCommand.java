package TextEditor;

public class DeleteTextCommand implements TextDocumentCommand{
    private TextDocument textDocument;
    private int position;
    private int length;

    public DeleteTextCommand(TextDocument textDocument, int position, int length){
        this.textDocument = textDocument;
        this.position = position;
        this.length = length;
    }

    @Override
    public void execute(){
        this.textDocument.deleteText(this.position, this.length);
    }
}
