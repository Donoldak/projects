package hello;

import org.springframework.stereotype.Service;

@Service("second")
public class NameCapitalizer2 implements INameCapitalizer {
    @Override
    public String capitaloze(String name) {
        return name.toLowerCase();
    }
}
