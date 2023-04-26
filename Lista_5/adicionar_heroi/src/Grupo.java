import java.util.ArrayList;

public class Grupo {
    private int totalDeMoedas;
    private ArrayList<Heroi> herois;
    public Grupo(){
        this.herois = new ArrayList<>();
    }
    public void adicionarHeroi(Heroi heroi){
        int i = 0;
        while (i < herois.size()) {
            i++;
            if (heroi.getId() == i){
                System.out.println("O herói ja foi adicionado ao grupo");
                return;
            }
        }
        this.herois.add(heroi);
        this.totalDeMoedas = this.totalDeMoedas + heroi.getQuantidadeMoedasDeOuro();
        System.out.println("O herói " + heroi.getNome() + " foi adicionado no grupo" );
    }
    public void removerHeroi(int idHeroi){
        for (int i = 0; i < herois.size(); i++) {
            if (herois.get(i).getId() == idHeroi){
                this.totalDeMoedas = totalDeMoedas - herois.get(i).getQuantidadeMoedasDeOuro();
                System.out.println("O herói " + herois.get(i).getNome() + " foi removido!");
                herois.remove(i);
                return;
            }
        }
        System.out.println("Herói não encontrado!, verifique se digitou corretamente...");
    }

    public int getTotalDeMoedas() {
        return totalDeMoedas;
    }

    public void setTotalDeMoedas(int totalDeMoedas) {
        this.totalDeMoedas = totalDeMoedas;
    }

    public ArrayList<Heroi> getHerois() {
        return herois;
    }

    public void setHerois(ArrayList<Heroi> herois) {
        this.herois = herois;
    }

}
