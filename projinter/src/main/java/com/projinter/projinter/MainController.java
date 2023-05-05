package com.projinter.projinter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    private VBox vbox_btns;
    @FXML
    private Button btn_cadastrarVenda;
    @FXML
    private Button btn_buscarPeca;
    @FXML
    private Button btn_buscarCliente;
    @FXML
    private Button btn_buscarServico;
    @FXML
    private Button btn_relatorios;



    @FXML
    public void mudaCorBotao(MouseEvent event) {
        Button enteredButton = (Button) event.getSource();
        if (enteredButton == btn_cadastrarVenda) {
            btn_cadastrarVenda.setStyle("-fx-background-color: #f3e1b6; -fx-font-size: 22; -fx-text-fill: #23998e");
        }else if (enteredButton == btn_buscarPeca) {
            btn_buscarPeca.setStyle("-fx-background-color: #f3e1b6; -fx-font-size: 22; -fx-text-fill: #23998e");
        }else if (enteredButton == btn_buscarCliente) {
            btn_buscarCliente.setStyle("-fx-background-color: #f3e1b6; -fx-font-size: 22; -fx-text-fill: #23998e");
        }else if (enteredButton == btn_buscarServico) {
            btn_buscarServico.setStyle("-fx-background-color: #f3e1b6; -fx-font-size: 22; -fx-text-fill: #23998e");
        }else if (enteredButton == btn_relatorios) {
            btn_relatorios.setStyle("-fx-background-color: #f3e1b6; -fx-font-size: 22; -fx-text-fill: #23998e");
        }
    }

    @FXML
    public void voltaCorBotao(MouseEvent event) {
        Button exitedButton = (Button) event.getSource();
        Paint white = Color.WHITE;
        if (exitedButton == btn_cadastrarVenda) {
                btn_cadastrarVenda.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
        } else if (exitedButton == btn_buscarPeca) {
                btn_buscarPeca.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
        }else if (exitedButton == btn_buscarCliente) {
                btn_buscarCliente.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
        }else if (exitedButton == btn_buscarServico) {
                btn_buscarServico.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
        }else if (exitedButton == btn_relatorios) {
                btn_relatorios.setStyle("-fx-background-color: #23998e; -fx-font-size: 18; -fx-text-fill: white");
        }
    }

    @FXML
    public void botaoClicado(ActionEvent event) throws IOException {
        Button clickedButton = (Button) event.getSource();
        String id = clickedButton.getId();
        switch(id) {
            case "btn_cadastrarVenda":
                Stage novoStage = (Stage) btn_cadastrarVenda.getScene().getWindow();
                Parent root = FXMLLoader.load(getClass().getResource("cadastrarvenda.fxml"));
                novoStage.setTitle("Cadastrar Venda");
                novoStage.setScene(new Scene(root));
                btn_cadastrarVenda.setOpacity(100);
                break;

            case "btn_buscarPeca":
                novoStage = (Stage) btn_buscarPeca.getScene().getWindow();
                root = FXMLLoader.load(getClass().getResource("buscarpeca.fxml"));
                novoStage.setTitle("Buscar Peça");
                novoStage.setScene(new Scene(root));
                btn_buscarPeca.setOpacity(100);
                break;

            case "btn_buscarCliente":
                novoStage = (Stage) btn_buscarCliente.getScene().getWindow();
                root = FXMLLoader.load(getClass().getResource("buscarcliente.fxml"));
                novoStage.setTitle("Buscar Cliente");
                novoStage.setScene(new Scene(root));
                btn_buscarCliente.setOpacity(100);
                break;

            case "btn_buscarServico":
                novoStage = (Stage) btn_buscarServico.getScene().getWindow();
                root = FXMLLoader.load(getClass().getResource("buscarservico.fxml"));
                novoStage.setTitle("Buscar Serviço");
                novoStage.setScene(new Scene(root));
                btn_buscarServico.setOpacity(100);
                break;

            case "btn_relatorios":
                novoStage = (Stage) btn_relatorios.getScene().getWindow();
                root = FXMLLoader.load(getClass().getResource("relatorios.fxml"));
                novoStage.setTitle("Relatórios");
                novoStage.setScene(new Scene(root));
                btn_relatorios.setOpacity(100);
                break;
        }
    }

}