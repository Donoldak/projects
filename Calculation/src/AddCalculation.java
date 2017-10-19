public class AddCalculation {
    double value1, value2;
    public AddCalculation(double value1, double value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    double execute(){
        return this.value1+this.value2;
    }

    void print(){
        System.out.println(this.value1+" + "+ this.value2);
    }
}
