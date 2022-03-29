import org.junit.*;
public class Task3_Tests extends Assert{
    @Test
    public void heapSort_TryToCompareArrays(){
        HeapSort<Integer> sorter = new HeapSort<>();
        Integer[] array = {1};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1}, array);
    }
    @Test
    public void quickSort_TryToCompareArrays(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {1};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1}, array);
    }
    @Test
    public void quickSort_CreateNewQuickSort_TryToCompareArraysTwoItems(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {1, 2};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2}, array);
    }
    @Test
    public void quickSort_TryToCompareArraysThreeItems(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {1, 2, 3};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3}, array);
    }
    @Test
    public void quickSort_TryToSortTwoItems(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {2, 1};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2}, array);
    }
    @Test
    public void quickSort_TryToSortThreeItems(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {2, 1, 3};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3}, array);
    }
    @Test
    public void quickSort_TryToSortFourReversedItems(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {5, 4, 3, 2};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{2, 3, 4, 5}, array);
    }
    @Test
    public void quickSort_TryToSortWithSimilarItems(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {8, 7, 4, 4};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{4, 4, 7, 8}, array);
    }
    @Test
    public void mergeSort_TryToCompareArrays(){
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] array = {1};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1}, array);
    }
    @Test
    public void mergeSort_TryToCompareTwoItemsArrays(){
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] array = {1, 2};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2}, array);
    }
    @Test
    public void mergeSort_TryToCompareThreeItemsArrays(){
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] array = {1, 2, 3};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3}, array);
    }
    @Test
    public void mergeSort_TryToSortTwoItems(){
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] array = {2, 1};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2}, array);
    }
    @Test
    public void mergeSort_TryToSortThreeItems(){
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] array = {2, 1, 3};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3}, array);
    }
    @Test
    public void mergeSort_TryToSortThreeReversedItems(){
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] array = {3, 2, 1};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3}, array);
    }
    @Test
    public void mergeSort_TryToSortLargeArray(){
        MergeSort<Integer> sorter = new MergeSort<>();
        Integer[] array = {3, 2, 1, 5, 8, 7, 4, 6};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8}, array);
    }
    @Test
    public void heapSort_TryToCompareTwoItemsArrays(){
        HeapSort<Integer> sorter = new HeapSort<>();
        Integer[] array = {1, 2};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{1, 2}, array);
    }
    @Test
    public void quickSort_TryToSortAgain(){
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {4, 2, 1, 0 , 5, 0, 3};
        MyComparator<Integer> comparator = new MyComparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return first - second;
            }
        };
        sorter.sort(array, comparator);
        assertArrayEquals(new Integer[]{0, 0, 1, 2, 3, 4, 5}, array);
    }
}
