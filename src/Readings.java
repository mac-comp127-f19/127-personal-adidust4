public class Readings {


    public int findMax(int[] numbers){
        int max = 0;
        for(int number: numbers){
            if (number > max){
                max = number;
            }
        }
        return max;
    }
    public static void main (String args[]){
        Readings readings = new Readings();
        int[] nums = {0,5,3,2,7,132,436,4};
        System.out.println(readings.findMax(nums));
    }


}
