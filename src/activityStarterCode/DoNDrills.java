package activityStarterCode;

public class DoNDrills {
    public static void main (String[] args){
        for(int i = 0; i<10; i++){
            System.out.println(i);
        }
        for(int i = 10; i > -1; i--){
            System.out.println(i);
        }
        for(int i = 1; i<257;i*=2){
            System.out.println(i);
        }
        for(int i =0; i<256;i = i*2 + 1){
            System.out.println(i);
        }
        for(int i = 1; i<52; i+=2){
            System.out.println(Math.sqrt(i));
        }

    }
}
