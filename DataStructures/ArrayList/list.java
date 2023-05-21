import java.util.*;

public class list {
    public static void main(String args[]) {
        // define arraylist
        // arrayList is java collection framework
        // class object = new classname <>//it define wic type of data we are going to
        // store in arraylist()//calling constructor
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        // add
        list1.add(1); // o(1)
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println(list1);
        System.out.println(list1.size());
        // print arraylist using loop
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
        // anoter way of add elemnt on particular index
        // list1.add(1, 23); // o(n)
        // get
        // int element = list1.get(2);
        // System.out.println(element);
        // remove
        // list1.remove(2);
        // System.out.println(list1);
        // set element at index
        // list1.set(2, 10);
        // System.out.println(list1);
        // contains operations
        // System.out.println(list1.contains(1));
        // System.out.println(list1.contains(11));

    }
}
