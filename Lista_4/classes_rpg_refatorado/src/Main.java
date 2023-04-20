public class Main {
    public static void main(String[] args) {
        Heroi heroi1 = new Heroi();
        heroi1.getAtaque();
        heroi1.getDefesa();
        heroi1.getPontos();

        Heroi heroi2 = new Heroi();
        heroi2.getAtaque();
        heroi2.getDefesa();
        heroi2.getPontos();

        Inimigo inimigo1 = new Inimigo();
        inimigo1.setAtaque(7);
        inimigo1.setDefesa(4);
        inimigo1.getPontos();

        Inimigo inimigo2 = new Inimigo();
        inimigo2.setAtaque(60);
        inimigo2.getDefesa();
        inimigo2.getPontos();

        Mapa mapa = new Mapa();
        mapa.inimigos.add(inimigo1);
        mapa.inimigos.add(inimigo2);
        mapa.herois.add(heroi1);
        mapa.herois.add(heroi2);

        Inimigo inimigoComMaiorAtaque = mapa.getInimigoMaiorAtaque();
        System.out.println(inimigoComMaiorAtaque.getAtaque());
    }
}