package aula11encapsulamwnto;

public class Teste2 {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
       p.setIdade(-10);
       p.setNome ("Heloisa Brasil");

       System.out.println("Nome: " + p.getNome());
       System.out.println("Idade: " + p.getIdade());
    

    }
}
