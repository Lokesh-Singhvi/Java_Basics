// stack using arraylist
/*
 * import java.util.*;
 * 
 * public class StackB {
 * static class Stack {
 * static ArrayList<Integer> list = new ArrayList<>();
 * 
 * public static boolean isEmpty() {
 * return list.size() == 0;
 * }
 * 
 * // push
 * public static void push(int data) {
 * list.add(data);
 * }
 * 
 * // pop
 * public static int pop() {
 * if(isEmpty()){
 * return -1;
 * }
 * int top = list.get(list.size() - 1);
 * list.remove(list.size() - 1);
 * return top;
 * }
 * 
 * // peek
 * public static int peek() {
 * if(isEmpty()){
 * return -1;
 * }
 * return list.get(list.size() - 1);
 * }
 * }
 * 
 * public static void main(String args[]) {
 * Stack s=new Stack();
 * s.push(1);
 * s.push(2);
 * s.push(3);
 * while(!s.isEmpty()){
 * System.out.println(s.peek());
 * s.pop();
 * }
 * }
 * }
 */
// stack using linkedlist
/*
 * import java.util.*;
 * 
 * public class StackB {
 * static class Node{
 * int data;
 * Node next;
 * Node(int data){
 * this.data=data;
 * this.next=null;
 * }
 * }
 * static class Stack {
 * static Node head=null;
 * public static boolean isEmpty(){
 * return head==null;
 * }
 * public static void push(int data){
 * Node newNode =new Node(data);
 * if(isEmpty()){
 * head=newNode;
 * return;
 * }
 * newNode.next=head;
 * head=newNode;
 * }
 * public static int pop(){
 * if(isEmpty()){
 * return -1;
 * }
 * int top=head.data;
 * head=head.next;
 * return top;
 * }
 * public static int peek(){
 * if(isEmpty()){
 * return -1;
 * }
 * return head.data;
 * }
 * 
 * }
 * 
 * public static void main(String args[]) {
 * Stack s=new Stack();
 * s.push(1);
 * s.push(2);
 * s.push(3);
 * while(!s.isEmpty()){
 * System.out.println(s.peek());
 * s.pop();
 * }
 * }
 * }
 */
// stack using java collection framework

/*
 * import java.util.*;
 * public class StackB{
 * 
 * public static void main(String args[]) {
 * //Stack s=new Stack();
 * Stack <Integer> s= new Stack<>();
 * s.push(1);
 * s.push(2);
 * s.push(3);
 * while(!s.isEmpty()){
 * System.out.println(s.peek());
 * s.pop();
 * }
 * }
 * }
 */
// Question 1 push at bottom of stack

import java.util.*;

import javax.sql.rowset.spi.SyncResolver;

/*
 * public class StackB {
 * public static void pushAtBottom(Stack<Integer> s,int data){
 * if(s.isEmpty()){
 * s.push(data);
 * return;
 * }
 * int top=s.pop();
 * pushAtBottom(s, data);
 * s.push(top);
 * }
 * public static void main(String args[]){
 * Stack <Integer> s=new Stack<>();
 * s.push(1);
 * s.push(2);
 * s.push(3);
 * pushAtBottom(s,4);
 * while(!s.isEmpty()){
 * System.out.println(s.pop());
 * }
 * }
 * }
 */
// rev a string using stack
/*
 * public class StackB {
 * public static String reverseString(String str){
 * Stack<Character> s= new Stack<>();
 * int idx=0;
 * while(idx<str.length()){
 * s.push(str.charAt(idx));
 * idx++;
 * }
 * StringBuilder result = new StringBuilder("");
 * while(!s.isEmpty()){
 * char curr=s.pop();
 * result.append(curr);
 * 
 * }
 * return result.toString();
 * }
 * 
 * public static void main(String args[]) {
 * String str ="abc";
 * System.out.println(reverseString(str));
 * }
 * }
 */
// reverse a stack
/*
 * public class StackB {
 * public static void pushAtBottom(Stack<Integer> s,int data){
 * if(s.isEmpty()){
 * s.push(data);
 * return;
 * }
 * int top=s.pop();
 * pushAtBottom(s, data);
 * s.push(top);
 * }
 * public static void reverseStack(Stack <Integer> s){
 * if(s.isEmpty()){
 * return;
 * }
 * int top=s.pop();
 * reverseStack(s);
 * pushAtBottom(s, top);
 * }
 * public static void printStack(Stack<Integer> s){
 * while(!s.isEmpty()){
 * System.out.println(s.pop());
 * }
 * }
 * public static void main(String args[]) {
 * Stack<Integer> s=new Stack<>();
 * s.push(1);
 * s.push(2);
 * s.push(3);
 * printStack(s);
 * reverseStack(s);
 * printStack(s);
 * }
 * }
 */
// Stock span problem
/*
 * public class StackB {
 * public static void stockSpan(int stocks[],int span[]){
 * Stack<Integer> s=new Stack<>();
 * span[0]=1;
 * s.push(0);
 * for(int i=1;i<stocks.length;i++){
 * int currPrice=stocks[i];
 * while(!s.isEmpty()&&currPrice>stocks[s.peek()]){
 * s.pop();
 * }
 * if(s.isEmpty()){
 * span[i]=i+1;
 * }
 * else{
 * int prevHigh=s.peek();
 * span[i]=i-prevHigh;
 * }
 * s.push(i);
 * }
 * 
 * }
 * 
 * public static void main(String args[]){
 * int stocks[]={100,80,60,70,60,85,100};
 * int span[]=new int[stocks.length];
 * stockSpan(stocks,span
 * ;
 * for(int i=0;i<span.length;i++){
 * System.out.println(span[i]+" ");
 * }
 * 
 * }
 * }
 */
// Next Greater Element
/*
 * import java.util.Stack;
 * 
 * public class StackB {
 * public static void main(String args[]) {
 * int arr[] = {6, 8, 0, 1, 3};
 * Stack<Integer> s = new Stack<>();
 * int nextGreater[] = new int[arr.length];
 * 
 * for (int i = arr.length - 1; i >= 0; i--) {
 * // while loop
 * while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
 * s.pop();
 * }
 * // if-else
 * if (s.isEmpty()) {
 * nextGreater[i] = -1;
 * } else {
 * nextGreater[i] = arr[s.peek()];
 * }
 * // push in s
 * s.push(i);
 * }
 * for (int i = 0; i < nextGreater.length; i++) {
 * System.out.print(nextGreater[i] + " ");
 * }
 * System.out.println();
 * }
 * }
 */
// Valid Parenthesis

/*
 * public class StackB {
 * public static boolean isValid(String str) {
 * Stack<Character> s = new Stack<>();
 * for (int i = 0; i < str.length(); i++) {
 * char ch = str.charAt(i);
 * // open parenthesis
 * if (ch == '(' || ch == '{' || ch == '[') {
 * s.push(ch);
 * } else {
 * // closing
 * if (s.isEmpty()) {
 * return false;
 * }
 * if ((s.peek() == '{' && ch == '}') || (s.peek() == '[' && ch == ']') ||
 * (s.peek() == '(' && ch == ')')) {
 * s.pop();
 * } else {
 * return false;
 * }
 * }
 * }
 * if(s.isEmpty()){
 * return true;
 * }else{
 * return false;
 * }
 * }
 * 
 * public static void main(String args[]) {
 * String str = "({})[";
 * System.out.println(isValid(str));
 * }
 * }
 */
// duplicate Parentesis
/*
 * public class StackB {
 * public static boolean DuplicateParenthesis(String str){
 * Stack<Character> s=new Stack<>();
 * for(int i=0;i<str.length();i++){
 * char ch=str.charAt(i);
 * //closing
 * if(ch==')'){
 * int count=0;
 * while(s.peek()!='('){
 * s.pop();
 * count++;
 * }
 * if(count<1){
 * return true;
 * }else{
 * s.pop(); //opening pair
 * }
 * }
 * else{
 * s.push(ch);
 * }
 * 
 * }
 * return false;
 * }
 * 
 * 
 * public static void main(String args[]) {
 * String str = "((a+b))";
 * String str2 = "(a-b)";
 * System.out.println(DuplicateParenthesis(str));
 * System.out.println(DuplicateParenthesis(str2));
 * }
 * }
 */
// Max area 
/*public class StackB {
    public static void maxArea(int arr[]) {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
        // next smaller right
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                // top
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // next smaller left
        s = new Stack<>();
        for (int i = 0; i < arr.length - 1; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                // top
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // current area
        // widt=j-i-1 =nsr[i]-nrl[i]-1
        for(int i=0;i<arr.length;i++){
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int CurrArea=height*width;
            maxArea=Math.max(CurrArea,maxArea);
        }
        System.out.println(maxArea);
    }

    public static void main(String args[]) {
        int arr[] = { 2, 1, 5, 6, 2, 3 }; // height of histogram
        maxArea(arr);
    }
}*/
