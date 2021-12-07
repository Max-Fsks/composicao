package composicao;

public class Automovel {

    private Motor motor;
    private Direcao direcao;

    public Automovel() {
        motor = new Motor();
        direcao = new Direcao();
    }

    public Automovel(int potencia, String cor) {
        motor = new Motor(potencia);
        direcao = new Direcao(cor);
    }

    void imprimirDadosUno() {
        System.out.println("---Uno---");
        System.out.println("Cor: " + direcao.getCor());
        System.out.println("Motor: " + motor.getPotencia());
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Direcao getDirecao() {
        return direcao;
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

    void imprimirDadosGolf() {
        System.out.println("---Golf---");
        System.out.println("Cor: " + direcao.getCor());
        System.out.println("Motor: " + motor.getPotencia());
    }

    public void ligarPelaPrimeiraVez() {
        motor = new Motor();
    }

    public void ligarPelaPrimeiraVez(int potencia) {
        motor = new Motor(potencia);
    }
}
