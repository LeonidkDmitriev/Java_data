class Stack{
    private int maxSize;
    private char[] stack;
    private int top;
//Конструктор стека
    public Stack(int size){
        this.maxSize = size;
        this.stack = new char [this.maxSize];
        this.top = -1;
    }
//Добавляем элемент
    public void push(char s){
        this.stack[++this.top] = s;
    }
//Получаем элемент с его удалением
    public char pop(){
       return this.stack[this.top--];
    }
//Получаем элемент
    public char peek(){
        return this.stack[this.top];
    }
//Проверяем стек на пустоту
    public boolean isEmpty(){
        return (this.top == -1);
    }
//Проверяем стек на заполненность
    public boolean isFull(){
        return (this.top == this.maxSize-1);
    }
}
