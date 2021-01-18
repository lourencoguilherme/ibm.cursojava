package aula01.pokemon;

public class QuemEEssePokemon {

    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon("Charmander", 1);
        pokemon.quemEEssoPokemon();
        pokemon.evoluiPokemon("Charmilion");
        pokemon.quemEEssoPokemon();
    }
}
