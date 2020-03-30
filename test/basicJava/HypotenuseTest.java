package basicJava;

import org.junit.jupiter.api.Test;

import static basicjava.Hypotenuse.calculateHypotenuse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HypotenuseTest {
    @Test
    public void testHypotenuse(){
        assertEquals(5, calculateHypotenuse(3, 4));
    }
}
