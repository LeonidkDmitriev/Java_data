public class Exponentiation {
    // рассматриваем случай когда возводим в целую степень, но возможна и отрицательная степень
    // можно рассмотреть и степень в виде дроби, например: 2/3, тогда придется добавлять цикл с делением
    // но думаю можно остановиться и на целочисленной степени

    //нахождение степени в цикле
        public static double exp_cycle(double a, int n){
         if (n==0) return 1;
         else {
             double s=1;
              for (int i = 1; i <=Math.abs(n) ; i++) {
              s=s*a;
            }
             if (n>0)return s;
              else return 1/s;
        }
    }

    //нахождение степени рекурсивно
    // если степень неотрицательная то все просто
    public static double exp_recursion(double a, int n){
        if (n==0) return 1;
         else return exp_recursion(a,n-1)*a;
    }

    //нахождение степени рекурсивно
    // в данном случае степень может быть как отрицательной так и положительной
    public static double exp_recursion_all(double a, int n) {
        if (n == 0)
            return 1;
        else if (n > 0)
            return exp_recursion_all(a, n - 1) * a;
         else
             return exp_recursion_all(a, n + 1) * 1/a;
    }
}
