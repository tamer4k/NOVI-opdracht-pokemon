package PACKAGE_NAME;

public class Player {
    private String name;
    private int level;
    private BasePokemon pokemon;

    public Player(String name, int level, BasePokemon pokemon) {
        this.name = name;
        this.level = level;
        this.pokemon = pokemon;
    }


    public static void match(Player player1,Player player2){
        if(player1.getPokemon().getType().equals("Electric") && player2.getPokemon().getType().equals("Grass") ){
            System.out.println("winner is " + player2.getName() + " because he has " + player2.getPokemon().getName());
        } else if ( player1.getPokemon().getType().equals("Fire") && player2.getPokemon().getType().equals("Water") ) {
            System.out.println("winner is " + player2.getName() + " because he has " + player2.getPokemon().getName());
        }
        else if ( player1.getPokemon().getType().equals("Water") && player2.getPokemon().getType().equals("Electric") ) {
            System.out.println("winner is " + player2.getName() + " because he has " + player2.getPokemon().getName());
        }
        else if ( player1.getPokemon().getType().equals("Grass") && player2.getPokemon().getType().equals("Fire") ) {
            System.out.println("winner is " + player2.getName() + " because he has " + player2.getPokemon().getName());
        }else {
                System.out.println("winner is " + player1.getName()+ " because he has " + player1.getPokemon().getName());
        }
    }
    public void Print() {

        System.out.println(" name: " +  getName() +  " Level: " + getLevel() +  " pokemon: " + getPokemon().getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public BasePokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(BasePokemon pokemon) {
        this.pokemon = pokemon;
    }
}
