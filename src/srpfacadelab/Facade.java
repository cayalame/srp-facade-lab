package srpfacadelab;

import java.util.List;
import java.util.ArrayList;


public class Facade
{
    private Armour armour;
    private Inventory inventory;
    private Health health;

    public Facade(){
        this.armour = new Armour();
        this.inventory = new Inventory();
        this.health = new Health();
    }

    public void setArmour(Armour armou){
        armour = armou;
    }

    public void setInventory(Inventory inv){
        inventory = inv;
    }

    public void setHealth(Health heal){
        health = heal;
    }

    public Armour getArmour(){
        return armour;
    }

    public Inventory getInventory(){
        return inventory;
    }

    public Health getHealth(){
        return health;
    }
}
