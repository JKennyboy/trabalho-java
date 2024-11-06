package petshop3;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.SplitMenuButton;

public class FXMLTelaController implements Initializable {

    @FXML
    private Button Botao_Excluir;
    @FXML
    private Button Botao_Mais;
    @FXML
    private Button Botao_Cancelar;
    @FXML
    private Button Botao_Adicionar;
    @FXML
    private Button Botao_Pesquisar;
    @FXML
    private Button Botao_Salvar;
    @FXML
    private Button Botao_Sair;
    @FXML
    private Button Botao_Editar;
    @FXML
    private SplitMenuButton Botao_Escolha1;

    private String estadoFormulario = "inicial"; 

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("Inicializando a tela.");
        atualizarBotoes(); // Chama a função ao iniciar
    }    

    @FXML
    private void handleAdicionar() {
        System.out.println("Adicionando novo item.");
        estadoFormulario = "editando";
        atualizarBotoes();
        // Limpa os campos para adicionar um novo produto
    }

    @FXML
    private void handleSalvar() {
        System.out.println("Salvando os dados.");
        estadoFormulario = "adicionado";
        atualizarBotoes();
        // Lógica para salvar os dados
    }

    @FXML
    private void handleCancelar() {
        System.out.println("Cancelando a edição.");
        estadoFormulario = "inicial";
        atualizarBotoes();
        // Lógica para cancelar a edição
    }

    @FXML
    private void handleExcluir() {
        System.out.println("Excluindo item.");
        estadoFormulario = "excluindo";
        atualizarBotoes();
        // Lógica para excluir o produto
    }

    @FXML
    private void handleSair() {
        System.out.println("Saindo do aplicativo.");
        // Lógica para sair do aplicativo
    }

    @FXML
    private void handleEditar() {
        System.out.println("Editando item.");
        estadoFormulario = "editando";
        atualizarBotoes();
        // Lógica para editar o produto
    }

    @FXML
    private void handleMais() {
        System.out.println("Ação adicional selecionada.");
        estadoFormulario = "editando";
        atualizarBotoes();
        // Lógica para ação adicional
    }

    @FXML
    private void handlePesquisar() {
        System.out.println("Pesquisando item.");
        estadoFormulario = "editando";
        atualizarBotoes();
        // Lógica para pesquisar um produto
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
                Botao_Adicionar.setDisable(false);
                Botao_Salvar.setDisable(true);
                Botao_Cancelar.setDisable(true);
                Botao_Excluir.setDisable(false);
                Botao_Editar.setDisable(false);
                Botao_Mais.setDisable(false);
                Botao_Pesquisar.setDisable(false);
                Botao_Escolha1.setDisable(false);
                Botao_Sair.setDisable(false);
                break;

            case "editando":
                Botao_Adicionar.setDisable(true);
                Botao_Salvar.setDisable(false);
                Botao_Cancelar.setDisable(false);
                Botao_Excluir.setDisable(true);
                Botao_Editar.setDisable(true);
                Botao_Mais.setDisable(true);
                Botao_Pesquisar.setDisable(true);
                Botao_Escolha1.setDisable(true);
                Botao_Sair.setDisable(false);
                break;

            case "adicionado":
                Botao_Adicionar.setDisable(false);
                Botao_Salvar.setDisable(true);
                Botao_Cancelar.setDisable(true);
                Botao_Excluir.setDisable(false);
                Botao_Editar.setDisable(false);
                Botao_Mais.setDisable(false);
                Botao_Pesquisar.setDisable(false);
                Botao_Escolha1.setDisable(false);
                Botao_Sair.setDisable(false);
                break;

            case "excluindo":
                Botao_Adicionar.setDisable(true);
                Botao_Salvar.setDisable(true);
                Botao_Cancelar.setDisable(false);
                Botao_Excluir.setDisable(true);
                Botao_Editar.setDisable(true);
                Botao_Mais.setDisable(true);
                Botao_Pesquisar.setDisable(true);
                Botao_Escolha1.setDisable(true);
                Botao_Sair.setDisable(false);
                break;
        }
    }
}
