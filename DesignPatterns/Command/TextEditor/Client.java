package TextEditor;

public class Client {
    public static void main(String[] args){
        TextDocument textDocument = new TextDocument();
        TextDocumentCommandInvoker editor = new TextDocumentCommandInvoker();
        editor.setCommand(new InsertTextCommand(textDocument, 0, "Hello"));
        editor.executeCommand();
        textDocument.display();
    }
}
