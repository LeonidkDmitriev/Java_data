import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        turn_over_stack(); // переворот строки с использованием стека
        working_deque();// проверим работу дека
    }



// переворот строки с использованием стека
  private static void turn_over_stack() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку... ");
        String str = in.nextLine();
        Stack q = new Stack(str.length());
        for (int i = 0; i < str.length(); i++) {
            q.push(str.charAt(i)); //помещаем символы в стек
        }
        while( !q.isEmpty() ){
             char s = q.pop();
             System.out.print(s);
         }
      System.out.println("\n"); //чтобы последующие результаты из метода working_deque
      // не сливались с перевернутой строкой

  }
// проверка работы дека
    private static void working_deque() {
        Deque deq = new Deque(5);
        deq.push_back(1);  //поработаем с хвостом дека
        deq.push_back(2);
        deq.push_back(3);
        System.out.println("исходный размер = "+deq.size());
        deq.pop_back();
        while( !deq.isEmpty() ){
            int i = deq.pop_back();
            System.out.println(i);
        }
        deq.clear();//очистим дек
        deq.push_front(-1); //поработаем с головой дека
        deq.push_front(-2);
        deq.push_front(-3);
        System.out.println("исходный размер = "+deq.size());
        deq.pop_front();
        while( !deq.isEmpty() ){
            int i = deq.pop_front();
            System.out.println(i);
        }
        deq.clear();//очистим дек
        deq.push_front(-1); //превысим размер дека
        deq.push_front(-2);
        deq.push_front(-3);
        deq.push_front(-4);
        deq.push_front(-5);
        deq.push_front(-6);
    }
}
