import org.w3c.dom.Node;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n=0; //количество сбалансированных
       for (int i = 1; i <=12 ; i++) {
            //создаем 12 деревьев
            Bst<Integer,Integer> tree = new Bst<>();
            while (tree.size() < 6) {
                //создем дерево глубиной 6
                tree.put((int) (Math.random() * 200 - 100), 1);
            }
            //проверим его сбалансированность
            System.out.println("дерево № "+i+"  размер = " + tree.size()+"  высота = " + tree.hight());
            if (tree.isBalanced()) n++;
        }
        System.out.println("процент сбалансированных " + n/12*100);
        n=0;
       //создадим заведомо сбалансированное дерево
        Bst<Integer,Integer> tree = new Bst<>();
        tree.put(1, 1);
        tree.put(2, 1);
        tree.put(2, 1);
        System.out.println(" сбалансированное дерево размер =" + tree.size()+"  высота = " + tree.hight());
        if (tree.isBalanced()) n++;
        System.out.println("процент сбалансированных " + n/1*100);
   }

}
