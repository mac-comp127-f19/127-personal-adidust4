package activityStarterCode.objects;

public class DiceRoller {

    public static void main(String[] args){
        Die lucky = new Die();
        for(int i = 0; i < 10; i++){
            lucky.roll();
            String word = lucky.toString();
            System.out.println("Roll " + (i + 1) + " generated a " + word);
        }
        Die luckier = new Die();
        int matchCounter = 0;
        for(int i = 0; i < 1000000; i++){
            lucky.roll();
            luckier.roll();
            if (luckier.getValue() == lucky.getValue()){
                matchCounter ++;
            }
        }
        System.out.println("In 1,000,000 rolls, two dice agreed " + matchCounter + " times");
    }
}
