import games.Game;
import games.MeshGame;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class StartGame extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Game game = new MeshGame();
        Node gameView = game.getGameView();

        BorderPane borderPane = new BorderPane(gameView);
        primaryStage.setScene(new Scene(borderPane));
        primaryStage.setOnCloseRequest(event -> System.exit(0));
        primaryStage.show();

        game.start();
    }
}