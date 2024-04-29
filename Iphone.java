package desafioPOO;

import desafioPOO.implementacoes.AparelhoTelefonico;
import desafioPOO.implementacoes.NavegadorInternet;
import desafioPOO.implementacoes.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private boolean tocandoMusica = false;

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica " + musica + " selecionada!");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando música!");
        tocandoMusica = true;
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada!");
        tocandoMusica = false;
    }

    @Override
    public void analisarEstadoMusica() {
        if (tocandoMusica)
            System.out.println("A musica esta tocando atualmente");
        else
            System.out.println("A musica esta pausada atualmente");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página atual");
    }

    @Override
    public void adicionarPagina() {
        System.out.println("Adicionando página...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando...");
    }

    @Override
    public void iniciarCorreioDeVoz(String msg) {
        System.out.println("Correio de voz:" + msg);
    }
}
