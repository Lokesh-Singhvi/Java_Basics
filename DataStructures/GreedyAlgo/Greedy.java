//activity selection wen array of endtime is sorted
/*package DataStructures.GreedyAlgo;
import java.util.*;
public class Greedy{ 
    public static void main(String args[]){
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};
        
        
        //end time basis sorted
        int maxAct=0;
        ArrayList<Integer> ans =new ArrayList<>();

        //1ST ACTIVITY
        maxAct=1;
        ans.add(0);
        int lastEnd=end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>=lastEnd){
                maxAct++;
                ans.add(i);
                lastEnd=end[i];
            }
        }
     System.out.println("Max activity ="+maxAct);
     for(int i=0;i<ans.size();i++){
        System.out.print("A"+ans.get(i)+" ");
     }
     System.out.println();
    }
}*/
//activity selection -array of end time not sorted so we store it in 2d array ten we sort 2d array and perform operations
package DataStructures.GreedyAlgo;

import java.util.*;

// public class Greedy {
//     public static void main(String args[]) {
//         int start[] = { 1, 3, 0, 5, 8, 5 };
//         int end[] = { 2, 4, 6, 7, 9, 9 };
//         // sorting 2d array
//         int activities[][] = new int[start.length][3];
//         for (int i = 0; i < start.length; i++) {
//             activities[i][0] = i;
//             activities[i][1] = start[i];
//             activities[i][2] = end[i];
//         }
//         Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
//         // end time basis sorted
//         int maxAct = 0;
//         ArrayList<Integer> ans = new ArrayList<>();

//         // 1ST ACTIVITY
//         maxAct = 1;
//         ans.add(activities[0][0]);
//         int lastEnd = activities[0][2];
//         for (int i = 1; i < end.length; i++) {
//             if (activities[i][1] >= lastEnd) {
//                 // activities selection
//                 maxAct++;
//                 ans.add(activities[i][0]);
//                 lastEnd = activities[i][2];
//             }
//         }
//         System.out.println("Max activity =" + maxAct);
//         for (int i = 0; i < ans.size(); i++) {
//             System.out.print("A" + ans.get(i) + " ");
//         }
//         System.out.println();
//     }
// }

//Fractional Knapsack
/*public class Greedy {
    public static void main(String args[]) {
        int val[] = { 60, 100, 120 };
        int wt[] = { 10, 20, 30 };
        int W = 50;
        double ratio[][] = new double[val.length][2];
        // 0th col=>idx; 1st col=>ratio
        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=val[i]/(double)wt[i];
        }
        //ascending order
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));

        int capacity=W;
        int finalVal=0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(capacity>=wt[idx]){
                //include full item
                finalVal+=val[idx];
                capacity-=wt[idx];
            }else{
                //including fractional item
                finalVal+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        System.out.println("final value " + finalVal);


    }
}*/
//MIN ABSOLUTE DIFFRENCE
import java.util.Arrays;

/*public class Greedy {
    public static void main(String args[]) {
        int A[] = { 1, 2, 3 };
        int B[] = { 2, 1, 3 };
        Arrays.sort(A);
        Arrays.sort(B);
        int minDiff = 0;
        for (int i = 0; i < A.length; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }
        System.out.println("Min absolute diff of pairs = " + minDiff);
    }
}*/
//MAX LENGT PAIR
/*public class Greedy {
    public static void main(String args[]){
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int len=1;
        int PairEnd=pairs[0][1]; //last selected pair end
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>PairEnd){
                len++;
                PairEnd=pairs[i][1];
            }      
        }
        System.out.println("max len "+ len);

    }
}*/
//Indian coins
/*public class Greedy{
    public static void main(String args[]){
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins,Comparator.reverseOrder());
        int countOfCoins=0;
        int amount=800;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount-=coins[i];
                }
            }
        }
        System.out.println("total min coins used ="+countOfCoins);
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}*/
//JOB SEQUENCING PROBLEM
public class Greedy {
    static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String args[]){
        int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> jobs = new ArrayList<>();
        for(int i=0;i<jobsInfo.length;i++){
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }
        Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit); //descending
        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;
        for(int i=0;i<jobs.size();i++){
            Job curr =jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
        }
      //print seq
      System.out.println("Max jobs="+seq.size());
      for(int i=0;i<seq.size();i++){
        System.out.println(seq.get(i)+"");
      }
      System.out.println();


    }
}