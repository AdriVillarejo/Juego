
package joc;


public class Item {
    
    private int attackBonus;
    private int defenseBonus;
    private String name;

    public Item(int attackBonus, int defenseBonus, String name) {
        this.attackBonus = attackBonus;
        this.defenseBonus = defenseBonus;
        this.name = name;
    }
    
    public Item() {
        
    }

    public int getAttackBonus() {
        return attackBonus;
    }
    
    

    public int getDefenseBonus() {
        return defenseBonus;
    }

    public String getName() {
        return name;
    }

    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }

    public void setDefenseBonus(int defenseBonus) {
        this.defenseBonus = defenseBonus;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    @Override
    public String toString() {
        
        String objeto = "Nombre del item:  " + this.name + " \nBonus de ataque: " + this.attackBonus + " \nBonus de Defensa: " + this.defenseBonus;
        return objeto;
    }
    
    
    
    
}
