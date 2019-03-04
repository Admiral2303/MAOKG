package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Lab1");
        Group mygroup = new Group();
        Scene scene = new Scene (mygroup, 480, 290);

        Polygon leftTriangle = new Polygon(78, 183, 118, 112, 86, 50);
        mygroup.getChildren().add(leftTriangle);
        leftTriangle.setFill(Color.rgb(255,0,100));

        Polygon upperPolygon = new Polygon( 86, 50, 193, 11, 224, 92, 118, 112);
        mygroup.getChildren().add(upperPolygon);
        upperPolygon.setFill(Color.rgb(0,0,255));

        Polygon upperTriangle = new Polygon( 193, 11, 224, 92, 317, 59);
        mygroup.getChildren().add(upperTriangle);
        upperTriangle.setFill(Color.rgb(255,0,128));

        Polygon rightPolygon = new Polygon(  317, 59, 224, 92, 242, 146, 341, 143);
        mygroup.getChildren().add(rightPolygon);
        rightPolygon.setFill(Color.rgb(128,128,255));

        Polygon rightTriangle = new Polygon( 242, 146, 341, 143, 191, 240);
        mygroup.getChildren().add(rightTriangle);
        rightTriangle.setFill(Color.rgb(255,0,128));

        Polygon leftPolygon = new Polygon( 191, 240, 78, 183, 118, 112, 242, 146);
        mygroup.getChildren().add(leftPolygon);
        leftPolygon.setFill(Color.rgb(255,255,255));

        scene.setFill(Color.rgb(128, 128, 66));

        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}