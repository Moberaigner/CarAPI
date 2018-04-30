import junit.framework.TestCase;

import javax.inject.Inject;
import java.util.List;


public class CarFacadeTest extends TestCase {

    public void testFindAll() {
        CarFacade c = new CarFacade();
        System.out.println(c.testMethod());
        assertTrue(c.testMethod().equals("asdf"));
    }
}