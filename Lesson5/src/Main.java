public class Main {
    public static void main(String[] args) {
       System.out.println(Exponentiation.exp_cycle(2,-3)); //возводим в степень в цикле степень <0
        System.out.println(Exponentiation.exp_cycle(2,3)); //возводим в степень в цикле степень >0

        System.out.println(Exponentiation.exp_recursion(2,0));  //возводим в степень в рекурсии, но неотрицательная

        System.out.println(Exponentiation.exp_recursion_all(2,3)); // используем рекурсию степень любая целочисленная
        System.out.println(Exponentiation.exp_recursion_all(2,-2)); // используем рекурсию степень любая целочисленная

        //ханойские башни
        saigon(3,1,3); //сообщим количество колец и поля

    }

    public static void saigon(int n, int startPole, int endPole) {
        if (n== 0){  // если все перемещено
            return;
        }
        int intermediatePole = 6 - startPole - endPole;
        saigon(n-1, startPole, intermediatePole);
        System.out.println("перемещаю " +n + " из " + startPole + " в " +endPole);
        saigon(n-1, intermediatePole, endPole);
    }

}
