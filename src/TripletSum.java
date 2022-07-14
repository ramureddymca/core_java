import java.util.Arrays;

public class TripletSum {

    public static void main(String[] args) {
        int a [] = {6, -1, 0};
        System.out.println(checkSumIsEqualToTarget(a, 5));
    }

    private static boolean checkSumIsEqualToTarget(int[] a, int k) {

        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            int start =0, end = a.length;
            while (start<end){
               int sum = a[i]+a[start]+a[end-1];
               if (sum == k)
                   return true;
               else if (sum>k){
                   end--;
               }else {
                   start++;
               }

            }
        }
        return false;
    }
}
