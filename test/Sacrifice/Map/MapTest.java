package Sacrifice.Map;

import org.junit.Assert;
import org.junit.Test;

public class MapTest {

    Map map;

    @org.junit.Before
    public void setUp() throws Exception {
        map = new Map();
    }

    @Test
    public void testIsWaterAtStandardMap() throws Exception {
        Assert.assertEquals(0, map.getSquare(0, 0));

    }

    @Test
    public void testIsLandAtStandardMap() {
        Assert.assertEquals(1, map.getSquare(30, 30));
        Assert.assertEquals(1, map.getSquare(1, 1));
        Assert.assertEquals(1, map.getSquare(1, 30));
        Assert.assertEquals(1, map.getSquare(30, 1));
    }

}