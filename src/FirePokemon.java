package PACKAGE_NAME;

public class FirePokemon extends BasePokemon{

    private  String fireWeakness;

    public FirePokemon(String name, String type, int cp, int attack, int defense, String fireWeakness) {
        super(name, type, cp, attack, defense);
        this.fireWeakness = fireWeakness;
    }
    public static String cheeckOfFireWeakness(String fireWeakness){
        if (fireWeakness.equals("Water")){
            fireWeakness = "Water";
        }else {
            fireWeakness = "Undefind";
        }
        return fireWeakness;
    }
    @Override
    public void Print() {
        System.out.println(" name: " +  getName() +  " type: " + getType() + " cp: "+ getCp() + " attack: " + getAttack()+ " defense: " + getDefense() + " fireWeakness: " +  cheeckOfFireWeakness(fireWeakness));
    }

    public String getFireWeakness() {
        return fireWeakness;
    }

    public void setFireWeakness(String fireWeakness) {
        this.fireWeakness = fireWeakness;
    }
}
