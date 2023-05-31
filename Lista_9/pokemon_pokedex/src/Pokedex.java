import java.util.HashMap;
import java.util.Map;

public class Pokedex {
    private Map<String, Pokemon> pokemons = new HashMap<>();

    public void adicionarPokemon(Pokemon pokemon){
        pokemons.put(pokemon.getCodigoIdentificador(), pokemon);

    }
    public Map<String, Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(Map<String, Pokemon> pokemons) {
        this.pokemons = pokemons;
    }
}
