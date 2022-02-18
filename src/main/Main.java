package main;

import control.VentanaA;
import control.VentanaB;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Carro;

public class Main extends Application{
	
	public static void main (String []args) {
		launch();
	}

	@Override
	public  void start(Stage primaryStage) throws Exception {

		FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/VentanaA.fxml"));
		loader.setController(new VentanaA());
		Parent parent =(Parent)loader.load();
		
		Stage stage =new Stage();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.show();
		
		

		Carro c1 = new Carro("alfa", "1");
		Carro c2 = new Carro("beta", "2");
		Carro c3 = new Carro("gamma", "3");
		
		System.out.println(c1.marca);
		System.out.println(c2.marca);
		System.out.println(c3.marca);
		
		System.out.println("numero: "+c1.numCarros);
		System.out.println("numero: "+c2.numCarros);
		System.out.println("numero: "+c3.numCarros);
		
		
	}
	
	public static void correrVentanaB()throws Exception{
		FXMLLoader loader = new FXMLLoader(Main.class.getResource("../ui/VentanaA.fxml"));
		loader.setController(new VentanaA());
		Parent parent =(Parent)loader.load();
		
		Stage stage =new Stage();
		Scene scene = new Scene(parent);
		stage.setScene(scene);
		stage.show();
		
	}
	
	


}
