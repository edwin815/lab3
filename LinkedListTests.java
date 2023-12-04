import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {
	@Test 
	public void testEmpty() 
    {
        LinkedList list1 = new LinkedList();
        assertEquals(0, list1.length());
	}

    @Test
    public void testAdd() 
    {
        LinkedList list1 = new LinkedList();
        list1.append(1);
        list1.append(2);
        list1.append(3);
        list1.append(4);
        list1.append(5);
        list1.append(6);
        assertEquals(1, list1.first());
        assertEquals(6, list1.last());
    }

}