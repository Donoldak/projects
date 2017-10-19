public class Microwave {
    private boolean door = true;
    private boolean food = false;

    public void openDoor(){
        door = false;
    }
    public void closeDoor(){
        door = true;
    }
    public void putFood() throws ExceptionDoorIsClose{
        if (door == true){
            throw new ExceptionDoorIsClose();
        }else {
            food = true;
        }
    }
    public void takeFood() throws ExceptionNoFood, ExceptionDoorIsClose{
           if (food == false){
               throw new ExceptionNoFood();
           }
           if (door == true){
               throw new ExceptionDoorIsClose();
           }
        food = false;
    }
    public void microwaveOn() throws ExceptionNoFood, ExceptionDoorIsOpen{
        if (food == false){
            throw new ExceptionNoFood();
        }
        if (door == false){
            throw new ExceptionDoorIsOpen();
        }
    }

    public void getState(){
        if (door == true){
            System.out.println("Сейчас дверь закрыта");
        }else {
            System.out.println("Сейчас дверь открыта");
        }
        if (food == false){
            System.out.println("Сейчас там нет еды");
        }else {
            System.out.println("Сейчас там еду");
        }
    }




    class ExceptionNoFood extends Exception{
        void getMassege(){
            System.out.println("В микроволновке нет еды!");
        }
    }
    class ExceptionDoorIsOpen extends Exception{
        void getMassege(){
            System.out.println("Дверь открыта!");
        }
    }
    class ExceptionDoorIsClose extends Exception{
        void getMassege(){
            System.out.println("Дверь закрыта!");
        }
    }
}
