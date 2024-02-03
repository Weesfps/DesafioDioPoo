package Smartphone;

public class iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private boolean musicaTocando;
    private String musicaAtual;
    private boolean ligado;
    private boolean chamadaAtiva;
    private boolean emNavegacao;
    private String paginaAtual;

    @Override
    public void tocar() {
        if (!ligado) {
            System.out.println("Não é possível tocar música, o iPhone está desligado.");
            return;
        }
        musicaTocando = true;
        System.out.println("Tocando música.");
    }

    @Override
    public void pausar() {
        if (!musicaTocando) {
            System.out.println("Não há música tocando para pausar.");
            return;
        }
        musicaTocando = false;
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        if (!ligado) {
            System.out.println("Não é possível selecionar música, o iPhone está desligado.");
            return;
        }
        musicaAtual = musica;
        System.out.println("Selecionada a música: " + musica);
    }

    @Override
    public void ligar(String numero) {
        if (ligado) {
            System.out.println("O iPhone já está ligado.");
            return;
        }
        ligado = true;
        System.out.println("iPhone ligado. Discando para " + numero);
    }

    @Override
    public void atender() {
        if (!ligado) {
            System.out.println("Não é possível atender chamada, o iPhone está desligado.");
            return;
        }
        chamadaAtiva = true;
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        if (!ligado) {
            System.out.println("Não é possível iniciar correio de voz, o iPhone está desligado.");
            return;
        }
        System.out.println("Correio de voz iniciado.");
    }

    @Override
    public void exibirPagina(String url) {
        if (!ligado) {
            System.out.println("Não é possível exibir página, o iPhone está desligado.");
            return;
        }
        emNavegacao = true;
        paginaAtual = url;
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        if (!emNavegacao) {
            System.out.println("Não é possível adicionar nova aba, não há navegação ativa.");
            return;
        }
        System.out.println("Nova aba adicionada com página: " + url);
    }

    @Override
    public void atualizarPagina() {
        if (!emNavegacao) {
            System.out.println("Não é possível atualizar página, não há navegação ativa.");
            return;
        }
        System.out.println("Página atualizada.");
    }

   
}
