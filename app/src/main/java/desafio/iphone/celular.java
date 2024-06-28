package desafio.iphone;

import desafio.interfaces.AparelhoTelefonico;
import desafio.interfaces.Navegador;
import desafio.interfaces.ReprodutorMusical;

public class celular implements AparelhoTelefonico, Navegador, ReprodutorMusical {
    public static void main(String[] args) {
        celular celular = new celular();
        celular.ligar();
        celular.atender();
        celular.iniciarCorreioVoz();
        celular.exibirPagina();
        celular.adicionarNovaAba();
        celular.atualizarPagina();
        celular.tocar();
        celular.pausar();
        celular.selecionarMusica();
    }

    @Override
    public void tocar() {
        System.out.println("Musica tocando!");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo Pagina!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina atualizada!");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando!");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz!");
    }
}
