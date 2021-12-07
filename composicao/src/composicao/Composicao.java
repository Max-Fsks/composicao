package composicao;

public class Composicao {

    public static void main(String[] args) {
        //primeira forma
        Automovel uno = new Automovel();
        Automovel golf = new Automovel(2000, "preto");

        uno.imprimirDadosUno();

        golf.imprimirDadosGolf();

    }
}
