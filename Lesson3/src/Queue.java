public class Queue {
    private int maxSize;
    private int[] queue;
    private int front;
    private int rear;
    private int items;
//Конструктор очереди
    public Queue(int s){
        maxSize = s;
        queue = new int[maxSize];
        front = 0;
        rear = -1;
        items = 0;
    }
// Вставляем новый элемент
    public void insert(int i){
        if(rear == maxSize-1)
            rear = -1;
        queue[++rear] = i;
        items++;
    }
// Удаляем элемент
    public int remove(){
        int temp = queue[front++];
        if(front == maxSize)
            front = 0;
        items--;
        return temp;
    }
//Получаем значение элемента
    public int peek(){
        return queue[front];
    }
//Проверяем пустая ли очередь
    public boolean isEmpty(){
        return (items==0);
    }
//Проверяем полноту очереди
    public boolean isFull(){
        return (items==maxSize);
    }
//Узнаем размер очереди
    public int size(){
        return items;
    }
 }
