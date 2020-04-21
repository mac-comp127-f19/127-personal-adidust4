package activityStarterCode.sortingArrays;

import org.junit.Test;

import static activityStarterCode.sortingArrays.ArraySort.sort;
import static org.junit.Assert.assertArrayEquals;

public class ArraySortTest {

    @Test
    public void testSingleElement() {
        assertArrayEquals(
                new String[]{"7"},
                sort(new String[]{"7"})
        );
    }

    @Test
    public void testEmptyArray() {
        assertArrayEquals(
                new String[]{}, sort(new String[]{})
        );
    }

    @Test
    public void testNullArray(){
        assertArrayEquals(
                null, sort(null)
        );
    }

    @Test
    public void testTwoElements(){
        sort(new String[]{"b","a"});
        assertArrayEquals(
                new String[]{"ab","bb"}, sort(new String[]{"bb","ab"})
        );
        assertArrayEquals(
                new String[]{"ab","bb"}, sort(new String[]{"ab","bb"})
        );
    }
    @Test
    public void testThreeElements(){
        assertArrayEquals(
                new String[]{"of","order","out"}, sort(new String[]{"out","of", "order"})
        );
        assertArrayEquals(
                new String[]{"a","b","c"}, sort(new String[]{"a","b", "c"})
        );
    }

    @Test
    public void testCaseSorting(){
        assertArrayEquals(
                new String[]{"Aardvark","bear","Canary", "deer"},
                sort(new String[]{"bear", "Canary", "Aardvark", "deer"})
        );
    }
}
