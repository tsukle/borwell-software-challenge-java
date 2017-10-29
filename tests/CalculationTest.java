import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {
    @Test
    void floorArea()
    {
        Calculation calc = new Calculation();
        double check = calc.FloorArea(10, 10); // 10 * 10 = 100
        assertEquals(100, check);
    }

    @Test
    void paintRequired()
    {
        Calculation calc = new Calculation();
        double check = calc.PaintRequired(10, 10, 5, 5, 1, 1, 1); // (((10 * 10) * 1) - (((5 * 5) * 1) + ((2.04 * 0.82) * 1))) / 10 = 7.33272
        assertEquals(7.33272, check);

    }

    @Test
    void roomVolume()
    {
        Calculation calc = new Calculation();
        double check = calc.RoomVolume(10, 10, 10); // 10 * 10 * 10 = 1000
        assertEquals(1000, check);
    }

}