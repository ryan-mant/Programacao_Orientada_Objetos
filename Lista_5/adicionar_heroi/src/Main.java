public class Main {
    public static void main(String[] args) {
        Grupo grupo = new Grupo();
        grupo.adicionarHeroi(new Heroi(1, "Rubens", 58));
        grupo.adicionarHeroi(new Heroi(2, "Fabio", 72));
        grupo.adicionarHeroi(new Heroi(3, "Luana", 63));
        grupo.adicionarHeroi(new Heroi(3, "Luana", 60));



        grupo.removerHeroi(1);

        System.out.println("O total de ouro do grupo é de: " + grupo.getTotalDeMoedas());
    }
}