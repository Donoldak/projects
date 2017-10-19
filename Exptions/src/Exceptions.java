import java.util.Random;

public class Exceptions {


    class ExceptionA extends Exception{    }
    class ExceptionB extends Exception{    }
    class ExceptionC extends Exception{    }

    public void getException() throws Exception{
        Random rndm = new Random(System.currentTimeMillis());
        int err = rndm.nextInt(3);
        switch (err){
            case 0: throw new ExceptionA();
            case 1: throw new ExceptionB();
            case 2: throw new ExceptionC();
        }

    }
}
