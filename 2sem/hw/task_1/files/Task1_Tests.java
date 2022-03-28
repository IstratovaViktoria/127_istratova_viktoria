import org.junit.*;
public class Task1_Tests extends Assert{
    @Test
    public void create_DoubleLinkedList_EmptyTrue(){
    DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
    assertTrue(list.isEmpty());
}
    @Test
    public void create_EmptyFalse(){
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
    public void get_CheckFirst(){
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
    @Test
    public void insertListAfter_CheckHead(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(4);
        list1.pushFront(5);
        list1.pushFront(6);
        list1.insertListAfter(list.get(0), list1);
        int head = ((Node<Integer>)list.getHead()).getData();
        assertEquals(1, head);
    }
    @Test
    public void insertListAfter_CheckValues() {
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);

        DoubleLinkedList<Integer> list2 = new DoubleLinkedList<>();
        list2.pushFront(4);
        list2.pushFront(5);
        list2.pushFront(6);

        list1.insertListAfter(list1.get(0), list2);

        assertEquals(1, ((Node<Integer>)list1.get(0)).getData().intValue());
        assertEquals(4, ((Node<Integer>)list1.get(1)).getData().intValue());
        assertEquals(5, ((Node<Integer>)list1.get(2)).getData().intValue());
        assertEquals(6, ((Node<Integer>)list1.get(3)).getData().intValue());
        assertEquals(2, ((Node<Integer>)list1.get(4)).getData().intValue());
        assertEquals(3, ((Node<Integer>)list1.get(5)).getData().intValue());
    }
    @Test
    public void pushFront_CheckValues(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.pushFront(4);

        int num1 = ((Node<Integer>)list.get(0)).getData();
        assertEquals(1, num1);
        num1 = ((Node<Integer>)list.get(1)).getData();
        assertEquals(2, num1);
        num1 = ((Node<Integer>)list.get(2)).getData();
        assertEquals(3, num1);
        num1 = ((Node<Integer>)list.get(3)).getData();
        assertEquals(4, num1);
    }
    @Test
    public void remove_CheckValue(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(1);
        list.pushFront(2);
        list.pushFront(3);
        list.remove(list.get(0));
        int num = ((Node<Integer>)list.get(0)).getData();
        assertEquals(2, num);
    }
    @Test
    public void insertListBefore_CheckSize(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(4);
        list.pushFront(5);
        list.pushFront(6);
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);
        list.insertListBefore(list.get(0), list1);
        assertEquals(6, list.getSize());
    }
    @Test
    public void insertListBefore_CheckValues(){
        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();
        list.pushFront(4);
        list.pushFront(5);
        list.pushFront(6);
        DoubleLinkedList<Integer> list1 = new DoubleLinkedList<>();
        list1.pushFront(1);
        list1.pushFront(2);
        list1.pushFront(3);
        list.insertListBefore(list.get(0), list1);
        int num1 = ((Node<Integer>)list.get(0)).getData();
        assertEquals(1, num1);
        num1 = ((Node<Integer>)list.get(1)).getData();
        assertEquals(2, num1);
        num1 = ((Node<Integer>)list.get(2)).getData();
        assertEquals(3, num1);
        num1 = ((Node<Integer>)list.get(3)).getData();
        assertEquals(4, num1);
        num1 = ((Node<Integer>)list.get(4)).getData();
        assertEquals(5, num1);
        num1 = ((Node<Integer>)list.get(5)).getData();
        assertEquals(6, num1);
    }
    @Test
    public void createArray_CheckSize1(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        assertEquals(5, array.getSize());
    }
    @Test
    public void createArray_CheckSize2(){
        DynamicArray<Integer> array = new DynamicArray<>();
        assertEquals(1024, array.getSize());
    }
    @Test
    public void resize_CheckSize(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.resize(10);
        assertEquals(10, array.getSize());
    }
    @Test
    public void get_CheckException2(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.get(7);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void get_CheckException(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.get(5);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void set_CheckExceptio2(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.set(6,10);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void set_CheckException(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.set(5,10);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void insert_CheckException2(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.insert(6,10);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void insert_CheckException(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.insert(5,10);
            fail();
        }
        catch (IndexOutOfBoundsException some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void set_CheckValues(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);
        array.set(3, 4);
        array.set(4, 5);
        assertEquals(1, array.get(0).intValue());
        assertEquals(2, array.get(1).intValue());
        assertEquals(3, array.get(2).intValue());
        assertEquals(4, array.get(3).intValue());
        assertEquals(5, array.get(4).intValue());
    }
    @Test
    public void insert_CheckNewValue(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);
        array.set(3, 4);
        array.set(4, 5);
        array.insert(4, 100);
        assertEquals(1, array.get(0).intValue());
        assertEquals(2, array.get(1).intValue());
        assertEquals(3, array.get(2).intValue());
        assertEquals(4, array.get(3).intValue());
        assertEquals(100, array.get(4).intValue());
    }
    @Test
    public void pushBack_CheckValues(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.set(0, 1);
        array.set(1, 2);
        array.set(2, 3);
        array.set(3, 4);
        array.set(4, 5);
        array.pushBack(6);
        array.pushBack(7);
        assertEquals(1, array.get(0).intValue());
        assertEquals(2, array.get(1).intValue());
        assertEquals(3, array.get(2).intValue());
        assertEquals(4, array.get(3).intValue());
        assertEquals(5, array.get(4).intValue());
        assertEquals(6, array.get(5).intValue());
        assertEquals(7, array.get(6).intValue());
    }
    @Test
    public void popBack_CheckException(){
        DynamicArray<Integer> array = new DynamicArray<>(0);
        try {
            array.popBack();
            fail();
        }
        catch (Exception some) {
            assertEquals("Array is empty", some.getMessage());
        }
    }
    @Test
    public void popBack_CheckCountArray(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.popBack();
        assertEquals(4, array.getSize());
    }
    @Test
    public void remove_CheckException2(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.remove(6);
            fail();
        }
        catch (Exception some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void remove_CheckException(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        try {
            array.remove(5);
            fail();
        }
        catch (Exception some) {
            assertEquals("Index out of bounds", some.getMessage());
        }
    }
    @Test
    public void remove_CheckSize(){
        DynamicArray<Integer> array = new DynamicArray<>(5);
        array.remove(3);
        assertEquals(4, array.getSize());
    }
}
