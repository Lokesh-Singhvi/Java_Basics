/* 
public class DataSt {
*/
/*
 * public static int linearSearc(int number[], int key) {
 * for (int i = 0; i < number.length; i++) {
 * if (number[i] == key) {
 * return i;
 * }
 * }
 * 
 * return -1;
 * }
 * 
 * public static int StLinear(String menu[], String item) {
 * for (int j = 0; j < menu.length; j++) {
 * if (menu[j] == item) {
 * return j;
 * }
 * }
 * return -1;
 * }
 */
/*
 * public static int GreatestNum(int number[]){
 * int largest=Integer.MIN_VALUE;
 * int smallest=Integer.MAX_VALUE;
 * for(int i=0;i<number.length;i++){
 * if(largest<number[i]){
 * largest=number[i];
 * }
 * if(smallest>number[i]){
 * smallest=number[i];
 * }
 * }
 * System.out.println("Smallest value is "+ smallest);
 * return largest;
 * 
 * }
 */
/*
 * public static int BinarySearc(int number[],int key){
 * int start=0;
 * int end=number.length-1;
 * while(start<=end){
 * int mid=(start+end)/2;
 * //comparision
 * if(number[mid]==key){
 * return mid;
 * }
 * if(number[mid]<key){
 * start=mid+1;
 * }
 * else{
 * end=mid-1;
 * }
 * }
 * return -1;
 * }
 */
/*  public static void Reverse(int number[]){
     int start=0,end=number.length-1;
       while(start<end){
        
         int temp=number[end];
         number[end]=number[start];
         number[start]=temp;
         start++;
         end--;
       }
 }*/
/*public static void PairArray(int number[]){
    for(int i=0;i<number.length;i++){
        int current=number[i];
        for(int j=i+1;j<number.length;j++){
            System.out.print("("+current+","+number[j]+")");
        }
        System.out.println( );
    }
    
}*/
/*public static void SubArrayMaxSum(int number[]){
    int curSum=0;
    int maxSum=Integer.MIN_VALUE;
    for(int i=0;i<number.length;i++){
        int start=i;
        for(int j=i;j<number.length;j++){
            int end=j;
            curSum=0;
            for(int k=start;k<=end;k++){
                curSum+=number[k];
                
            }
            System.out.print(curSum+" ");
            if(maxSum<curSum){
                maxSum=curSum;
            }

           
        }
       
    }
    System.out.print("Max-sum is"+maxSum);
}*/
/*public static void SubArray(int number[]){
   
   
    for(int i=0;i<number.length;i++){
        int start=i;
        for(int j=i;j<number.length;j++){
            int end=j; 
            for(int k=start;k<=end;k++){
                System.out.print(number[k]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
}*/
/* public static void BubbleSort(int number[]){
     for(int i=0;i<number.length-1;i++){
         for(int j=0;j<number.length-1-i;j++){
             if(number[j]>number[j+1]){
                 int temp=number[j];
                 number[j]=number[j+1];
                 number[j+1]=temp;
             }
         }
     }
 }*/
/* 
public static void main(String args[]) {
    /*int number[] = { 1,2,3,4,5 };
    BubbleSort(number);

    for(int i=0;i<number.length;i++){
        System.out.print(number[i]+" ");
    }*/
/*int number[] = { 1,2,3,4,5 };
SubArray(number);*/
/*int number[] = { 1,2,3,4,5 };
SubArrayMaxSum(number);*/

/*  int number[] = { 1,2,3,4 };
Reverse(number);
PairArray(number);
for (int i = 0; i < number.length; i++) {
    System.out.print(number[i] + " ");
}
System.out.println();*/

/*
 * int number[] = { 3, 6, 9, 12, 15, 18, 21, 24, 27, 30 };
 * int key = 21;
 * System.out.println("index for key is :" + BinarySearc(number, key));
 */
/*
 * int number[]={1,3,5,7,9,10,12};
 * System.out.println("Largest value is "+GreatestNum(number));
 */

/*
 * int number[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
 * String menu[] = { "dosa", "cole-bature", "samosa" };
 * String item = "dosa";
 * int key = 20;
 * int index = linearSearc(number, key);
 * if (index == -1) {
 * System.out.println("Not Found");
 * } else {
 * System.out.println("Key is at index" + index);
 * }
 * int ind = StLinear(menu,item);
 * if (ind == -1) {
 * System.out.println("Not Found");
 * } else {
 * System.out.println("item is at index" +""+ind);
 * }
 */
/* 
}
}*/
public class DataSt {
    public static int trappedRainwater(int height[]) {
        // cal left max boundary-array
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // cal rigt max boundary-array
        int RightMax[] = new int[height.length];
        RightMax[height.length - 1] = height[height.length-1];
        for (int i = height.length - 2; i>=0 ; i--) {
            RightMax[i] = Math.max(height[i], RightMax[i + 1]);
        }
        // loop
        // waterlevel=min(left max,rugt max)
        // trapped water=waterLevel-heigt[i]
        int trappedwater=0;
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(RightMax[i], leftMax[i]);
             trappedwater += waterLevel - height[i];
        }
        return trappedwater;
    }

    public static void main(String args[]) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedRainwater(height));
    }
}
