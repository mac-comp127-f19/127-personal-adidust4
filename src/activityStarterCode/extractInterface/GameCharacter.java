package activityStarterCode.extractInterface;

import java.util.Random;

public class GameCharacter {
    private static final Random rand = new Random();

    private final String name;
    private int hitPoints, mana;
    private final int swordMinDamage, swordMaxDamage;
    private final int fireballDamage;
    private final int fireballManaRequired;

    public GameCharacter(String name, int hitPoints, int mana, int swordMinDamage, int swordMaxDamage, int fireballDamage, int fireballManaRequired) {
        if ((swordMinDamage != 0 || swordMaxDamage != 0) && (fireballDamage != 0 || fireballManaRequired != 0)) {
            throw new IllegalArgumentException("Character cannot have both sword and fireball damage");
        }
        this.name = name;
        this.hitPoints = hitPoints;
        this.mana = mana;
        this.swordMinDamage = swordMinDamage;
        this.swordMaxDamage = swordMaxDamage;
        this.fireballDamage = fireballDamage;
        this.fireballManaRequired = fireballManaRequired;
    }

    public String attack(GameCharacter target) {
        FireballAttack fireball = new FireballAttack(this.mana, this.fireballDamage, this.fireballManaRequired);
        SwordAttack sword = new SwordAttack(this.swordMinDamage,this.swordMaxDamage);
        if (mana > 0) {
            return fireball.attack(this, target);
        }
        else{
            return sword.attack(this, target);
        }
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getMana() {
        return mana;
    }

    public void takeDamage(int damage) {
    }

    public boolean useMana(int amount) {
        if (mana >= amount) {
            mana -= amount;
            return true;
        } else {
            return false;
        }
    }
}
