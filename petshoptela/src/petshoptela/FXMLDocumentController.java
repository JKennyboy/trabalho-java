package Petshoptela;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Button SALVAR;
    @FXML
    private Button EDITAR;
    @FXML
    private Button ADICIONAR;
    @FXML
    private Button EXCLUIR;
    @FXML
    private Button CANCELAR;
    @FXML
    private Button SAIR;
    @FXML
    private SplitMenuButton Botao_Escolha1;

    private String estadoFormulario = "inicial"; 

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Inicializando a tela.");
        atualizarBotoes(); // Chama a função ao iniciar
    }    

    @FXML
    private void handleADICIONAR() {
        System.out.println("Adicionando novo item.");
        estadoFormulario = "editando";
        atualizarBotoes();
        // Limpa os campos para adicionar um novo produto
    }

    @FXML
    private void handleSALVAR() {
        System.out.println("Salvando os dados.");
        estadoFormulario = "adicionado";
        atualizarBotoes();
        // Lógica para salvar os dados
    }

    @FXML
    private void handleCANCELAR() {
        System.out.println("Cancelando a edição.");
        estadoFormulario = "inicial";
        atualizarBotoes();
        // Lógica para cancelar a edição
    }

    @FXML
    private void handleEXCLUIR() {
        System.out.println("Excluindo item.");
        estadoFormulario = "excluindo";
        atualizarBotoes();
        // Lógica para excluir o produto
    }

    @FXML
    private void handleSAIR() {
        System.out.println("Saindo do aplicativo.");
        // Lógica para sair do aplicativo
    }

    @FXML
    private void handleEDITAR() {
        System.out.println("Editando item.");
        estadoFormulario = "editando";
        atualizarBotoes();
        // Lógica para editar o produto
    }

    @FXML
    private void handleEscolha1() {
        System.out.println("Escolha no menu selecionada.");
        estadoFormulario = "editando";
        atualizarBotoes();
        // Lógica para escolher uma opção no menu
    }

    private void atualizarBotoes() {
        System.out.println("Atualizando botões. Estado atual: " + estadoFormulario);
        switch (estadoFormulario) {
            case "inicial":
                ADICIONAR.setDisable(false);
                SALVAR.setDisable(true);
                CANCELAR.setDisable(true);
                EXCLUIR.setDisable(false);
                EDITAR.setDisable(false);
                Botao_Escolha1.setDisable(false);
                SAIR.setDisable(false);
                break;

            case "editando":
                ADICIONAR.setDisable(true);
                SALVAR.setDisable(false);
                CANCELAR.setDisable(false);
                EXCLUIR.setDisable(true);
                EDITAR.setDisable(true);
                Botao_Escolha1.setDisable(true);
                SAIR.setDisable(false);
                break;

            case "adicionado":
                ADICIONAR.setDisable(false);
                SALVAR.setDisable(true);
                CANCELAR.setDisable(true);
                EXCLUIR.setDisable(false);
                EDITAR.setDisable(false);
                Botao_Escolha1.setDisable(false);
                SAIR.setDisable(false);
                break;

            case "excluindo":
                ADICIONAR.setDisable(true);
                SALVAR.setDisable(true);
                CANCELAR.setDisable(false);
                EXCLUIR.setDisable(true);
                EDITAR.setDisable(true);
                Botao_Escolha1.setDisable(true);
                SAIR.setDisable(false);
                break;
        }
    }
}
