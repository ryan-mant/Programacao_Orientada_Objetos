import java.util.ArrayList;

public class Album {
    String nome;
    String nomeArtista1;
    String nomeArtista2;
    ArrayList<Musica>  musicas = new ArrayList<>();

    public Musica getMusicaMaiorPopularidade(){
        int MaiorPopularidade = 0;
        int index = 0;
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).popularidade > MaiorPopularidade){
                MaiorPopularidade = musicas.get(i).popularidade;
                index = i;
            }
        }
        return musicas.get(index);

    }
    public Musica getMusicaMenorDuracao(){
        int MenorDuracao = 600;
        int index = 0;
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).duracaoSegundos < MenorDuracao){
                MenorDuracao = musicas.get(i).duracaoSegundos;
                index = i;
            }
        }
        return musicas.get(index);
    }
}
