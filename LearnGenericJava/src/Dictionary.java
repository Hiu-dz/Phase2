import java.util.*;

/**
 * Generic with class
 *
 * @param <K>: key
 * @param <V>: value
 */
public class Dictionary<K, V> {
    private final LinkedHashMap<K, V> dictionary;

    public Dictionary() {
        this.dictionary = new LinkedHashMap<>();
    }

    public Map<K, V> getDictionary() {
        return dictionary;
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "dictionary=" + dictionary +
                '}';
    }

    public void add(K key, V value) {
        this.dictionary.put(key, value);
    }

    public void show() {
        this.dictionary.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public void update(K key, V value) {
        this.dictionary.replace(key, value);
    }

    public void remove(K key) {
        this.dictionary.remove(key);
    }
}
