public class Main {
    public static void main(String[] args) {
        Pokedex pokedex = new Pokedex();
        pokedex.adicionarPokemon(new Pokemon("001", "Charmander", "Fogo"));
        pokedex.adicionarPokemon(new Pokemon("004", "Bulbassaur", "Planta"));
        pokedex.adicionarPokemon(new Pokemon("007", "Squirtle", "Água"));
    }
}