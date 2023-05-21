import java.util.*;

/*
 * public class MultiList {
 * public static void main(String args[]) {
 * ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
 * ArrayList<Integer> list = new ArrayList<>();
 * list.add(1);
 * list.add(2);
 * mainList.add(list);
 * ArrayList<Integer> list2 = new ArrayList<>();
 * list2.add(3);
 * list2.add(4);
 * mainList.add(list2);
 * ArrayList<Integer> list3 = new ArrayList<>();
 * list3.add(5);
 * list3.add(6);
 * 
 * mainList.add(list3);
 * 
 * for (int i = 0; i < mainList.size(); i++) {
 * ArrayList<Integer> currlist = mainList.get(i);
 * for (int j = 0; j < currlist.size(); j++) {
 * System.out.print(currlist.get(j) + " ");
 * }
 * System.out.println();
 * 
 * }
 * System.out.print(mainList);
 * }
 * }
 */
// waterStrore problem-BruteForce approach
/*
 * public class MultiList {
 * public static int storeWater(ArrayList<Integer> line) {
 * int maxWater = 0;
 * for (int i = 0; i < line.size(); i++) {
 * for (int j = i + 1; j < line.size(); j++) {
 * int ht = Math.min(line.get(i), line.get(j));
 * int width = j - i;
 * int currWater = ht * width;
 * maxWater = Math.max(maxWater, currWater);
 * }
 * }
 * return maxWater;
 * }
 * 
 * public static void main(String args[]) {
 * ArrayList<Integer> line = new ArrayList<>();
 * // 1,8,6,2,5,4,8,3,7
 * line.add(1);
 * line.add(8);
 * line.add(6);
 * line.add(2);
 * line.add(5);
 * line.add(4);
 * line.add(8);
 * line.add(3);
 * line.add(7);
 * System.out.print(storeWater(line));
 * 
 * }
 * }
 */
// WaterStore Optimized Approach-Two pointer
/*
 * public class MultiList {
 * public static int storeWater(ArrayList<Integer> line) {
 * int maxWater = 0;
 * int lp = 0;
 * int rp = line.size() - 1;
 * while (lp < rp) {
 * // cal water area
 * int ht = Math.min(line.get(lp), line.get(rp));
 * int width = rp - lp;
 * int currWater = ht * width;
 * maxWater = Math.max(maxWater, currWater);
 * // update rp and lp
 * if (line.get(lp) < line.get(rp)) {
 * lp++;
 * } else {
 * rp--;
 * }
 * 
 * }
 * return maxWater;
 * }
 * 
 * public static void main(String args[]) {
 * ArrayList<Integer> line = new ArrayList<>();
 * // 1,8,6,2,5,4,8,3,7
 * line.add(1);
 * line.add(8);
 * line.add(6);
 * line.add(2);
 * line.add(5);
 * line.add(4);
 * line.add(8);
 * line.add(3);
 * line.add(7);
 * System.out.print(storeWater(line));
 * 
 * }
 * }
 */
// PAIR SUM-1
/*
 * public class MultiList {
 * // brute force
 * public static boolean pairSum1(ArrayList<Integer> line, int target) {
 * for (int i = 0; i < line.size(); i++) {
 * for (int j = i + 1; j < line.size(); j++) {
 * if (line.get(i) + line.get(j) == target) {
 * return true;
 * }
 * }
 * }
 * return false;
 * }
 * 
 * public static void main(String args[]) {
 * ArrayList<Integer> line = new ArrayList<>();
 * // 1,8,6,2,5,4,8,3,7
 * line.add(1);
 * line.add(2);
 * line.add(3);
 * line.add(4);
 * line.add(5);
 * line.add(6);
 * int target = 50;
 * System.out.print(pairSum1(line, target));
 * 
 * }
 * }
 */
// 2-pointer approac
/*
 * public class MultiList {
 * // brute force
 * public static boolean pairSum1(ArrayList<Integer> line, int target) {
 * int lp = 0;
 * int rp = line.size() - 1;
 * while (lp != rp) {
 * if (line.get(lp) + line.get(rp) == target) {
 * return true;
 * } else if (line.get(lp) + line.get(rp) < target) {
 * lp++;
 * }
 * if (line.get(lp) + line.get(rp) > target) {
 * rp--;
 * }
 * }
 * return false;
 * }
 * 
 * public static void main(String args[]) {
 * ArrayList<Integer> line = new ArrayList<>();
 * // 1,8,6,2,5,4,8,3,7
 * line.add(1);
 * line.add(2);
 * line.add(3);
 * line.add(4);
 * line.add(5);
 * line.add(6);
 * int target = 5;
 * System.out.print(pairSum1(line, target));
 * 
 * }
 * }
 */
//practice quetsion 2 Monotonic arrayList
/*public class MultiList {
    public static List<Integer> lonely(ArrayList<Integer> ArrMonotonic) {
        List<Integer> lonelyNumbers = new ArrayList<>();
        for (int i = 0; i < ArrMonotonic.size(); i++) {
            boolean x = true;
            int curr = ArrMonotonic.get(i);
            for (int j = 0; j < ArrMonotonic.size(); j++) {
                if (i != j && (ArrMonotonic.get(j) == curr || ArrMonotonic.get(j) == curr + 1
                        || ArrMonotonic.get(j) == curr - 1)) {
                    x = false;
                    break;
                }
            }
            if (x) {
                lonelyNumbers.add(curr);
            }
        }
        return lonelyNumbers;
    }

    public static void main(String args[]) {
        ArrayList<Integer> ArrMonotonic = new ArrayList<>();
        ArrMonotonic.add(1);
        ArrMonotonic.add(3);
        ArrMonotonic.add(5);
        ArrMonotonic.add(3);
        System.out.print(lonely(ArrMonotonic));
    }
}*/
/*public class MultiList {
    public static void Occurence(ArrayList<Integer> ArrMonotonic, int key) {
        ArrayList<Integer> Occur = new ArrayList<>();
        for (int i = 0; i < ArrMonotonic.size() - 1; i++) {
            if (ArrMonotonic.get(i) == key) {
                Occur.add(ArrMonotonic.get(i + 1));
            }
        }
        System.out.println(Occur);
        int maxNumber = 0;
        int maxCount = 0;
        for (int i = 0; i < Occur.size(); i++) {
            int number = Occur.get(i);
            int count = 0;
            for (int j = 0; j < Occur.size(); j++) {
                if (Occur.get(j) == number) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxNumber = number;
                maxCount = count;
            }
        }

        System.out.println(maxNumber);
    }

    public static void main(String args[]) {
        ArrayList<Integer> ArrMonotonic = new ArrayList<>();
        ArrMonotonic.add(1);
        ArrMonotonic.add(1);
        ArrMonotonic.add(1);
        ArrMonotonic.add(1);
        ArrMonotonic.add(100);
        int key = 1;
        Occurence(ArrMonotonic, key);
    }
}*/

