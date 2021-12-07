package composicao;

public class Automovel {

    private Motor motor;
    private Direcao direcao;

    public Automovel() {
        motor = new Motor();
    }

    public Automovel(int potencia) {
        motor = new Motor(potencia);

    }

    public void ligarPelaPrimeiraVez() {
        motor = new Motor();
    }

    public void ligarPelaPrimeiraVez(int potencia) {
        motor = new Motor(potencia);
    }
}
