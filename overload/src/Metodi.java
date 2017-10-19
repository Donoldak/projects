public class Metodi {
    static void add(double a){
        System.out.println("Вы ввели один параметр: " + a);
    }

    static void add(double a, double b){
        System.out.println("Сумма двух параметров: "+(a + b));
    }

    static void add(double a, double b, double c){
        System.out.println("Сумма трех параметров: "+(a + b+c));
    }

    static void add(){
        System.out.println("Вы не ввели ни одного параметра");
    }
}
