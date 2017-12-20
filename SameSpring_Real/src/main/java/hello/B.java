package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class B {

    @Autowired
    public B(C c){
        System.out.println("Constructing B");
    }


}
