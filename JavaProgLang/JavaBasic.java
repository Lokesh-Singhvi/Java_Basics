/* 
//basic program
//conditional statements:-
import java.util.*;

public class JavaBasic {
    public static void main(String arg[]) {
      /* largest number
       int a,b,c;
       System.out.print("enter a numbers:-");
       Scanner sc =new Scanner (System.in);
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       if(a>b&&a>c){
        System.out.print("a="+ a +"is largest number");
       }
       else if(b>a&&b>c){
        System.out.print("b="+ b +"is largest number");
       }
       else{
        System.out.print("c="+ c +"is largest number");
       }
       */
/*even and odd number
int a;
Scanner sc =new Scanner (System.in);
a=sc.nextInt();
if(a%2==0){
 System.out.print(a+ "is even number");
}
else{
 System.out.print("number is odd");
}*/
//income tax calculator
/*long income;
Scanner sc =new Scanner (System.in);
income=sc.nextLong();
if(income<500000){
 
 System.out.println("Your sallary is"+ income + "and as no tax");
}
else if(income>=500000&&income<=1000000){
 double tax;
 tax=income*0.2f;
 income=(long) (income-tax);
 System.out.println("Your sallary is"+ income );
}
else{
 double tax;
 tax=income*0.3f;
 income=(long) (income-tax);
 System.out.print("Your sallary is"+ income  );
}*/
/* leap year
Scanner sc=new Scanner(System.in);
System.out.print("Input the year: ");
int year=sc.nextInt();
boolean x= (year%4) ==0;
boolean y= (year%100) !=0;
boolean z= ((year%100==0) && (year%400==0));
if(x&& (y||z)) {
 System.out.println(year+" is a leap year");
}
else{
 System.out.println(year+" is not a leapyear");
}
*/
//--------------------------------------PATTERN-------------------------------------------------------------------
/*   for(int i=0;i<5;i++){
   for(int star=0;star<i;star++){
     System.out.print("*");
   }
   System.out.println( );
  }

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

 for(int i=1;i<=n;i++){
      for(int star=1;star<=n-i+1;star++){
       System.out.print("*");
      }
      System.out.println( );
 }

 Scanner var=new Scanner(System.in);
 int m=var.nextInt();
 for(int i=1;i<=m;i++){
   for(int num=1;num<i;num++){
     System.out.print(num);
   }
    System.out.println() ;
 } */
//---------------------PRODUCT OF FUNCTION-------------------------
/*  import java.util.*;
 public class JavaBasic {
   public static int product(int a,int b){
     int prod=a*b;
    // System.out.print(prod);
   return prod;
   }
   public static void main(String arg[]) {
     Scanner sc=new Scanner (System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int prod= product(a,b);
     System.out.print(prod);
     

   }
 }*/

/*------------factorial---------------------
import java.util.*;
public class JavaBasic {
  public static void factorial(int b){
    int a=1;
    for(int i=1;i<=b;i++){
      a=a*i;
      
    }
    System.out.println(a);
  }
  
  public static void main(String arg[]) {
   
    Scanner sc=new Scanner (System.in);
    int b=sc.nextInt();
    factorial(b);

  }
}*/
/*----Binomial coefficient----------------
import java.util.*;
public class JavaBasic {
  public static int factorial(int n){
    int a=1;
    for(int i=1;i<=n;i++){
      a=a*i;
    }
    return a;
  }
  
  
  public static void main(String arg[]) {
   
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int r=sc.nextInt();
    int fact_n=factorial(n);
    int fact_r=factorial(r);
    int fact_nmr=factorial(n-r);
    int bino=fact_n / (fact_r*fact_nmr);
    System.out.println(bino);
  }
}*/

//-------------prime no-------------------
/*import java.util.*;

public class JavaBasic {
  public static boolean Isprime(int n) {
    boolean isprime = true;
    for (int i = 2; i < Math.sqrt(n); i++) {
      if (n % i == 0) {
        isprime = false;
        break;
      }
    }
    return isprime;
  }

  public static void main(String arg[]) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print(Isprime(n));
  }
}*/
//------------------------------STRINGS-------------------------------------
//CECK IF STRING IS PALLINDROME
//RACECAR,NOON,MADAM
import java.util.*;

/*public class JavaBasic {
  public static boolean ispalindrome(String str) {
    for (int i = 0; i <= str.length() / 2; i++) {
      int n = str.length();
      if (str.charAt(i) != str.charAt(n - i - 1)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String arg[]) {
    String str = "lokes";
    System.out.println(ispalindrome(str));
  }
}*/
public class JavaBasic {
  public static float EWMS(String dist) {
    int x = 0, y = 0;
    for (int i = 0; i < dist.length(); i++) {
      char dir = dist.charAt(i);
      if(dir=='S'){
        y--;
      }
      if(dir=='W'){
        x--;
      }
      if(dir=='E'){
        x++;
      }
      if(dir=='N'){
        y++;
      }
      
    }
    int x2=x*x;
    int y2=y*y;
    return (float)Math.sqrt(x2+y2);

  }

  public static void main(String arg[]) {
    String dist = "WNEENESENNN";
    System.out.println(EWMS(dist));
  }
}