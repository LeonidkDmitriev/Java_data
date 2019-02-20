public class Deque {
    private int maxSize;
    private int size;
    private int head, end; // индексы начала, конца дека
    private int[] deque;

//Конструктор дека
    public Deque(int max) {
        maxSize = max;
        deque = new int[maxSize];
        head = 0;
        end = 0;
        size = 0;
    }
//Добавляем  в начало дека новый элемент
    public void push_front(int i)
    {
        if (size == maxSize)
        {
            System.out.println("Достигнут максимум размера дека...");
            return;
        }
        else if (size==0)
        {
            end = head;
            deque[head] = i;
            size++;
        }
        else
        {
            head++;
            if (head>=maxSize)
                head = 0;
            deque[head] = i;
            size++;
        }
    }
//Добавляем  в конец дека новый элемент
    public void push_back(int i)
    {
        if (size == maxSize)
        {
            System.out.println("Достигнут максимум размера дека...");
            return;
        }
        else if (size==0)
        {
            head = end;
            deque[end] = i;
            size++;
        }
        else
        {
            end--;
            if (end<0)
                end = maxSize-1;
            deque[end] = i;
            size++;
        }
    }
// Полностью очищаем дек
   public void clear()
    {
        head = 0;
        end = 0;
        size = 0;
    }
//Возвращаем размер дека
    public int size()
    {
        return size;
    }
//проверка не пуст ли дек
    public boolean isEmpty(){
        return (size==0);
    }
//Получаем значение конечного элемента
    public int back()
    {
       return deque[end];
    }
//Получитаем значение начального элемента
    public int front()
    {
        return deque[head];
    }
//Удалем элемент в конце дека с  возвращением элемента
    public int pop_back()
    {
        if (size>0)
        {
            int tmp = deque[end];
            end++;
            if (end>=maxSize)
                end = 0;
            size --;
            return tmp;

        }
        else {
            System.out.println("Достигнут минимум для индекса начала дека...");
            return -1;
        }
    }
//Удалем элемент в начале дека с  возвращением элемента
    public int pop_front()
    {
        if (size>0)
        {
            int tmp = deque[head];
            head--;
            if (head<0)
                head = maxSize - 1;
            size --;
            return tmp;
        }
       else {
          System.out.println("Достигнут минимум для индекса начала дека...");
          return -1;
       }
    }
}
