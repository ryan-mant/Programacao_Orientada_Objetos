import java.util.ArrayList;

public class Album {
    private String nome;
    private String nomeArtista1;
    private String nomeArtista2;
    public Album(){

    }
    public Album(String nome, String nomeArtista1, String nomeArtista2){
        this.nome = nome;
        this.nomeArtista1 = nomeArtista1;
        this.nomeArtista2 = nomeArtista2;
    }
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNomeArtista1() {
        return this.nomeArtista1;

    }
    public void setNomeArtista1(String nomeArtista1) {
        this.nomeArtista1 = nomeArtista1;
    }
    public String getNomeArtista2() {
        return this.nomeArtista2;
    }
    public void setNomeArtista2(String nomeArtista2) {
        this.nomeArtista2 = nomeArtista2;
    }
    ArrayList<Musica>  musicas = new ArrayList<>();

    public Musica getMusicaMaiorPopularidade(){
        int MaiorPopularidade = 0;
        int index = 0;
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).getPopularidade() > MaiorPopularidade){
                MaiorPopularidade = musicas.get(i).getPopularidade();
                index = i;
            }
        }
        return musicas.get(index);

    }
    public Musica getMusicaMenorDuracao(){
        int MenorDuracao = 600;
        int index = 0;
        for (int i = 0; i < musicas.size(); i++) {
            if (musicas.get(i).getDuracaoSegundos() < MenorDuracao){
                MenorDuracao = musicas.get(i).getDuracaoSegundos();
                index = i;
            }
        }
        return musicas.get(index);
    }
}
