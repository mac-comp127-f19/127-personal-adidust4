package activityStarterCode.extractInterface;

public class FireballAttack implements Attack{

    private int mana;
    private int fireballDamage;
    private int fireballManaRequired;
    public FireballAttack(int mana, int fireballDamage, int fireballManaRequired){
        this.mana = mana;
        this.fireballDamage = fireballDamage;
        this.fireballManaRequired = fireballManaRequired;
    }
    @Override
    public String attack(GameCharacter attacker, GameCharacter target) {
        if (attacker.useMana(fireballManaRequired)){
            return attacker.getName() + " hit " + target.getName() + " with a fireball for " +
                    fireballDamage + " points of damage";
        }
        else{
            return attacker.getName() + " did not have enough mana for a fireball attack";
        }

    }

}
