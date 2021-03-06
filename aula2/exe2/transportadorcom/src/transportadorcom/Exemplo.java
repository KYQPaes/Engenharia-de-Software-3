package transportadorcom;

import java.util.Scanner;
public class Exemplo {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)){
            
            System.out.println("Informe a distância:");
            
            int distancia = entrada.nextInt();
            System.out.print("Qual o tipo de frete (1)Normal (2)Sedex (3)Sedex10:");
            int opcaoFrete = entrada.nextInt();
            
            TipoFrete tipoFrete = TipoFrete.values() [opcaoFrete-1];
            Frete frete = tipoFrete.obterFrete();
            double preco = frete.calcularPreco(distancia);
            System.out.printf("O valor total é de R$%.2f", preco);
            
            
        }
    }
    
}
