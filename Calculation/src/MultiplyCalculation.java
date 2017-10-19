public class MultiplyCalculation extends AddCalculation {
    MultiplyCalculation(double value1, double value2) {
        super(value1, value2);
    }

    double execute(){
        return this.value1*this.value2;
    }

    void print(){
        System.out.println(this.value1+" * "+ this.value2);
    }

}
