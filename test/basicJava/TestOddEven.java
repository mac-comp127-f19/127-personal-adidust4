package basicJava;

import org.junit.jupiter.api.Test;

import static basicjava.OddEven.isOdd;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOddEven {
    @Test
    public void testOddEven(){
        assertEquals(false, isOdd(-4) );
    }
}
