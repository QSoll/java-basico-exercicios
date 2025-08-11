public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void ligar() {
        System.out.println("iPhone ligado.");
    }

    public void desligar() {
        System.out.println("iPhone desligado.");
    }

    // ReprodutorMusical
    public void tocarMusica(String faixa) {
        System.out.println("Tocando: " + faixa);
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void ajustarVolume(int nivel) {
        System.out.println("Volume ajustado para: " + nivel);
    }

    // AparelhoTelefonico
    public void fazerChamada(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    public void receberChamada() {
        System.out.println("Chamada recebida.");
    }

    public void enviarMensagem(String texto) {
        System.out.println("Mensagem enviada: " + texto);
    }

    // NavegadorInternet
    public void abrirPagina(String url) {
        System.out.println("Abrindo página: " + url);
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    public void adicionarFavorito(String url) {
        System.out.println("Favorito adicionado: " + url);
    }
}
