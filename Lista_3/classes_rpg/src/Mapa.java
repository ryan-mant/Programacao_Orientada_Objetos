import java.util.ArrayList;

public class Mapa {

    String nome;
    int altura;
    int largura;
    ArrayList<Inimigo> inimigos = new ArrayList<>();
    ArrayList<Heroi> herois = new ArrayList<>();

    public Inimigo getInimigoMaiorAtaque(){
        int maiorPontos = 0;
        int index = 0;
        for (int i = 0; i < inimigos.size(); i++) {
            if (inimigos.get(i).ataque > maiorPontos){
                maiorPontos = inimigos.get(i).ataque;
                index = i;
            }
        }
        return inimigos.get(index);
    }
}
