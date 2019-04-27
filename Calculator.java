import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.Random;


public class Calculator extends Application  {
    private Stage window;

    TextField guessField = new TextField();
    int counter = 0;
    int numberHaveToGuess = -1;

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        guessField.setPromptText("Please Press the New Game Button!");

        Button btnNewGame = new Button("New Game");
        btnNewGame.setOnAction(actionEvent ->{
            gameSetup();
        });

        Button btnGuess = new Button("Guess");
        btnGuess.setOnAction(actionEvent -> {
            guessingGamePlay();
        });



        VBox root = new VBox();
        root.getChildren().addAll(guessField, new HBox(btnNewGame, btnGuess));

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello....!");
        primaryStage.setScene(scene);
        primaryStage.show();

        btnNewGame.requestFocus();
    }


    public static void main(String[] args) {
        launch(args);
    }


    public void gameSetup()
    {
        guessField.setPromptText("Enter your guess");//here I set guessField to zero
        counter = 0;


        Random random = new Random();
        numberHaveToGuess = random.nextInt(100) + 1;

        System.out.println("Number to guess: " + numberHaveToGuess);
    }

    public void guessingGamePlay()
    {
        int guess = Integer.parseInt(guessField.getText());

        if(counter == 5)
        {
            System.out.println("Game over! You lose!");
            guessField.setPromptText("Game over! You lose!");
            guessField.setText("");
        }
        else{
            if(guess == numberHaveToGuess)
            {
                System.out.println("You win");
                guessField.setPromptText("Your guess of " + guess + " is correct !");
                guessField.setPromptText(" You win!");
                guessField.setText("");
            }
            else if(guess < numberHaveToGuess)
            {
                System.out.println("You guessed to low");
                guessField.setPromptText("Your guessed is to low! ohh..Try again.");
                guessField.setText("");
                counter++;
            }
            else
            {
                System.out.println("You guessed to high! Try again.");
                guessField.setPromptText("Your guessed is to high!ohh.. Try again.");
                guessField.setText("");
                counter++;
            }
        }
    }
}
