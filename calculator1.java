import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

//Start
public class calculator1 extends Application {
    private Stage window;

    @Override
    public void start(Stage primaryStage) throws Exception {

        window = primaryStage;
        primaryStage.setTitle("Calculator");

        TextField go = new TextField();
        go.setPromptText("Input NUmber");
        VBox vbox = new VBox();//v box

        Button one = new Button(" 1 ");
        Button two = new Button(" 2 ");
        Button three = new Button(" 3 ");
        Button four= new Button(" 4 ");
        Button five = new Button(" 5 ");
        Button six = new Button(" 6 ");
        Button seven = new Button(" 7 ");
        Button eight = new Button(" 8 ");
        Button nine = new Button(" 9 ");
        Button ten = new Button(" 0 ");

        one.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        three.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
         five.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        seven.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        nine.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");

        Button point= new Button(" .  ");
        Button equal= new Button(" = ");
        Button div = new Button(" / " );
        Button mul= new Button(" * ");
        Button sub= new Button(" - ");
        Button add= new Button(" + ");
        Button per= new Button(" % ");

        point.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        add.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        mul.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        per.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white;");
        GridPane gridPane = new GridPane();

        gridPane.add(one, 0, 0, 1, 1);
        gridPane.add(two, 1, 0, 1, 1);
        gridPane.add(three, 2, 0, 1, 1);
        gridPane.add(div, 3, 0, 1, 1);

        gridPane.add(four, 0, 1, 1, 1);
        gridPane.add(five, 1, 1, 1, 1);
        gridPane.add(six, 2, 1, 1, 1);
        gridPane.add(mul, 3, 1, 1, 1);

        gridPane.add(seven, 0, 2, 1, 1);
        gridPane.add(eight, 1, 2, 1, 1);
        gridPane.add(nine, 2, 2, 1, 1);
        gridPane.add(sub, 3,2, 1, 1);

        gridPane.add(ten, 0, 3, 1, 1);
        gridPane.add(point, 1, 3, 1, 1);
        gridPane.add(equal, 2, 3, 1, 1);
        gridPane.add(add, 3, 3, 1, 1);
        gridPane.add(per, 3, 3, 1, 1);
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        vbox.getChildren().addAll(go,gridPane);
        Scene scene = new Scene(vbox, 200, 300);
        scene.setFill(Color.DARKRED);
        window.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args) {
        launch(args);
    }

}
//end