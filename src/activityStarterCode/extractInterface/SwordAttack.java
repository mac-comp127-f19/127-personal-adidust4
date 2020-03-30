package activityStarterCode.extractInterface;

import java.util.Random;

public class SwordAttack implements Attack {

    private int minDamage;
    private int maxDamage;

    public SwordAttack(int minDamage, int maxDamage){
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }
    @Override
    public String attack(GameCharacter attacker, GameCharacter target) {
        Random rand = new Random();
        int damage = rand.nextInt(maxDamage - minDamage + 1) + minDamage;
        target.takeDamage(damage);
        return attacker.getName() + " struck " + target.getName() + " with a sword for " + damage + " points of damage";
    }
}
