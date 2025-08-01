package prova;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CadastroApp {
    public static void main(String[] args) {
        Musica musica1 = new Musica(70,"Uma dose","Class A", 280, "trap");

        Musica musica2 = new Musica();
        musica2.id = 80;
        musica2.titulo = "vivaz";
        musica2.artista = "Filipe Ret";
        musica2.duracaoSeg = 300;
        musica2.genero = "trap";

        Musica musica3 = new Musica();
        musica3.id = 70;
        musica3.titulo = "Meu novo mundo";
        musica3.artista = "Charlie Brown Jr";
        musica3.duracaoSeg = 210;
        musica3.genero = "rock";
        Playlist playlist = new Playlist();

        List<Musica> listaMusicas = new ArrayList<>();
      listaMusicas.add(musica3);
      listaMusicas.add(musica1);
      listaMusicas.add(musica2);


        playlist.id = 30;
        playlist.nome = "diva";
        playlist.publica = true;
        playlist.TotalMusicas = 50;
        playlist.duracaoTotalSeg = 18000;
        playlist.dataCriacao = LocalDateTime.now();
        playlist.musicas = List.of(musica1, musica2, musica3);

      System.out.println("*** PLAYLIST ***");
      System.out.println("ID: " + playlist.id);
      System.out.println("Nome: " + playlist.nome);
      System.out.println("Publica: " + playlist.publica);
      System.out.println("TotalMusicas: " + playlist.TotalMusicas);
      System.out.println("DuracaoTotalSeg: " + playlist.duracaoTotalSeg);
      System.out.println("DataCriacao: " + playlist.dataCriacao);
               
       System.out.println("\nMusicas");

      for(Musica musica : playlist.musicas){
      System.out.println("ID: " + musica.id);
      System.out.println("Titulo: " + musica.titulo);
      System.out.println("Artista: " + musica.artista);
      System.out.println("DuracaoSeg: " + musica.duracaoSeg);
      System.out.println("Genero: " + musica.genero);
        


      }

    }
}
