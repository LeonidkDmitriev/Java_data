import java.util.ArrayList;

public class HashChain<Key, Value> {
    private int M = 97;
    private int size = 0;
    private Object[] keys = new Object[M];
    private ArrayList[] table = new ArrayList[M]; // для хранения ключей с одинаковыми хэшами

    public int size() {return size;}
    public boolean isEmpty() {return size == 0;}
    private int hash(Key key) {return (key.hashCode() & 0x7fffffff) % M;}

    public int isKey(Key key) { //проверка есть ли уже такой ключ если есть вернет номер ключа в массиве ключей
        int n = hash(key); // получили хэш искомого ключа
        for (int i = 0; i < size; i++) {
            if (((Key)keys[i]).equals(n)) {
                return i;
            }
        }
        return -1; // или -1, если такого ключа нет
    }

    public Value get(Key key, Value value) {  // вернуть значение c ключом если они есть в таблице
        if (key == null) {
            throw new IllegalArgumentException("Ключ не может быть Null");
        }

        if (isKey(key)!=-1) {
                for (int i = 0; i < table[isKey(key)].size(); i++) { // и заходим в нужную строку массива списков
                    if ((value).equals(table[isKey(key)].get(i))) return (Value) table[isKey(key)].get(i);
                }
         }
        return null;
    }

    public void put(Key key, Value value) {  // добавить значение с указанным ключом
        if (key == null) {
            throw new IllegalArgumentException("Ключ не может быть Null");
        }
        if (isKey(key)==-1) {      // добавим новый хэш
            keys[size] = hash(key);
            table[size] = new ArrayList<>();
            table[size].add(value);
            size++;
        } else {  // если такой ключ уже есть
            table[isKey(key)].add(value);
        }
    }
}