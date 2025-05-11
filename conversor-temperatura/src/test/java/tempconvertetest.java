import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class tempconvertetest {

    @Test
    public void testFahrenheitParaCelsius() {
        
        assertEquals(0.0, tempconverte.fahrenheitParaCelsius(32), 0.01);
        
        
        assertEquals(100.0, tempconverte.fahrenheitParaCelsius(212), 0.01);
        
       
        assertEquals(-17.78, tempconverte.fahrenheitParaCelsius(0), 0.01);
    }
}
