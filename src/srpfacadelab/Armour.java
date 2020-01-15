package srpfacadelab;

import java.util.List;
import java.util.ArrayList;


public class Armour
{
    RpgPlayer rpgPlayer;

    private int armour;


    public int getArmour() {
        return armour;
    }

    private void setArmour(int armour) {
        this.armour = armour;
    }

    private void calculateStats() {
        for (Item i: inventory) {
            armour += i.getArmour();
        }
    }
}