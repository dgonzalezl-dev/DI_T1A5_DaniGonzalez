/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class Eventos2 extends Application {
    Button bt1 = new Button("Nuevo");
    Button bt2 = new Button("abrir");
    Button bt3 = new Button("Guardar");
    Button bt4 = new Button("Imprimir");
    
    @Override
    public void start(Stage primaryStage) {
        FlowPane flow=new FlowPane();
        
        flow.getChildren().addAll(bt1);
        bt1.setOnAction(new Nuevo());
        bt2.setOnAction(new Nuevo());
        bt3.setOnAction(new Nuevo());
        bt4.setOnAction(new Nuevo());
        flow.getChildren().addAll(bt2);
        flow.getChildren().addAll(bt3);
        flow.getChildren().addAll(bt4);
        
        Scene scene = new Scene(flow, 200, 150);
        primaryStage.setTitle("Eventos2");
        primaryStage.setScene(scene); 
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    class Nuevo implements EventHandler<ActionEvent> {
            @Override
            public void handle(ActionEvent e) {
                Object fuente= e.getSource();
                if(fuente.equals(bt1)){
                    System.out.println("Nuevo proyecto");
                }
                if(fuente.equals(bt2)){
                    System.out.println("Abrir proyecto");
                }
                if(fuente.equals(bt3)){
                    System.out.println("Guardar proyecto");
                }
                if(fuente.equals(bt4)){
                    System.out.println("Imprimir proyecto");
                }
            }
    }
}