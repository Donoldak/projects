package hello;

import org.springframework.stereotype.Service;

@Service
public class CProvider {
    public C provider(){
        return new C();
    }
}
