package PACKAGE_NAME;

public class GrassPokemon extends BasePokemon{
    private  String grassWeakness;

    public GrassPokemon(String name, String type, int cp, int attack, int defense, String grassWeakness) {
        super(name, type, cp, attack, defense);
        this.grassWeakness = grassWeakness;
    }

    public static String cheeckOfGrassWeakness(String grassWeakness){
        if (grassWeakness.equals("Fire")){
            grassWeakness = "Fire";
        }else {
            grassWeakness = "Undefind";
        }
        return grassWeakness;
    }
    @Override
    public void Print() {
        System.out.println(" name: " +  getName() +  " type: " + getType() + " cp: "+ getCp() + " attack: " + getAttack()+ " defense: " +getDefense() + " grassWeakness: " +  cheeckOfGrassWeakness(grassWeakness));
    }

    public String getGrassWeakness() {
        return grassWeakness;
    }

    public void setGrassWeakness(String grassWeakness) {
        this.grassWeakness = grassWeakness;
    }
}
