public class Inimigo {
    private int ataque;
    private int defesa;
    private int pontos;
    public Inimigo(int ataque, int defesa, int pontos) {
        this.ataque = ataque;
        this.defesa = defesa;
        this.pontos = pontos;
    }
    public Inimigo() {

    }
    public int getAtaque(){
        return this.ataque;
    }
    public void setAtaque(int ataque){
        this.ataque = ataque;
    }

    public int getDefesa(){
        return this.defesa;
    }
    public void setDefesa(int defesa){
        this.defesa = defesa ;
    }
    public int getPontos(){
        return this.pontos;
    }
    public void setPontos(int pontos){
        this.pontos = pontos;
    }
}
