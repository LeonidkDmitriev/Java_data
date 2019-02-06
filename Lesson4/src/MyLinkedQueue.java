public class MyLinkedQueue <Item> {
    private MyLinkedList<Item> stack = new MyLinkedList<>();
    public void enqueue(Item item) { stack.insertLast(item); } //вставляем элемент
    public Item dequeue() { return stack.deleteFirst(); }  //удаляем элемент
    public Item peekFront() { return stack.getFirst(); }  //получаем элемент
    private int size() {return  stack.size();}   // размер очереди
    public boolean isEmply() {return stack.isEmply();} //проверка не пуста ли очередь


}