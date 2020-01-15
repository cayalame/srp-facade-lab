package srpfacadelab;

import java.util.List;
import java.util.ArrayList;


public class Inventory
{
    public static final int MAX_CARRYING_CAPACITY = 1000;
    RpgPlayer rpgPlayer;
    private List<Item> inventory;

    // How much the player can carry in pounds
    private int carryingCapacity;

    public Inventory(){
        inventory = new ArrayList<Item>();
        carryingCapacity = MAX_CARRYING_CAPACITY;
    }


    private boolean checkIfItemExistsInInventory(Item item) {
        for (Item i: inventory) {
            if (i.getId() == item.getId())
                return true;
        }
        return false;
    }

    private int calculateInventoryWeight() {
        int sum=0;
        for (Item i: inventory) {
            sum += i.getWeight();
        }
        return sum;
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    private void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }

    public boolean pickUpItem(Item item) {
        int weight = calculateInventoryWeight();
        if (weight + item.getWeight() > carryingCapacity)
            return false;

        if (item.isUnique() && checkIfItemExistsInInventory(item))
            return false;

        // Don't pick up items that give health, just consume them.
        if (item.getHeal() > 0) {
            health += item.getHeal();

            if (health > maxHealth)
                health = maxHealth;

            if (item.getHeal() > 500) {
                gameEngine.playSpecialEffect("green_swirly");
            }
            return true;
        }

        if (item.isRare())
            gameEngine.playSpecialEffect("cool_swirly_particles");

        if (item.isRare() && item.isUnique())
            gameEngine.playSpecialEffect("blue_swirly");

        inventory.add(item);

        calculateStats();

        return true;
    }

}