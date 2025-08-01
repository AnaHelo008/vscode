package aula07;

//classe DNA
//objetivo definir a estrutura 

public class Aluno {
    public int id;
    public String nome;
    public String matricula;
    public int idade;
    
    
    //declarando explicidamente o metodo construtor vazio
    //alem de criar objeto, executa o codigo contido no blocoffffffffffffff
    public Aluno (){
        System.out.println("chamou o contrutor vazio:");
    }
    
    public Aluno(String nome){
        this.nome = nome; 
    }
    
    public Aluno(int id, String nome, String matricula, int idade) {
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }
    
    
    // assinatura
    // protecao + retirno + nome + parametros 
    public void imprimirDados(){
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Idade: " + idade);
        
    }
    //sobrecarda de metodos = repetição de mesma assinatura 
    //mudando somento o parametro 
    public void impimirDados(int ordem){
        System.out.println("Aluno: " + ordem);
        imprimirDados();
 } 
}
