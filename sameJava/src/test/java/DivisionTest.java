import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;

public class DivisionTest {
    @Test
    public void testDivideSimple(){
        SameClass div = new SameClass();
        double result = div.division(4, 2);
        assertTrue(2 == result);
    }

    @Test
    public void testDivideSimpleByOne(){
        SameClass div = new SameClass();
        double result = div.division(4, 1);
        assertTrue(4== result);
    }

    @Test
    public void changeArrayTest(){
        SameClass arr = new SameClass();
        int[] array = {1,2,3,4,5};
        arr.changeArray(array);
        assertTrue(array[0] == -999);
    }

    @Test
    public void testUsetInput(){
        String input = "431";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        SameClass main = new SameClass();
        int result = main.userInput();
        assertTrue(432 == result);
    }

}
