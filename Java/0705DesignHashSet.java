/**
 * @date 2019/04/13
 */
class MyHashSet {

    class MyListNode {

        int val;
        MyListNode next;

        MyListNode(int x) {
            val = x;
        }
    }

    int mod;
    MyListNode[] hs = new MyListNode[10000];

    /**
     * Initialize your data structure here.
     */
    public MyHashSet() {
        mod = 9973;
    }

    public void add(int key) {
        if (contains(key) == false) {
            MyListNode ins = new MyListNode(key);
            ins.next = hs[key % mod];
            hs[key % mod] = ins;
        }
    }

    public void remove(int key) {
        if (contains(key) == true) {
            if (hs[key % mod].val == key) {
                hs[key % mod] = hs[key % mod].next;
                return;
            }
            MyListNode cur = hs[key % mod];
            while (cur.next.val != key) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
        }
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        MyListNode cur = hs[key % mod];
        while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
