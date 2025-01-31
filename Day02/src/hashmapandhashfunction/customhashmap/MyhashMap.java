package hashmapandhashfunction.customhashmap;

public class MyhashMap {
    private static class Entry {
        int key, value;
        Entry next;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    int size = 1000;
    // Array of linked lists (buckets)
    Entry[] table;

    public MyhashMap() {
        table = new Entry[size];
    }

    private int hash(int key) {
        // Hash function
        return key % size;
    }

    // Insert or update a key-value pair
    public void put(int key, int value) {
        int index = hash(key);

        // If bucket is empty, create a new entry
        if (table[index] == null) {
            table[index] = new Entry(key, value);
            return;
        }

        // Otherwise, check for the key in the linked list
        Entry curr = table[index];
        while (true) {
            if (curr.key == key) {
                curr.value = value; // Update value if key exists
                return;
            }
            if (curr.next == null) break;
            curr = curr.next;
        }
        curr.next = new Entry(key, value); // Insert new entry at the end
    }

    // Retrieve a value by key
    public int get(int key) {
        int index = hash(key);
        Entry curr = table[index];

        while (curr != null) {
            if (curr.key == key) return curr.value;
            curr = curr.next;
        }
        return -1; // Key not found
    }

    // Remove a key-value pair
    public void remove(int key) {
        int index = hash(key);
        Entry curr = table[index], prev = null;

        while (curr != null) {
            if (curr.key == key) {
                if (prev == null) {
                    table[index] = curr.next; // Remove first entry
                } else {
                    prev.next = curr.next; // Bypass current node
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }

}
