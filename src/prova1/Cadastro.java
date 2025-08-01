package prova1;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import prova.Musica;
import prova.Playlist;

public class Cadastro {
    
    public static void main(String[] args) {

    Transacao transacoes1 = new Transacao (40,"corrente", 45.00, LocalDateTime.now(), "finalizada");

    Transacao transacoes2 = new Transacao();
        transacoes2.id = 860;
        transacoes2.tipo = "poupança";
        transacoes2.valor = 90000;
        transacoes2.dataHora = LocalDateTime.now();
        transacoes2.status = "finalizada";
        
        Transacao transacoes3 = new Transacao();
        transacoes3.id = 20;
        transacoes3.tipo = "corrente";
        transacoes3.valor = 1000000;
        transacoes3.dataHora = LocalDateTime.now();
        transacoes3.status = "finalizada";
        
         ContaBancaria contaBancaria = new ContaBancaria();

         List<Transacao> listatransacoes = new ArrayList<>();
         listatransacoes.add(transacoes3);
         listatransacoes.add(transacoes1);
         listatransacoes.add(transacoes2);
 

      contaBancaria.id = 30;
      contaBancaria.titular = "Magaly";
      contaBancaria.numero = "98083639";
      contaBancaria.agencia = "50";
      contaBancaria.saldo = 18000;
      contaBancaria.limite = 879000;
      contaBancaria.tipo = "saque";
      contaBancaria.transacoes = List.of(transacoes3, transacoes1, transacoes2);

    System.out.println("*** CONTABANCARIA ***");
    System.out.println("ID: " + contaBancaria.id);
    System.out.println("Titular: " + contaBancaria.titular);
    System.out.println("Numero: " + contaBancaria.numero);
    System.out.println("Agencia: " + contaBancaria.agencia);
    System.out.println("Saldo: " + contaBancaria.saldo);
    System.out.println("Limite: " + contaBancaria.limite);
    System.out.println("Tipo: " + contaBancaria.tipo);
    System.out.println("Transacoes: " + contaBancaria.transacoes);
             
     System.out.println("\ntransacoes");

    for(Transacao transacao : contaBancaria.transacoes){
    System.out.println("ID: " + transacao.id);
    System.out.println("Tipo: " + transacao.tipo);
    System.out.println("Valor: " + transacao.valor);
    System.out.println("DataHora: " + transacao.dataHora);
    System.out.println("Status: " + transacao.status);
    }
}

}
