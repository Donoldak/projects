public class List<E> {
    private ListElement tail = new ListElement<E>(null, null);
    private ListElement head = new ListElement<E>(null, tail);
    private int size = 0;

    void  retSize(){
        System.out.println("Размер листа: "+ size);
    }

    void addBack(E data){
        ListElement<E> a = tail;
        tail.setData(data);
        tail = new ListElement<E>(null, null);
        a.setNext(tail);
        size++;
    }

    void add (E data, int index){
        ListElement<E> target = head.getNext();
        ListElement<E> newElem=new ListElement<E>(data, null);
        for(int i = 0; i<index-1; i++) {
            target = get_Next(target);
        }
                newElem.next = target.next;
                target.next = newElem;




                size++;
    }

    void printList(){
        ListElement<E> t = head;
        while (t != null){
            System.out.print(t.data + " ");
            t = t.next;
        }
    }

    void deleteByIndex(int count){
        ListElement<E> target = head.getNext();
        for(int i = 0; i<count; i++){
            target = get_Next(target);
        }
         E data = target.getData();
        if(head == null)        //если список пуст -
            return;             //ничего не делаем

        if (head == tail) {     //если список состоит из одного элемента
            head = null;        //очищаем указатели начала и конца
            tail = null;
            return;             //и выходим
        }

        if (head.data == data) {    //если первый элемент - тот, что нам нужен
            head = head.next;       //переключаем указатель начала на второй элемент
            size--;
            return;                 //и выходим
        }

        ListElement t = head;       //иначе начинаем искать
        while (t.next != null) {    //пока следующий элемент существует
            if (t.next.data == data) {  //проверяем следующий элемент
                if(tail == t.next)      //если он последний
                {
                    tail = t;           //то переключаем указатель на последний элемент на текущий
                }
                t.next = t.next.next;   //найденный элемент выкидываем
                size--;
                return;                 //и выходим
            }
            t = t.next;                //иначе ищем дальше
        }
    }

    public E getDataByIndex(int count){
        ListElement<E> target = head.getNext();
        for(int i = 0; i<count; i++){
            target = get_Next(target) ;
        }
        return target.getData();
    }

    private ListElement<E> get_Next(ListElement<E> data){
        return data.getNext();
    }

    public class ListElement<E> {
       ListElement next;
       E data;

       public ListElement(E data, ListElement<E> next){
           this.data = data;
           this.next = next;
       }
       public E getData(){return data;}
       public ListElement<E> getNext(){return  next;}
       public void setData(E data){this.data = data;}
       public void setNext(ListElement<E> next){this.next = next;}
   }


}
