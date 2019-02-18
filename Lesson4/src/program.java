import java.util.Iterator;

public class program {
    public static void main(String[] args) {
      MyLinkedList<Character> list = new MyLinkedList<>();
      list.insertFirst('a');
      list.insertFirst('b');
      list.insertLast('d');


      //переведем в строку
      System.out.println(list.toString());

      //испытаем итератор
      Iterator<Character> iter = list.iterator();
      while (iter.hasNext()){
        Character c = iter.next();
        System.out.println(c);
      }

    }
}
