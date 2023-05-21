
// Print no from 1 to 10 decreasing.
/*
 * public class recursionBasics {
 * public static void printDec(int n){
 * if(n==1){
 * System.out.println(n);
 * return;
 * }
 * System.out.print(n+" ");
 * printDec(n-1);
 * }
 * public static void main(String arg[]){
 * int n=10;
 * printDec(n);
 * }
 * }
 */
// print no. in increasing order
/*
 * public class recursionBasics{
 * public static void printInc(int n){
 * if(n==1){
 * System.out.print(1);
 * return;
 * }
 * printInc(n-1);
 * System.out.print(n+"");
 * 
 * }
 * public static void main(String args[]){
 * int n=10;
 * printInc(n);
 * }
 * }
 */
// factorial of no. n
/*
 * public class recursionBasics{
 * public static int factorial(int n){
 * if(n==0){
 * return 1;
 * }
 * int f=factorial(n-1);
 * int fn = n*f;
 * return fn;
 * }
 * public static void main(String args[]){
 * int n=3;
 * System.out.print(factorial(n));
 * }
 * }
 */
// print sum of n natural no.
/*
 * public class recursionBasics{
 * public static int Sum(int n){
 * if(n==1){
 * return 1;
 * }
 * int a=Sum(n-1);
 * int b=n+a;
 * return b;
 * }
 * public static void main(String args[]){
 * int n=5;
 * System.out.print(Sum(5));
 * }
 * }
 */
// ceck if given array is sorted or not
/*public class recursionBasics {
    public static boolean IsSort(int arr[], int i) {
        //base case
        if (i == arr.length-1){
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return IsSort(arr,i+1);
    }

    public static void main(String args[]){
       int arr[]={1,2,3,4,7,6};
       System.out.print(IsSort(arr,0));
    }
}*/
//first occurence of element in an array
/*public class recursionBasics{
    public static int Foccurence(int arr[],int n,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==n){
            return i;
        }
        return Foccurence(arr,10,i+1);
    }
    public static void main(String args[]){
    int arr[]={1,3,4,5,7,88,9};
    System.out.print(Foccurence(arr,10,0));
    }
}
*/
//last occurence in an array
/*public class recursionBasics{
    public static int Loccurence(int arr[],int n,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=Loccurence(arr,4,i+1);
        if(isFound==-1 && arr[i]==n){
            return i;
        }
        return isFound;
    }
    public static void main(String args[]){
    int arr[]={1,3,4,5,7,4,88,9};
    System.out.print(Loccurence(arr,4,0));
    }
}*/
//print X^n
/*public class recursionBasics{
    public static int Pow(int x, int n){ 
        if(n==0){
            return 1;
        }
        return x*Pow(x,n-1);
    }
    public static void main(String args[]){
        System.out.print(Pow(2,5));
    }
}*/
//optimized power in o(logn) TC
/*public class recursionBasics {
    public static int optimizedPower(int a, int n) {
        if(n==0){
            return 1;
        }
        int pow=optimizedPower(a, n / 2);
        int PowerSq = pow*pow;

        //n is odd
        if(n%2!=0){
            PowerSq=a*PowerSq;
        }
        return PowerSq;
    }

    public static void main(String args[]) {
        int a = 2;
        int n = 10;
        System.out.print(optimizedPower(a,n));
    }
}*/
//Tiling problem
/*public class recursionBasics {
    public static int TilingProblem(int n) {// 2 x n (floor size)
        
        if(n==0||n==1){
            return 1;
        }
        // kaam
        // vertical coice
        int fnm1 = TilingProblem(n - 1);
        //orizontal coice
        int fnm2 = TilingProblem(n-2);
        int toWays=fnm1+fnm2;
        return toWays;

    }

    public static void main(String args[]) {
        System.out.print(TilingProblem(3));
    }
}*/
//remove duplicate letters
/*public class recursionBasics {
    public static void removeDuplicate(String str,int idx,StringBuilder newStr,boolean maps[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar=str.charAt(idx);
        if(maps[currChar-'a']==true){
           removeDuplicate(str, idx+1,newStr,maps);
        }
        else{
            maps[currChar-'a']=true;
            removeDuplicate(str,idx+1,newStr.append(currChar),maps);
        }
    }

    public static void main(String args[]) {
        String str="appnnacollege";
        removeDuplicate(str ,0,new StringBuilder(""),new boolean[26]);
    }
}*/
//ForagivenintegerarrayofsizeN.Youhavetofindalltheoccurrences(indices)ofagivenelement(Key)andprintthem.Usearecursivefunctiontosolvethisproblem
/*public class recursionBasics{
    public static void occurence(int arr[],int key,int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        occurence(arr,22,i+1); 
    }
    public static void main(String args[]){
        int arr[]={1,2,3,5,6,12,22,22,1};
        occurence(arr,22,0);
    }
}*/
/*public class recursionBasics {
    public static int lengthString(String a, int i) {
        if (a.length() == i) {
                return i;
        }
        int x = lengthString(a, i + 1);
        return x;

    }

    public static void main(String args[]) {
        String a = "";
        System.out.print(lengthString(a, 0));
    }
}*/
import java.util.Scanner;

public class recursionBasics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
