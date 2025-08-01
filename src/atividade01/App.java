package atividade01;

public class App {
     public static void main(String[] args) {
      
        Produto p1 = new Produto();
        Produto p2 = new Produto();
        Produto p3 = new Produto();
        
        p1.id= 10;
        p1.nome = "carne";
        p1.descricao = "carne vermelha";
        p1.codigoBarras = "18293638";
        p1.valor = 45;

        p2.id= 25;
        p2.nome = "gloss";
        p2.descricao = "gloss da Franciny";
        p2.codigoBarras = "12345678";
        p2.valor = 65.00;

        p3.id= 25;
        p3.nome = "feijão";
        p3.descricao = "feijão tropeiro";
        p3.codigoBarras = "1234567890";
        p3.valor = 7.75;
        

    System.out.println("produto1: ");
    System.out.println("ID: " + p1.id);
    System.out.println("Nome: " + p1.nome);
    System.out.println("Descricao: " + p1.descricao);
    System.out.println("codigoBarras: " + p1.codigoBarras);
    System.out.println("Valor: " + p1.valor);

    System.out.println("produto2: ");
    System.out.println("ID: " + p2.id);
    System.out.println("Nome: " + p2.nome);
    System.out.println("Descricao: " + p2.descricao);
    System.out.println("codigoBarras: " + p2.codigoBarras);
    System.out.println("Valor: " + p2.valor);

    System.out.println("produto3: ");
    System.out.println("ID: " + p3.id);
    System.out.println("Nome: " + p3.nome);
    System.out.println("Descricao: " + p3.descricao);
    System.out.println("codigoBarras: " + p3.codigoBarras);
    System.out.println("Valor: " + p3.valor);






     }
}
