package PACKAGE_NAME;
public abstract class BasePokemon {
    private String name;
    private String type;
    private int cp;
    private  int attack;
    private int defense;

    public BasePokemon(String name, String type, int cp, int attack, int defense) {
        this.name = name;
        this.type = type;
        this.cp = cp;
        this.attack = attack;
        this.defense = defense;

    }

    public abstract void Print();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}
