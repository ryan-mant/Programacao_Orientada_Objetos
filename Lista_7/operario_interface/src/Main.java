import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();
        fabrica.addOperarios(new OperadorDeDobra("Rogisvaldo", "Dobrador", 60));
        fabrica.addOperarios(new OperadorDeCorte("Andrénilson", "Cortador", 50));
        fabrica.addOperarios(new OperadorDePrensa("Pitucha", "Prensador", 70));

        fabrica.iniciarExpediente();

    }
}