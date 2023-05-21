/*
 * public class backtrack {
 * public static void ChangeArr(int arr[], int i, int val) {
 * // base case
 * if (i == arr.length) {
 * printArr(arr);
 * return;
 * }
 * // recursion
 * arr[i] = val;
 * ChangeArr(arr, i + 1, val + 1);// recursion
 * arr[i] = arr[i] - 2;// backtrack
 * }
 * 
 * public static void printArr(int arr[]) {
 * for (int i = 0; i < arr.length; i++) {
 * System.out.print(arr[i] + " ");
 * }
 * System.out.println();
 * }
 * 
 * public static void main(String args[]) {
 * int arr[] = new int[5];
 * ChangeArr(arr, 0, 1);
 * printArr(arr);
 * }
 * }
 */
// sub string
/*
 * public class backtrack {
 * public static void findSubset(String str, String ans, int i) {
 * // base case
 * if (i == str.length()) {
 * System.out.println(ans);
 * return;
 * }
 * // Yes choice
 * findSubset(str, ans + str.charAt(i), i + 1);
 * // No choice
 * findSubset(str, ans, i + 1);
 * }
 * 
 * public static void main(String args[]) {
 * String str = "abc";
 * findSubset(str, "", 0);
 * }
 * }
 */
/*
 * public class backtrack {
 * public static void findPermutation(String str, String ans) {
 * // base case
 * if (str.length() == 0) {
 * System.out.println(ans);
 * return;
 * }
 * for (int i = 0; i < str.length(); i++) {
 * char curr = str.charAt(i);
 * String Newstr = str.substring(0, i) + str.substring(i + 1);
 * findPermutation(Newstr, ans + curr);
 * 
 * }
 * }
 * 
 * public static void main(String args[]) {
 * String str = "abc";
 * findPermutation(str, "");
 * }
 * }
 */
// N-queen problem
/*
 * public class backtrack {
 * public static boolean isSafe(char board[][], int row, int col) {
 * // vertical up
 * for (int i = row - 1; i >= 0; i--) {
 * if (board[i][col] == 'Q') {
 * return false;
 * }
 * }
 * // diag left up
 * for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
 * if (board[i][j] == 'Q') {
 * return false;
 * }
 * }
 * // diag rigt
 * for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
 * if (board[i][j] == 'Q') {
 * return false;
 * }
 * }
 * return true;
 * }
 * 
 * public static void nQueen(char board[][], int row) {
 * if (row == board.length) {
 * count++;
 * printBoard(board);
 * return;
 * }
 * // column loop
 * for (int j = 0; j < board.length; j++) {
 * if (isSafe(board, row, j)) {
 * board[row][j] = 'Q';
 * nQueen(board, row + 1);// fxn call
 * board[row][j] = 'X';// backtrack
 * }
 * }
 * }
 * 
 * public static void printBoard(char board[][]) {
 * System.out.println("-----board-----");
 * for (int i = 0; i < board.length; i++) {
 * for (int j = 0; j < board.length; j++) {
 * System.out.print(board[i][j] + " ");
 * }
 * System.out.println();
 * }
 * }
 * 
 * static int count = 0;
 * 
 * public static void main(String args[]) {
 * int n = 5;
 * char board[][] = new char[n][n];
 * // initialize
 * for (int i = 0; i < n; i++) {
 * for (int j = 0; j < n; j++) {
 * board[i][j] = 'X';
 * }
 * }
 * nQueen(board, 0);
 * System.out.println("total no of ways to solve n-queen problem=" + count);
 * }
 * }
 */
// grid ways
/*
 * public class backtrack {
 * public static int gridways(int i, int j, int n, int m) {
 * // base case
 * if (i == n - 1 && j == m - 1) {
 * // condn for last cell
 * return 1;
 * } else if (i == n || j == n) {
 * // boundary condn cross
 * return 0;
 * }
 * int w1 = gridways(i + 1, j, n, m);
 * int w2 = gridways(i, j + 1, n, m);
 * return w1 + w2;
 * 
 * }
 * 
 * public static void main(String args[]) {
 * int n = 3, m = 3;
 * System.out.println(gridways(0, 0, n, m));
 * }
 * }
 */
