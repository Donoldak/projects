public class Main {
    public static void main(String[] args) {
        AddCalculation sum = new AddCalculation(5, 3);
        AddCalculation mul = new MultiplyCalculation(5,3);
        sum.print();
        System.out.println(sum.execute());
        mul.print();
        System.out.println(mul.execute());

    }
}
