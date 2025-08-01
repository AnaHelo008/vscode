package prova;

import java.time.LocalDateTime;
import java.util.List;

public class Playlist {
    int id;
    String nome;
    boolean publica;
    int TotalMusicas;
    int duracaoTotalSeg;
    LocalDateTime dataCriacao;
    List<Musica> musicas;

    public Playlist (){
        System.out.println("chamou o contrutor vazio:");
    }
    
    public Playlist (String nome){
        this.nome = nome; 
    }
    
    public Playlist (int id, String nome, boolean publica, int totalMusicas, int duracaoTotalseg, LocalDateTime dataCriacao, List<Musica> musicas) {
        this.id = id;
        this.nome = nome;
        this.publica = publica;
        this.TotalMusicas =  totalMusicas;
        this.duracaoTotalSeg = duracaoTotalseg;
        this.dataCriacao = dataCriacao;
        this.musicas = musicas;
       
    }
}
