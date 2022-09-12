import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void getIncreaseVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(9);

        cond.increaseVolume();

        int expected = 10;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getIncreaseVolumeBorder() {
        Radio cond = new Radio();
        cond.setCurrentVolume(100);

        cond.increaseVolume();

        int expected = 100;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getIncreaseVolumeBorder2() {
        Radio cond = new Radio();
        cond.setCurrentVolume(120);

        cond.increaseVolume();

        int expected = 100;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getDecreaseVolume() {
        Radio cond = new Radio();
        cond.setCurrentVolume(1);

        cond.decreaseVolume();

        int expected = 0;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getDecreaseVolumeBorder() {
        Radio cond = new Radio();
        cond.setCurrentVolume(0);

        cond.decreaseVolume();

        int expected = 0;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getDecreaseVolumeBorder2() {
        Radio cond = new Radio();
        cond.setCurrentVolume(-9);

        cond.decreaseVolume();

        int expected = 0;
        int actual = cond.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getIncreaseRadio() {
        Radio cond = new Radio(100);
        cond.setNumberRadio(23);

        cond.nextRadio();

        int expected = 24;
        int actual = cond.getNumberRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getIncreaseRadioBorder() {
        Radio cond = new Radio(100);
        cond.setNumberRadio(-9);

        cond.nextRadio();

        int expected = 0;
        int actual = cond.getNumberRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getIncreaseRadioBorder2() {
        Radio cond = new Radio();
        cond.setNumberRadio(9);

        cond.nextRadio();

        int expected = 0;
        int actual = cond.getNumberRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getIncreaseRadioBorder3() {
        Radio cond = new Radio();
        cond.setNumberRadio(10);

        cond.nextRadio();

        int expected = 0;
        int actual = cond.getNumberRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getDecreaseRadio() {
        Radio cond = new Radio(100);
        cond.setNumberRadio(50);

        cond.prevRadio();

        int expected = 49;
        int actual = cond.getNumberRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getDecreaseRadioBorder() {
        Radio cond = new Radio(100);
        cond.setNumberRadio(0);

        cond.prevRadio();

        int expected = 99;
        int actual = cond.getNumberRadio();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void getDecreaseRadioBorder2() {
        Radio cond = new Radio();
        cond.setNumberRadio(1);

        cond.prevRadio();

        int expected = 0;
        int actual = cond.getNumberRadio();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void test(){
        Radio cond = new Radio ();
        cond.setNumberRadio(5);

        Assertions.assertEquals(0,cond.getMinNumberRadio());
        Assertions.assertEquals(9,cond.getMaxNumberRadio());
        Assertions.assertEquals(5,cond.getNumberRadio());
    }
}
