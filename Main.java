package desafioPOO;

public class Main {
    public static void main(String[] args) {
        Iphone novoCelular = new Iphone();

//      Reprodutor Musical
        novoCelular.selecionarMusica("Tempo perdido");
        novoCelular.tocarMusica();
        novoCelular.analisarEstadoMusica();
        novoCelular.pausarMusica();
        novoCelular.analisarEstadoMusica();
        // Aparelho Telefonico
        novoCelular.ligar();
        novoCelular.desligar();
        novoCelular.iniciarCorreioDeVoz("Mensagem de voz");
        // Navegador Internet
        novoCelular.exibirPagina();
        novoCelular.adicionarPagina();
        novoCelular.atualizarPagina();



    }
}
