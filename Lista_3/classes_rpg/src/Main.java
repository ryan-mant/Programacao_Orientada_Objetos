public class Main {
    public static void main(String[] args) {
        Heroi heroi1 = new Heroi();
        heroi1.ataque = 6;
        heroi1.defesa = 9;
        heroi1.pontos = 15;

        Heroi heroi2 = new Heroi();
        heroi2.ataque = 8;
        heroi2.defesa = 4;
        heroi2.pontos = 12;

        Inimigo inimigo1 = new Inimigo();
        inimigo1.ataque = 7;
        inimigo1.defesa = 4;
        inimigo1.pontos = 11;

        Inimigo inimigo2 = new Inimigo();
        inimigo2.ataque = 4;
        inimigo2.defesa = 6;
        inimigo2.pontos = 10;

        Mapa mapa = new Mapa();
        mapa.inimigos.add(inimigo1);
        mapa.inimigos.add(inimigo2);
        mapa.herois.add(heroi1);
        mapa.herois.add(heroi2);

        Inimigo inimigoComMaiorAtaque = mapa.getInimigoMaiorAtaque();
        System.out.println(inimigoComMaiorAtaque.ataque);
    }
}