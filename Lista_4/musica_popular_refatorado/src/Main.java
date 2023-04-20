public class Main {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.setNome("Cowboy Warrior");
        musica1.setDuracaoSegundos(150);
        musica1.setPopularidade(70);
        musica1.setGerero("Phonk");

        Musica musica2 = new Musica();
        musica2.setNome("Vai Ter Que Superar");
        musica2.setDuracaoSegundos(187);
        musica2.setPopularidade(90);
        musica2.setGerero("Sertanejo");

        Album album = new Album();
        album.setNome("MusicaAleatoria");
        album.setNomeArtista1("SXMPRA");
        album.setNomeArtista2("Matheus & Kauan, ft. Marília Mendonça");
        album.musicas.add(musica1);
        album.musicas.add(musica2);


        Musica musicaComMaiorPopularidade = album.getMusicaMaiorPopularidade();
        Musica musicaComMenorDuracao = album.getMusicaMenorDuracao();

        System.out.println("Musica com a maior popularidade: " + musicaComMaiorPopularidade.getNome());
        System.out.println("Musica com a menor duração: " + musicaComMenorDuracao.getNome());

    }
}