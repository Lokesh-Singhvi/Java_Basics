import java.util.*;

public class JavaBas {
  // user based fxn:-
  /*
   * public static int calsum(int num1,int num2)//parameters or formal parameters
   * {
   * 
   * int sum=num1+num2;
   * return sum;
   * }
   * public static void main(String arg[]) {
   * Scanner sc= new Scanner(System.in);
   * int a=sc.nextInt();
   * int b=sc.nextInt();
   * int sum=calsum(a,b);//arguments or actual parameters
   * System.out.print(sum);
   * }
   */

  /*
   * public static boolean isprime(int n){
   * 
   * boolean isprime=true;
   * for(int i=2;i<=n-1;i++){
   * if(n % i == 0){
   * isprime=false;
   * break;
   * }
   * 
   * }
   * return isprime;
   * }
   * //prime in range
   * public static void prime_range(int n){
   * for(int i=2;i<=n;i++){
   * if(isprime(i)){ //true
   * System.out.print(i+" ");
   * }
   * }
   * System.out.println();
   * }
   */
  /*
   * public static void bintodec(int binNum) {
   * int mynum=binNum;
   * int pow = 0;
   * int decnum = 0;
   * while (binNum > 0) {
   * int LD = binNum % 10;
   * decnum = decnum + (LD * (int)Math.pow(2, pow));
   * pow++;
   * binNum=binNum/10;
   * 
   * }
   * System.out.println("decimal of "+ mynum +"="+decnum);
   * }
   */
  /*
   * public static void dectobin(int n) {
   * int mynum=n;
   * int pow=0;
   * int bin=0;
   * while(n>0){
   * int rem=n%2;
   * bin=bin+(rem*(int)Math.pow(10,pow));
   * pow++;
   * n=n/2;
   * 
   * }
   * System.out.println("binary form of"+mynum+"="+bin);
   * }
   */
  /*
   * fxn ques2
   * public static boolean isEven(int n){
   * if(n%2==0){
   * System.out.println("even");
   * return true;
   * }
   * else{
   * System.out.println("not even");
   * return false;
   * }
   * }
   */
  /*
   * public static boolean isPal(int num){
   * int rev=0;
   * int temp = num;
   * 
   * while(num>0){
   * 
   * int L=num%10;
   * rev=rev*10+L;
   * num=num/10;
   * }
   * if(rev==temp){
   * System.out.println("palindrome");
   * return true;
   * }
   * else{
   * System.out.println("not palindrome");
   * return false;
   * }
   * 
   * }
   */
  /*
   * public static int sum(int num){
   * int sum=0;
   * while(num!=0){
   * int dig=num%10;
   * sum+=dig;
   * num=num/10;
   * }
   * System.out.println(sum);
   * return 0;
   * }
   */
  /*
   * public static void rect(int rows , int col){
   * //outer loop
   * for(int i=1;i<=rows;i++){
   * //inner loop
   * for(int j=1;j<=col;j++){
   * //cell (i,j)
   * if(i==1||i==rows||j==1||j==col){
   * System.out.print("*");
   * }
   * else{
   * System.out.print(" ");
   * }
   * }
   * System.out.println( );
   * }
   * }
   */
  /*
   * public static void pyramid(int num){
   * for(int i=1 ; i<=num ; i++){
   * for(int j=1;j<=num-i+1;j++){
   * System.out.print(j);
   * }
   * System.out.println( );
   * }
   * 
   * }
   */
  /*
   * public static void pyramid(int n){
   * 
   * int counter=1;
   * for(int i=1;i<=n;i++){
   * for(int j=1;j<=i;j++){
   * System.out.print(counter);
   * counter++;
   * }
   * System.out.println( );
   * }
   * }
   */
  /*
   * public static void triangle(int n){
   * for(int i=1 ;i<=n;i++){
   * for(int j=1;j<=i;j++){
   * if((i+j)%2==0){
   * System.out.print("1");
   * }
   * else{
   * System.out.print("0");
   * }
   * }
   * System.out.println( );
   * }
   * }
   */
  /*
   * public static void butterfly(int n){
   * for(int i=1;i<=n;i++){
   * //star=i
   * for(int j=1;j<=i;j++){
   * System.out.print( "*");
   * }
   * for(int j=1;j<=2*(n-i);j++){
   * System.out.print( " ");
   * }
   * for(int j=1;j<=i;j++){
   * System.out.print( "*");
   * }
   * System.out.println( );
   * }
   * for(int i=n;i>=1;i--){
   * //star=i
   * for(int j=1;j<=i;j++){
   * System.out.print( "*");
   * }
   * //space=2(n-i)
   * for(int j=1;j<=2*(n-i);j++){
   * System.out.print( " ");
   * }
   * //star=i
   * for(int j=1;j<=i;j++){
   * System.out.print( "*");
   * }
   * System.out.println( );
   * }
   * }
   */
  /*
   * public static void rombus(int n){
   * for(int i=1;i<=n;i++){
   * //spaces
   * for(int j=1;j<=n-i;j++){
   * System.out.print( " ");
   * }
   * for(int j=1;j<=n;j++){
   * System.out.print( "*");
   * }
   * System.out.println( );
   * }
   * }
   */
  /*
   * public static void diamond(int n){
   * 
   * for(int i=1;i<=n;i++){
   * //spaces
   * for(int j=1;j<=(n-i);j++){
   * System.out.print( " ");
   * }
   * //star
   * for(int j=1;j<=(2*i)-1;j++){
   * System.out.print( "*");
   * }
   * System.out.println( );
   * }
   * for(int i=n;i>=1;i--){
   * //spaces
   * for(int j=1;j<=n-i;j++){
   * System.out.print( " ");
   * }
   * //star
   * for(int j=1;j<=2*i-1;j++){
   * System.out.print( "*");
   * }
   * System.out.println( );
   * }
   * }
   */

  /*public static void pyramid(int n){
      for(int i=1;i<=n;i++){
        //spaces
        for(int j=1;j<=n-i;j++){
          System.out.print( " ");
          }
        //num
        int j=1;
        while(j<=i){
            System.out.print(i+" ");
            j++;
            }
       
        System.out.println();
      }
    }*/
    /*public static void palindrome(int n){
      for(int i=1;i<=n;i++){
        //spaces
        for(int j=1;j<=n-i;j++){
          System.out.print( " ");
          }
        //num desc
        for(int j=i;j>=1;j--){
          System.out.print( j);
          }
          //num assn
        for(int j=2;j<=i;j++){
            System.out.print( j );
          }
          System.out.println( );
    }
  }*/
  public static void main(String arg[]) {
    /*Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    palindrome(n);*/
    /*Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    pyramid(n);*/
    /*
     * Scanner sc =new Scanner (System.in);
     * int n=sc.nextInt();
     * diamond(n);
     */
    /*
     * Scanner sc =new Scanner (System.in);
     * int n=sc.nextInt();
     * rombus(n);
     */
    /*
     * Scanner sc =new Scanner (System.in);
     * int n=sc.nextInt();
     * butterfly(n);
     */
    /*
     * Scanner sc =new Scanner (System.in);
     * int n=sc.nextInt();
     * triangle(n);
     */
    /*
     * Scanner sc =new Scanner (System.in);
     * int n=sc.nextInt();
     * 
     * pyramid(n);
     */
    /*
     * Scanner sc =new Scanner (System.in);
     * int n=sc.nextInt();
     * pyramid(n);
     */
    // rect(6,6);
    // sum(121);

    // isPal(121);

    // isEven(21);

    // ques1
    /*
     * Scanner sc =new Scanner (System.in);
     * int a=sc.nextInt();
     * int b=sc.nextInt();
     * int c=sc.nextInt();
     * float d=(a+b+c)/3;
     * System.out.println(d);
     */
    // ques2
    /*
     * System.out.println("Enter a side for square");
     * Scanner sc =new Scanner (System.in);
     * int side=sc.nextInt();
     * System.out.println("area of square is-");
     * int area=side*side;
     * System.out.println(area);
     */
    /*
     * ques3
     * Scanner sc = new Scanner(System.in);
     * System.out.println("Enter price of pen , pencil and ereaser:-");
     * float pencil = sc.nextFloat();
     * float pen = sc.nextFloat();
     * float ereaser = sc.nextFloat();
     * float total = pencil + pen + ereaser;
     * System.out.println(total);
     * System.out.println( total+ total % 18);
     */
    /*
     * Scanner sc = new Scanner(System.in);
     * int no = sc.nextInt();
     * if(no>0){
     * System.out.println("positive");
     * }
     * else{
     * System.out.println("negative");
     * }
     */
    /*
     * double temp=88.3;
     * if(temp>100){
     * System.out.println("fever");
     * }
     * else{
     * System.out.println("not fever");
     * }
     */
    /*
     * int num = 3;
     * switch (num) {
     * case 1:
     * System.out.print("Monday");
     * break;
     * case 2:
     * System.out.print("Tuesday");
     * break;
     * case 3:
     * System.out.print("Wednesday");
     * break;
     * case 4:
     * System.out.print("Tursday");
     * break;
     * case 5:
     * System.out.print("Friday");
     * break;
     * case 6:
     * System.out.print("Saturday");
     * break;
     * case 7:
     * System.out.print("Sunday");
     * break;
     * }
     */
    /*
     * Scanner sc=new Scanner(System.in);
     * int number;int choice;int evenSum=0;int oddSum=0;
     * do{
     * System.out.print("Enter the number ");
     * number=sc.nextInt();
     * if(number%2==0)
     * {
     * evenSum+=number;
     * }
     * else
     * {
     * oddSum+=number;
     * }
     * System.out.print("Doyouwanttocontinue?Press1foryesor0forno");
     * choice=sc.nextInt();
     * }while(choice==1);
     * System.out.println("Sum of even numbers: "+evenSum);
     * System.out.println("Sum of odd numbers: "+oddSum);
     */
    // fact of no
    /*
     * System.out.print("Enter the number ");
     * Scanner sc=new Scanner(System.in);
     * int number=sc.nextInt();
     * int i=1;
     * if(number>0){
     * for(int j=2;j<=number;j++){
     * i=i*j;
     * }
     * }
     * else if(number<0){
     * System.out.print("error");
     * }
     * else{
     * System.out.print("error ");
     * }
     * System.out.print(i);
     */
    /*
     * Scanner sc=new Scanner(System.in);
     * int table=sc.nextInt();
     * int i;
     * 
     * for(int j=1;j<=10;j++){
     * i=table*j;
     * System.out.println(i);
     * }
     */

    // bintodec(101);
    // dectobin(12);

    // System.out.println(isprime(12));
    // prime_range(20); //2 to 20
    /*
     * Scanner sc= new Scanner(System.in);
     * int income=sc.nextInt();
     * int tax;
     * if(income<500000){
     * tax=0;
     * }
     * else if(income>=50000 && income<1000000){
     * tax=(int)(income*0.2);
     * }
     * else{
     * tax=(int)(income*0.3);
     * }
     * System.out.print("Your Tax is:-"+ tax);
     */
    /*
     * Scanner sc= new Scanner(System.in);
     * int a=sc.nextInt();
     * int b=sc.nextInt();
     * int c=sc.nextInt();
     * if(a>=b && a>=c){
     * System.out.print(a);
     * }
     * else if(b>=c){
     * System.out.print(b);
     * }
     * else{
     * System.out.print(c);
     * }
     * }
     */
    /*
     * int counter = 0;
     * while (counter < 10) {
     * System.out.println("ello world");
     * counter++;
     * }
     */
    /*
     * for(int line=1;line<=4;line++){
     * System.out.println("****");
     * }
     */
    // reverse no
    /*
     * int n=100899;
     * while(n>0){
     * int l=n%10;
     * System.out.print(l+"");
     * n=n/10;
     * }
     */
    // star pettern
    /*
     * for(int line=1;line<=4;line++){
     * for(int star=1;star<=line;star++){
     * System.out.print("*");
     * }
     * System.out.println();
     * }
     */
    // print inverted star pattern
    
     int n=4;
     for(int line=1;line<=n;line++){
       for(int star=1;star<=n-line+1;star++){
         System.out.print("*");
       }
       System.out.println();
     }
     
    // for printing pattern numbers
    /*
     * int n=4;
     * for(int line=1;line<=n;line++){
     * for(int no=1;no<=line;no++){
     * System.out.print(no);
     * }
     * System.out.println();
     * }
     */
    // for printing pattern cracter
    /*
     * int n = 4;
     * char c = 'A';
     * for (int line = 1; line <= n; line++) {
     * for (int no = 1; no <= line; no++) {
     * System.out.print(c);
     * c++;
     * }
     * System.out.println();
     * 
     * }
     */
    
    

  }
}
