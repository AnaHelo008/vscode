package aula07;

public class App {
public static void main(String[] args) {
    //invocando os metodos contrutores 
    //para criação dos objetos
    Aluno aluno1 = new Aluno();
    Aluno aluno2 = new Aluno();
    Aluno aluno3 = new Aluno();


    aluno1.id = 10;
    aluno1.nome = "helo";
    aluno1.matricula = "202310070014";
    aluno1.idade = 17;

    aluno2.id = 12;
    aluno2.nome = "maga";
    aluno2.matricula = "202389755";
    aluno2.idade = 60;

    aluno3.id = 23;
    aluno3.nome = "miguel";
    aluno3.matricula = "20289719378";
    aluno3.idade = 8;


    Aluno aluno4 = aluno3; 
    Aluno aluno5 = aluno3;

      
   //imprimir dados 
   aluno1.impimirDados(1);
   aluno2.impimirDados(2);
   aluno3.impimirDados(3);
}
    
}
