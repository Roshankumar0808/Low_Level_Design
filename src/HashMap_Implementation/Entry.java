package HashMap_Implementation;

public class Entry<K,V> {
   public K key;
   public V value;
   public Entry next;

    public Entry(K key,V value) {
        this.value = value;
        this.key = key;
    }
}
