package Matvey_Solutions.Levels.Easy.DesignHashMap_706;


import java.util.Arrays;

class MyHashMap {
    int size = (int) Math.pow(10, 6) + 1;
    int[] data;
    public MyHashMap() {
        data = new int[size];
        Arrays.fill(data, -1);

    }

    public void put(int key, int value) {
        data[key] = value;
    }

    public int get(int key) {
        return data[key];

    }

    public void remove(int key) {
        data[key] = -1;
    }

}
