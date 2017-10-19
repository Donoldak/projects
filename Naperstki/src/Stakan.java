import java.util.Random;

public class Stakan {
    private int resultStakan = 0;
    public int setStakan(){
        Random rndm = new Random();
        resultStakan = rndm.nextInt(4);

        return resultStakan;
    }
}
