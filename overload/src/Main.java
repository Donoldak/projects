public class Main {
    public static void main(String[] args) {
        Prymoug[] arrPr;
        arrPr = new Prymoug[3];

        arrPr[0]= new Prymoug();
        arrPr[1]= new Prymoug();
        arrPr[2]= new Prymoug();

        arrPr[0].setHeight(4);
        arrPr[0].setWidth(2);           //8

        arrPr[1].setHeight(3);
        arrPr[1].setWidth(7);       //21

        arrPr[2].setHeight(5); //10
        arrPr[2].setWidth(2);


        Sqrt[] arrSqrt= new Sqrt[3];

        arrSqrt[0]= new Sqrt();
        arrSqrt[1]= new Sqrt();
        arrSqrt[2]= new Sqrt();

        arrSqrt[0].setWidth(5);
        arrSqrt[1].setWidth(2);
        arrSqrt[2].setWidth(6);


       /* for (int i = 0; i<arrPr.length; i++){
            arrPr[i] = new Prymoug();
            arrPr[i].setWidth(i);
            arrPr[i].setHeight(i);
        }*/
        System.out.println(Area.minArea(arrSqrt));
    }
}
