package hello;

import org.springframework.stereotype.Service;

@Service("first")
public class NameCapitalizer1 implements INameCapitalizer {
    @Override
    public String capitaloze(String name) {
        return name.toUpperCase();
    }
}
