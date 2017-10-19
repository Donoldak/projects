import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
    Exceptions err = new Exceptions();
    try {
        err.getException();
    }catch (Exceptions.ExceptionA e){
        System.out.println("ExceptionA");
    }catch (Exceptions.ExceptionB e){
        System.out.println("ExceptionB");
    }catch (Exceptions.ExceptionC e){
        System.out.println("ExceptionC");
    }
    }
}
