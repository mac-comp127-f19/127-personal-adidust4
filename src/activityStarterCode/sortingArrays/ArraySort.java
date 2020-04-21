package activityStarterCode.sortingArrays;

import java.util.Arrays;

public class ArraySort {

    private static String[] merge(String[] a, String[] b) {
        int newLength = a.length + b.length;

        String[] merged = new String[newLength];

//comment because it won't let me commit and push

        for (int i = 0, ai = 0, bi = 0; i < newLength; i++) {
            if(ai < a.length && bi < b.length) {
                if (a[ai].compareToIgnoreCase(b[bi]) < 0) {
                    merged[i] = a[ai];
                    ai++;
                } else {
                    merged[i] = b[bi];
                    bi++;
                }
            }
            else if(ai < a.length){
                merged[i] = a[ai];
                ai++;
            }
            else if(bi < b.length){
                merged[i] = b[bi];
                bi++;
            }
        }
        return merged;
    }

    public static String[] sort(String[] a) {
        if (a == null ||a.length <= 1) {
            return a;
        }

        int mid = a.length / 2;

        String[] front = Arrays.copyOfRange(a, 0, mid);
        String[] back = Arrays.copyOfRange(a, mid, a.length);

        return merge(sort(front), sort(back));
    }

}
