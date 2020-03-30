package basicJava;

import basicjava.TimeConverter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTimeConverter {
    @Test
    public void testTimeConverter(){
        assertEquals(3661, TimeConverter.TimeConverter(1, 1, 1));
    }
}
