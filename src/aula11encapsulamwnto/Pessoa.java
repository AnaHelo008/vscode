package aula11encapsulamwnto;

public class Pessoa {
    private String nome;
    private int idade;
    public String getNome() {
       return nome;
    }

    public void setNome(String nome) {
       this.nome = nome;
    }

    public int getIdade() {
       return idade;
    }

    public void setIdade(int idade) {
      if(idade < 0){
         System.out.println("Valor inválido!");

      }else{
       this.idade = idade;
    }

   }


}

   
    