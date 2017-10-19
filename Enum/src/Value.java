import java.util.Random;

public class Value {
    public enum Ball {Да, Нет, Может_быть, Позже, Скоро,Никогда}


    public void getBall(){
        Random rndm = new Random(System.currentTimeMillis());
        int numb =1 + rndm.nextInt(101-1);
        if (numb>0 && numb<31){
            System.out.println(Ball.Да);
        }
        if (numb>30 && numb<46){
            System.out.println(Ball.Нет);
        }
        if (numb>45 && numb<61){
            System.out.println(Ball.Может_быть);
        }
        if (numb>60 && numb<86){
            System.out.println(Ball.Позже);
        }
        if (numb>85 && numb<99){
            System.out.println(Ball.Скоро);
        }
        if (numb>98 && numb<101){
            System.out.println(Ball.Никогда);
        }
    }
}

