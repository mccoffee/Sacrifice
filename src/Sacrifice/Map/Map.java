package Sacrifice.Map;

import java.util.ArrayList;

public class Map {

    public final int WATER = 0;
    public final int LAND = 1;

    ArrayList<ArrayList<Integer>> map = new ArrayList<>();

    public Map() {
        this(32, 32);
    }

    public Map(int width, int height) {
        for (int i = 0; i < width; i++) {
            map.add(new ArrayList<Integer>());
            for (int j = 0; j < height; j++) {
                if (i == 0 || i == width - 1 || j == 0 || j == height - 1) {
                    map.get(i).add(j, WATER);
                } else {
                    map.get(i).add(j, LAND);
                }
            }
        }
    }

    public int getSquare(int x, int y) {
        return map.get(x).get(y);
    }
}
