import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HiBye extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // CONTROLS
        Button bHi, bBye; // Two reference to Button, no Button exist yet!
        bHi = new Button("hi");
        bBye = new Button("bye");
        TextField textField = new TextField(); // All at once

        // EVENT HANDLER CREATION
        // https://docs.oracle.com/javase/8/javafx/events-tutorial/processing.htm#CEGJAAFD
        // Create button press event handlers
        HiByeEventHandler hbh1 = new HiByeEventHandler();

        // EVENT HANDLER HOOKUP
        // Tell the buttons who they should call when they are pressed
        bHi.setOnAction(hbh1);
        // bBye.setOnAction(hbh2); // or alternative API below...
        bBye.addEventHandler(ActionEvent.ACTION , hbh1);

        // https://docs.oracle.com/javase/8/javafx/api/javafx/event/Event.html
        // bHi.setOnAction(hbh1); vs bHi.setOnAction(hbh2);
        // Can only add a specific handler one time to a control.

        // LAYOUT
        HBox root = new HBox();
        // VBox root = new VBox();
        root.setPadding(new Insets(25));
        root.getChildren().addAll(bHi,bBye,textField);

        // SCENE
        Scene scene = new Scene(root);
        // Scene scene = new Scene(root, 200, 200);

        // STAGE
        stage.setTitle("Hi Bye");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
