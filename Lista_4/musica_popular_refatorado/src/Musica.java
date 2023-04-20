public class Musica {
    private String nome;
    private int duracaoSegundos;
    private int popularidade;
    private String gerero;

    public Musica(){

    }
    public Musica(String nome, int duracaoSegundos, int popularidade, String gerero){
        this.nome = nome;
        this.duracaoSegundos = duracaoSegundos;
        this.popularidade = popularidade;
        this.gerero = gerero;

    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracaoSegundos() {
        return this.duracaoSegundos;
    }

    public void setDuracaoSegundos(int duracaoSegundos) {
        this.duracaoSegundos = duracaoSegundos;
    }

    public int getPopularidade() {
        return this.popularidade;
    }

    public void setPopularidade(int popularidade) {
        this.popularidade = popularidade;
    }

    public String getGerero() {
        return this.gerero;
    }

    public void setGerero(String gerero) {
        this.gerero = gerero;
    }
}
