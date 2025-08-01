package aula3;

import java.util.Scanner;

public class exemplo05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    //camelCase
      String nomeAluno; 
      double nota1 = 0, nota2 = 0; 
        
    System.out.println("digite seu nome:");
      nomeAluno = input.nextLine();

    System.out.println("digite nota 1");
    nota1 = input.nextDouble();

    System.out.println("digite nota 2");
    nota2 = input.nextDouble();

    double media = (nota1 + nota2) / 2;

    System.out.println("media: " + media);

    if(media >= 6){
        System.out.println("aprovado");
        if(media == 10){
                System.out.println("parabens" + nomeAluno);
            }
    } else {
       
    System.out.println("reprovado");

}
}
}  


