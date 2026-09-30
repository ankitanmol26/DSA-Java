class MyHashSet {

    // IMPORTANT IDEA:
    // The key itself can be used as the array index.
    //
    // set[key] = true  -> key exists
    // set[key] = false -> key does not exist
    private boolean[] set;

    public MyHashSet() {

        // Problem says:
        // 0 <= key <= 1,000,000
        //
        // So we need indices from 0 to 1,000,000.
        // That's 1,000,001 positions.
        set = new boolean[1000001];
    }

    public void add(int key) {

        // Mark this key as present.
        set[key] = true;
    }

    public void remove(int key) {

        // Mark this key as absent.
        set[key] = false;
    }

    public boolean contains(int key) {

        // If set[key] is true, the key exists.
        // If false, the key does not exist.
        return set[key];
    }
}

🧠 Remember this in one line

Key → Array Index → true/false

For example:

add(5)
   ↓
set[5] = true

contains(5)
   ↓
return set[5]     → true

remove(5)
   ↓
set[5] = false

🔑 The pattern to remember for interviews

When you see Design HashSet 705, immediately think:

"Can the key itself be an array index?"
             ↓
          YES
             ↓
      boolean array
             ↓
add      → true
remove   → false
contains → return value


And remember the complexity:

add()       → O(1)
remove()    → O(1)
contains()  → O(1)

Space       → O(MAX_KEY)


The most important thing: don't try to overcomplicate this problem with Java's HashSet, linked lists, or a complicated hash function. Given the key constraint, the boolean-array trick is enough.