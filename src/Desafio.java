// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 

import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       // System.out.println("Digite: ");
        String palavra = sc.nextLine();
        String palindromo = new StringBuilder(palavra).reverse().toString();
      boolean teste = false;


        if (palavra.equals(palindromo)){
            System.out.println("TRUE");

        }

        else {
            System.out.println("FALSE");
        }


        //TODO: Retorne TRUE ou FALSE, caso a "palavra" seja ou não um Palíndromo.
    }
}