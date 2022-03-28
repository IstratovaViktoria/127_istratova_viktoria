import org.junit.*;
public class Task1_Tests extends Assert{
    @Test
    public void create_DoubleLinkedList_EmptyTrue(){
    DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
    assertTrue(list.isEmpty());
}
    @Test
    public void create_DoubleLinkedList_EmptyFalse(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(1);
        assertFalse(list.isEmpty());
    }
    @Test
    public void getSize_sizeCorrect(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        assertTrue(0 == list.getSize());
    }

}
