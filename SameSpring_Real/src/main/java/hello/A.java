package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class A {
    @Autowired
    public A(B b){
        System.out.println("Constructing A");
    }

    @Autowired
    public  void qwe(B b){
        System.out.println("adfa");
    }
}
