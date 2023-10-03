package PACKAGE_NAME;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("================================= Pokemon List =================================");
        BasePokemon pokemon1 = new ElectricPokemon("Pikachu ","Electric",300,4,3,"Grass");
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

        System.out.println("================================= Player List =================================");

        Player player1 = new Player("Tamer" , 30, pokemon1);
        Player player2 = new Player("Barry" , 32, pokemon4);
        Player player3 = new Player("Joes" , 33, pokemon2);
        Player player4 = new Player("Ali" , 39, pokemon3);

        List<Player> plyersList = new ArrayList<>();
        plyersList.add(player1);
        plyersList.add(player2);
        plyersList.add(player3);
        plyersList.add(player4);

        for (Player py:plyersList){
            py.Print();
        }

        System.out.println("================================= Player1 "+ player1.getName() + " VS Player2 " + player2 .getName() + " =================================");
        Player.match(player1,player2);

        System.out.println("================================= Player1 "+ player3.getName() + " VS Player2 " + player4 .getName() + " =================================");
        Player.match(player3,player4);



    }

}
