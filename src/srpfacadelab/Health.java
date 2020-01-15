package srpfacadelab;

import java.util.List;
import java.util.ArrayList;


public class Health
{
    RpgPlayer rpgPlayer;

    private int health;

    private int maxHealth;

    public void takeDamage(int damage) {
        if (damage < armour) {
            gameEngine.playSpecialEffect("parry");
        }

        if(inv.calculateInventoryWeight < inv.getCarryingCapacity() / 2){
            damage -= damage * .25;
        }

        int damageToDeal = damage - armour;
        health -= damageToDeal;

        gameEngine.playSpecialEffect("lots_of_gore");
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

}