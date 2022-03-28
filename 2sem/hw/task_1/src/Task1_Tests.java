import org.junit.*;
public class Task1_Tests extends Assert{
    @Test
    public void create_DoubleLinkedList_Empty1(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(1);
        assertFalse(list.isEmpty());
    }
    @Test
    public void create_DoubleLinkedList_Empty2(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(list.isEmpty());
    }

}
