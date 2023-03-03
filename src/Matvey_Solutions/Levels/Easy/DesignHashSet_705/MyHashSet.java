package Matvey_Solutions.Levels.Easy.DesignHashSet_705;


public class MyHashSet {

    boolean[] setArray;
    int size = (int)Math.pow(10,6);
    public MyHashSet() {
        setArray = new boolean[size + 1];

    }

    public void add(int key) {
        setArray[key] = true;
    }

    public void remove(int key) {
        setArray[key] = false;
    }

    public boolean contains(int key) {
        return setArray[key];
    }
}
