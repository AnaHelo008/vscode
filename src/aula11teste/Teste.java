package aula11teste;

import aula11encapsulamwnto.*;;

public class Teste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
       p.setIdade(17);
       p.setNome ("Carolina");

       System.out.println("Nome: " + p.getNome());
       System.out.println("Idade: " + p.getIdade());
    

    }
}

    
