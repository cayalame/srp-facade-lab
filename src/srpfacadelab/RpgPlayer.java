package srpfacadelab;

import java.util.List;
import java.util.ArrayList;


public class RpgPlayer {

    private final IGameEngine gameEngine;

    public RpgPlayer(IGameEngine gameEngine) {
        this.gameEngine = gameEngine;

    }

    public void useItem(Item item) {
        if (item.getName().equals("Stink Bomb"))
        {
            List<IEnemy> enemies = gameEngine.getEnemiesNear(this);

            for (IEnemy enemy: enemies){
                enemy.takeDamage(100);
            }
        }
    }
}
