
package composicao;


public class Composicao {
    
    public static void main(String[] args) {
        //primeira forma
        Automovel uno = new Automovel();
        Automovel golf = new Automovel(2000);
        
        //segunda forma
        Automovel carro = new Automovel();
        carro.ligarPelaPrimeiraVez();
        carro.ligarPelaPrimeiraVez(1600);
        
        //terceira forma
        Automovel moto = new Automovel();
        Motor motor = new Motor();
        Motor motor2 = new Motor(1600);
        
       
    }
}
