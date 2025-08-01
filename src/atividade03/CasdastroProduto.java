package atividade03;


public class CasdastroProduto {
      public static void main(String[] args) {
         Produto produto1 = new Produto(12345, "arroz", "carreteiro", "54321", 10.0); 
         Produto produto2 = new Produto(123456789, "feijao", "preto", "987654321", 8.0); 
         
        
        Produto produto3 = new Produto(); 
        produto3.id = 13;
        produto3.nome = "gloss";
        produto3.descricao = "transparente";
        produto3.codigoBarras = "098768";
        produto3.nome = "40.0";

    
        
        
				
        System.out.println("===== PRODUTO 01 =====");
        produto1.imprimirDados();

        System.out.println("===== PRODUTO 02 =====");
        produto2.imprimirDados();
        
        System.out.println("===== PRODUTO 03 =====");
        produto3.imprimirDados();
    }
    
}
