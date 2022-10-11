package ex9;

public class Exercicio9 {

public static void main(String[] args) {
        
    }

    public Double calculadoraAbs(Double qtdLitros, Double precolitros, Double precototal) {
        if(qtdLitros == null || precolitros == null) {
            System.out.println("Valores nulos: ");
        } else {
            precototal = qtdLitros * precolitros;
        }
        return precototal;
        
    }
    
}
