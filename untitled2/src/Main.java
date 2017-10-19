public class Main {
    public static void main(String[] args) {
        List m1 = new List();
        m1.addBack(897);
        m1.addBack("dsfa");
        m1.addBack("456dsf");

       // m1.deleteByIndex(1);
        m1.add(8,1);
        m1.printList();
        m1.retSize();
        System.out.println("Элемент с индексом 1: "+m1.getDataByIndex(1));

    }
}
