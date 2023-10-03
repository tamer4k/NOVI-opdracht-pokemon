package PACKAGE_NAME;

public class WaterPokemon extends BasePokemon {

    private String waterWeakness;

    public WaterPokemon(String name, String type, int cp, int attack, int defense, String waterWeakness) {
        super(name, type, cp, attack, defense);
        this.waterWeakness = waterWeakness;
    }

    public static String cheeckOfWaterWeakness(String waterWeakness){
        if (waterWeakness.equals("Electric")){
            waterWeakness = "Electric";
        }else {
            waterWeakness = "Undefind";
        }
        return waterWeakness;
    }
    @Override
    public void Print() {
        System.out.println(" name: " +  getName() +  " type: " + getType() + " cp: "+ getCp() + " attack: " + getAttack()+ " defense: " +getDefense() + " waterWeakness: " +  cheeckOfWaterWeakness(waterWeakness));
    }

    public String getWaterWeakness() {
        return waterWeakness;
    }

    public void setWaterWeakness(String waterWeakness) {
        this.waterWeakness = waterWeakness;
    }
}