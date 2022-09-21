import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void setMaxVolume (){
    Radio radio = new Radio();
    radio.setMaxVolume(5);

    int expected = 5;
    int actual = radio.getMaxVolume();

    Assertions.assertEquals(expected,actual);

    }
}
