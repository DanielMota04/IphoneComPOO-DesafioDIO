public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorDeInternet {
    @Override
    public void ligar() {
        System.out.println("Ligando o iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void inciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página no navegador");
    }

    @Override
    public void adicionarNovaPagina() {
        System.out.println("Adicionando nova página no navegador");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música escolhida");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecione a música desejada");
    }
}
