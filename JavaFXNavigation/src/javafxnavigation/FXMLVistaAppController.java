/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javafxnavigation;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author ivanostr.
 */
public class FXMLVistaAppController implements Initializable {
    
    @FXML
    private Pane showContent;
    @FXML
    private Button menu_results;
    @FXML
    private Button menu_work;
    @FXML
    private Button menu_settings;
    @FXML
    private Button menu_sign_out;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       try {
           loadVistaProblemas();
           
       } catch (IOException e) {
           System.out.println("ERROR Vista App" + e);
       }
    }    
    /* Cargar vista Problemas */
    private void loadVistaProblemas() throws IOException {
        Pane newLoadedPane = (Pane) FXMLLoader.load(getClass().getResource("FXMLVistaAppProblemas.fxml"));
        showContent.getChildren().add(newLoadedPane);
        
    }
    /* Cargar vista Resultados */
    private void loadVistaResultados() throws IOException {
        Pane newLoadedPane = (Pane) FXMLLoader.load(getClass().getResource("FXMLVistaAppResultados.fxml"));
        showContent.getChildren().add(newLoadedPane);
    }
    /* Cargar vista Ajustes */
    private void loadVistaAjustes() throws IOException {
//        Pane newLoadedPane = (Pane) FXMLLoader.load(getClass().getResource("FXMLVistaAppProblemas.fxml"));
//        showContent.getChildren().add(newLoadedPane);
        
    }
    /* Cerrar sesion */
    private void loadVistaCerrarSesion() throws IOException {
//        Pane newLoadedPane = (Pane) FXMLLoader.load(getClass().getResource("FXMLVistaAppResultados.fxml"));
//        showContent.getChildren().add(newLoadedPane);
    }
    
    @FXML
    private void menuNavigationProblemas(ActionEvent event) throws IOException {
        loadVistaProblemas();
//        menu_work.getStyleClass().add("active_menu");
    }
    @FXML
    private void menuNavigationResultados(ActionEvent event) throws IOException {
        loadVistaResultados();
//        menu_work.getStyleClass().add("active_menu");
    }
    @FXML
    private void menuNavigationAjustes(ActionEvent event) throws IOException {
        loadVistaAjustes();
//          menu_work.getStyleClass().add("active_menu");
    }
    @FXML
    private void menuNavigationCerrarSesion(ActionEvent event) throws IOException {
        loadVistaCerrarSesion();
//          menu_work.getStyleClass().add("active_menu");
    }
}
