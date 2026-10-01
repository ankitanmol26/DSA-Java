class MyHashMap {

    // Create an array to store values.
    // Since key can be from 0 to 1,000,000,
    // we need an array of size 1,000,001.
    private int[] map;

    // Constructor
    public MyHashMap() {

        // Create the array
        map = new int[1000001];

        // By default, int array contains 0.
        // But we need to know whether a key exists or not.
        // So we use -1 to mean "key does not exist".
        for (int i = 0; i < map.length; i++) {
            map[i] = -1;
        }
    }

    // PUT:
    // Store the value at the index = key.
    //
    // Example:
    // put(5, 100)
    // map[5] = 100
    public void put(int key, int value) {
        map[key] = value;
    }

    // GET:
    // Simply return the value stored at index = key.
    //
    // If the key doesn't exist,
    // map[key] will be -1.
    public int get(int key) {
        return map[key];
    }

    // REMOVE:
    // To remove a key, set its value back to -1.
    //
    // -1 means "this key does not exist".
    public void remove(int key) {
        map[key] = -1;
    }
}