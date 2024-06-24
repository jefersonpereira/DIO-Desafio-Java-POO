package Iphone;

import interfaces.ReprodutorMusical;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    // Método main para testar a classe iPhone com interfaces
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();
        meuIPhone.tocar();
        meuIPhone.pausar();
        meuIPhone.selecionarMusica("A lua e eu");
        meuIPhone.ligar("123-321-1234");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();
        meuIPhone.exibirPagina("https://github.com/jefersonpereira/dio-java-basico/blob/main/Projeto-POO-Java");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}

