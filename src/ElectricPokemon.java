package PACKAGE_NAME;

public class ElectricPokemon extends BasePokemon{
    private String electricWeakness;

    public ElectricPokemon(String name, String type, int cp, int attack, int defense, String electricWeakness) {
        super(name, type, cp, attack, defense);
        this.electricWeakness = electricWeakness;


    }

    public static String cheeckOfElectricWeakness(String electricWeakness){
        if (electricWeakness.equals("Ground")){
            electricWeakness = "Ground";
        }else {
            electricWeakness = "Undefind";
        }
        return electricWeakness;
    }
    @Override
    public void Print() {
        if(electricWeakness.equals("Ground")){
            this.electricWeakness = "Ground";
        }else{
            this.electricWeakness = "undefind";
        }
        System.out.println(" name: " +  getName() +  " type: " + getType() + " cp: "+ getCp() + " attack: " + getAttack()+ " defense: " +getDefense() + " electricWeakness: " +  cheeckOfElectricWeakness(electricWeakness));
    }

    public String getElectricWeakness() {
        return electricWeakness;
    }

    public void setElectricWeakness(String electricWeakness) {
        this.electricWeakness = electricWeakness;
    }
}
