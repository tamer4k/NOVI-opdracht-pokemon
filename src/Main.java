package PACKAGE_NAME;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BasePokemon pokemon1 = new ElectricPokemon("Pikachu ","Electric",300,4,3,"Groundblablabla");
        BasePokemon pokemon2 = new FirePokemon("Charmander ","Fire",300,4,3,"Water");
        BasePokemon pokemon3 = new WaterPokemon("Squirtle  ","Water",300,3,4,"Electric");
        BasePokemon pokemon4 = new GrassPokemon("Bulbasaur ","Grass",300,3,3,"Fire");

        List<BasePokemon> pokemonList = new ArrayList<>();
        pokemonList.add(pokemon1);
        pokemonList.add(pokemon2);
        pokemonList.add(pokemon3);
        pokemonList.add(pokemon4);

        for (BasePokemon p:pokemonList) {
            p.Print();
        }

    }

}
