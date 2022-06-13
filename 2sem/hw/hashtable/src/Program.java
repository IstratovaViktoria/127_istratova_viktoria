public class Program {
    public static void main(String[] args) {
        System.out.println("Offset_hash_1");
        HashTable hashTable = new OffsetHashTable(13);

        hashTable.insert(98);
        hashTable.print();
        System.out.println();

        hashTable.insert(96);
        hashTable.print();
        System.out.println();

        hashTable.insert(67);
        hashTable.print();
        System.out.println();

        hashTable.insert(73);
        hashTable.print();
        System.out.println();

        hashTable.insert(68);
        hashTable.print();
        System.out.println();

        hashTable.insert(88);
        hashTable.print();
        System.out.println();

        hashTable.insert(62);
        hashTable.print();
        System.out.println();

        hashTable.insert(94);
        hashTable.print();
        System.out.println();

        hashTable.insert(82);
        hashTable.print();
        System.out.println();

        hashTable.insert(50);
        hashTable.print();
        System.out.println();

        hashTable.insert(34);
        hashTable.print();
        System.out.println();

        hashTable.insert(99);
        hashTable.print();
        System.out.println();

        System.out.println("Offset_hash_2");

        HashTable hashTable1 = new OffsetHashTable(19);

        hashTable1.insert(13);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(27);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(76);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(98);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(57);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(69);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(53);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(49);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(11);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(35);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(33);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(49);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(55);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(36);
        hashTable1.print();
        System.out.println();

        hashTable1.insert(78);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(13);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(69);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(76);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(36);
        hashTable1.print();
        System.out.println();

        hashTable1.remove(49);
        hashTable1.print();
        System.out.println();

        System.out.println("Offset_hash_3");

        HashTable hashTable2 = new OffsetHashTable(19);

        hashTable2.insert(33);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(95);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(7);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(62);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(60);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(39);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(8);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(80);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(67);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(8);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(61);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(88);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(80);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(60);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(7);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(51);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(23);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(38);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(67);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(39);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(92);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(50);
        hashTable2.print();
        System.out.println();

        hashTable2.insert(76);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(23);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(8);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(95);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(33);
        hashTable2.print();
        System.out.println();

        hashTable2.remove(50);
        hashTable2.print();
        System.out.println();

        System.out.println("List_hash_1");
        HashTable listHashTable = new ListHashTable(13);

        listHashTable.insert(6);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(89);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(42);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(21);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(41);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(55);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(94);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(39);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(20);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(32);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(40);
        listHashTable.print();
        System.out.println();

        listHashTable.insert(44);
        listHashTable.print();
        System.out.println();

        System.out.println("List_hash_2");

        HashTable listHashTable1 = new ListHashTable(19);

        listHashTable1.insert(66);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(43);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(91);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(95);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(2);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(38);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(49);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(48);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(24);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(77);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(26);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(80);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(19);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(2);
        listHashTable1.print();
        System.out.println();

        listHashTable1.insert(83);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(24);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(19);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(48);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(80);
        listHashTable1.print();
        System.out.println();

        listHashTable1.remove(95);
        listHashTable1.print();
        System.out.println();

        System.out.println("List_hash_3");

        HashTable listHashTable2 = new ListHashTable(19);


        listHashTable2.insert(65);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(60);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(3);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(56);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(92);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(91);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(46);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(65);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(19);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(12);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(74);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(49);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(56);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(3);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(49);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(77);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(17);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(3);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(60);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(92);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(70);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(51);
        listHashTable2.print();
        System.out.println();

        listHashTable2.insert(31);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(17);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(19);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(3);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(91);
        listHashTable2.print();
        System.out.println();

        listHashTable2.remove(74);
        listHashTable2.print();
        System.out.println();
    }
}