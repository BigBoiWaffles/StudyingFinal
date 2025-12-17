package TextEditor;

import java.util.ArrayList;

public class TextDocumentCommandInvoker {
    private TextDocumentCommand command;

    public TextDocumentCommandInvoker(){
        this.command = null;
    }

    public void setCommand(TextDocumentCommand command){
        this.command = command;
    }

    public void executeCommand(){
        this.command.execute();
    }
}
