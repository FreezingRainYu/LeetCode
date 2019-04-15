/**
 * @date 2019/04/13
 */
class MyHashMap {

    class MyListNode {

        int ky;
        int val;
        MyListNode next;

        MyListNode(int k, int v) {
            ky = k;
            val = v;
        }
    }

    int mod;
    MyListNode[] hs = new MyListNode[10000];

    /**
     * Initialize your data structure here.
     */
    public MyHashMap() {
        mod = 9973;
    }

    /**
     * value will always be non-negative.
     */
    public void put(int key, int value) {
        if (get(key) == -1) {
            MyListNode ins = new MyListNode(key, value);
            ins.next = hs[key % mod];
            hs[key % mod] = ins;
        } else {
            MyListNode cur = hs[key % mod];
            while (cur != null) {
                if (cur.ky == key) {
                    cur.val = value;
                }
                cur = cur.next;
            }
        }
    }

    /**
     * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
     */
    public int get(int key) {
        MyListNode cur = hs[key % mod];
        while (cur != null) {
            if (cur.ky == key) {
                return cur.val;
            }
            cur = cur.next;
        }
        return -1;
    }

    /**
     * Removes the mapping of the specified value key if this map contains a mapping for the key
     */
    public void remove(int key) {
        if (get(key) != -1) {
            if (hs[key % mod].ky == key) {
                hs[key % mod] = hs[key % mod].next;
                return;
            }
            MyListNode cur = hs[key % mod];
            while (cur.next.ky != key) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
