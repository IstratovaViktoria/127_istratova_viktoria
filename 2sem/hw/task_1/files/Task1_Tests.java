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
    @Test
    public void pushFront_sizeCorrect(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        assertTrue(1 == list.getSize());
    }
    @Test
    public void pushFront_TryToGetAnotherNumber(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        try {
            list.get(2);
            fail();
        } catch (IndexOutOfBoundsException e){
            assertFalse(false);
        }
    }
    @Test
    public  void getHead_TryToGetHead1(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        int head = ((Node<Integer>)list.getHead()).getData();
        assertEquals(1, head);
    }
    @Test
    public void getHead_TryToGetHead2(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(2);
        list.pushBack(1);
        int head = ((Node<Integer>)list.getHead()).getData();
        assertEquals(1, head);
    }
    @Test
    public void getTail_TryToGetTail1(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        int tail = ((Node<Integer>)list.getTail()).getData();
        assertEquals(2, tail);
    }
    @Test
    public void getTail_TryToGetTail2(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(1);
        list.pushBack(2);
        list.pushBack(3);
        int tail = ((Node<Integer>)list.getTail()).getData();
        assertEquals(1, tail);
    }
    @Test
    public void get_CheckFirst1(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        int num = ((Node<Integer>)list.get(0)).getData();
        assertEquals(1, num);
    }
    @Test
    public void get_PushBackEmptyDoubleLinkedList_CheckFirst(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushBack(3);
        list.pushBack(2);
        list.pushBack(1);

        int num = ((Node<Integer>)list.get(0)).getData();
        assertEquals(1, num);
    }
    @Test
    public void remove_RemoveElementCheckSize(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.remove(list.get(0));
        assertEquals(2, list.getSize());
    }
    @Test
    public void insertListAfter_CheckSize(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);
        list.insertListAfter(list.get(0), list2);
        assertEquals(6, list.getSize());
    }
}
