public class DSA {
    public static int linearSearc(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static int StLinear(String menu[], String item) {
        for (int j = 0; j < menu.length; j++) {
            if (menu[j] == item) {
                return j;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int number[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        String menu[] = { "dosa", "cole-bature", "samosa" };
        String item = "dosa";
        int key = 20;
        int index = linearSearc(number, key);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Key is at index" + index);
        }
        int ind = StLinear(menu,item);
        if (ind == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("item is at index" + ind);
        }
    }
}