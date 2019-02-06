import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<Item> implements Iterable<Item> {
    @Override
    public Iterator<Item> iterator() {
        return new MyLinkedListIterator();
    }
    private class MyLinkedListIterator implements Iterator<Item>{
       private Node current = first;
        @Override
        public boolean hasNext() {
            return current!=null;
        }

        @Override
        public Item next() {
            if (!hasNext())
                throw new NoSuchElementException();
            Item item = current.item;
            current=current.next;
            return item;
        }
    }

    private class Node {
        Item item;
        Node next;
        Node previous;

        public Node(Item item, Node next, Node previous) {
            this.item = item;
            this.next = next;
            this.previous = previous;
        }
    }
      private int size=0;
      private Node first;
      private Node last;

      public int size(){
          return size;
      }
      public boolean isEmply(){
          return size==0;
      }
      public void insertFirst(Item item){
          Node oldFirst = first;
          first = new Node (item,oldFirst,null);
          if (isEmply())
             last=first;
          else
              oldFirst.previous=first;
          size++;
      }
      public Item getFirst(){
          if (isEmply()) {
              throw new NoSuchElementException();
          }
          return first.item;
      }

      public Item deleteFirst(){
            if (isEmply()) {
                throw new NoSuchElementException();
            }
            Item item =first.item;
            first = first.next;
            first.previous=null;
            size--;
          if (isEmply())
              last=null;
            return item;
      }
        public void insertLast(Item item){
           Node oldLast = last;
                last = new Node (item,null,oldLast);
                if (isEmply())
                    first=last;
                else
                    oldLast.next=last;
                size++;
        }
        public Item getLast(){
            if (isEmply()) {
                throw new NoSuchElementException();
            }
            return last.item;
        }
        public Item deleteLast(){
            if (isEmply()) {
                throw new NoSuchElementException();
            }
            Item item =last.item;
            Node prev = last.previous;
            last.previous=null;
            last=prev;
            size--;
            if (isEmply())
                first=null;
            else
                last.next=null;
            return item;
        }
        public Item get(int index) {
          if (index<0||index>size-1){
              throw new IndexOutOfBoundsException();
          }
          int currentIndex = 0;
          Node current = first;
          while (currentIndex<index){
              current=current.next;
              currentIndex++;
          }
          return current.item;
        }
        public void set(int index, Item item) {
            if (index<0||index>size-1){
                throw new IndexOutOfBoundsException();
            }
            int currentIndex = 0;
            Node current = first;
            while (currentIndex<index){
                current=current.next;
                currentIndex++;
            }
            current.item=item;
        }
        public boolean find(Item item){
            Node current = first;
            while (!current.item.equals(item)&&current!=null)
                current=current.next;
             return current!=null;
        }
        public Item delete(Item item){
            Node current = first;
            while (!current.item.equals(item)&&current!=null)
                current=current.next;
             if (current==null)
                return null;
             else if (current==first)
                 return deleteFirst();
             else if (current==last)
                 return deleteLast();
             current.previous.next=current.next;
             current.next.previous=current.previous;
             size--;
             current.next=null;
             current.previous=null;
            return current.item;
        }
        public void insert(int index, Item item) {
            if (index<0||index>size-1){
                throw new IndexOutOfBoundsException();
            }
            if (index==0) {
                insertFirst(item);
                return;
            }
            else if(index==size){
                insertLast(item);

            }
            int currentIndex = 0;
            Node current = first;
            while (currentIndex<index){
                current=current.next;
                currentIndex++;
            }
            Node newNode = new Node(item,current,current.previous);
            current.previous.next = newNode;
            current.previous= newNode;
           size++;
        }
// реализация метода
        public String toString(){
          String str="";
            for (int i = 0; i <size; i++) {
                str=str+get(i)+',';
            }
          return str;
        }


}
