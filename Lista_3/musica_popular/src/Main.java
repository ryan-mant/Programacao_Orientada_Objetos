public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.nome = "Cowboy Warrior";
        musica1.duracaoSegundos = 150;
        musica1.popularidade = 70;
        musica1.gerero = "Phonk";

        Musica musica2 = new Musica();
        musica2.nome = "Vai Ter Que Superar";
        musica2.duracaoSegundos = 187;
        musica2.popularidade = 90;
        musica2.gerero = "Sertanejo";

        Album album = new Album();
        album.nome = "MusicaAleatoria";
        album.nomeArtista1 = "SXMPRA";
        album.nomeArtista2 = "Matheus & Kauan, ft. Marília Mendonça";
        album.musicas.add(musica1);
        album.musicas.add(musica2);


        Musica musicaComMaiorPopularidade = album.getMusicaMaiorPopularidade();
        Musica musicaComMenorDuracao = album.getMusicaMenorDuracao();

        System.out.println("Musica com a maior popularidade: " + musicaComMaiorPopularidade.nome);
        System.out.println("Musica com a menor duração: " + musicaComMenorDuracao.nome);

    }
}