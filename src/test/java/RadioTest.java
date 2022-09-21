import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test

    public void setVolumeAboveMaxTest() {
        Radio radio = new Radio();
        radio.setVolume(100);

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeBelowMinTest() {
        Radio radio = new Radio();
        radio.setVolume(-5);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeToTheMinTest() {
        Radio radio = new Radio();
        radio.setVolume(0);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeToTheMaxTest() {
        Radio radio = new Radio();
        radio.setVolume(10);

        int expected = 10;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setVolumeTheLessOneToMinTest() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.setVolumeDown();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setVolumeTheMoreOneToMaxTest() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.setVolumeUp();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upAndDownVolumeTest() {
        Radio radio = new Radio();
        radio.setVolume(2);
        radio.setVolumeUp();
        radio.setVolumeDown();

        int expected = 2;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextAndPrevRadioStationTest() {
        Radio radio = new Radio();
        radio.setNumberOfStation(9);
        radio.setNumberOfStationNext();
        radio.setNumberOfStationPrev();
        radio.setNumberOfStation(5);
        radio.setNumberOfStationNext();
        radio.setNumberOfStationPrev();

        int expected = 5;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setMaxAndMinStationTest(){
        Radio radio = new Radio();
        radio.setNumberOfStation(10);
        radio.setNumberOfStation(-1);
        int expected = 0;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void setMaxNumberOfStation(){
        Radio radio = new Radio(100);
        radio.setNumberOfStation(99);
        radio.setNumberOfStationNext();

        int expected = 0;
        int actual = radio.getNumberOfStation();

        Assertions.assertEquals(expected,actual);
    }
}