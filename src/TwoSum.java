import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main (String args[]) {
        int[] arr1 = new int[] {3, 5, 7, 2};
        int [] arr2 = new int [] {5, 1, 2, 3, 7, 9};
        int target = 4;

        System.out.println(two_sum(arr1, arr2, target));

    }

    public static int two_sum (int[] arr1, int[] arr2, Integer n){
        int result = 0;

        Map<Integer, Integer> map1 = new HashMap<>();
        for (int i = 1; i < arr1.length; i++) {
            map1.put(arr1[i], i);
        }

        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 1; i < arr2.length; i++){
            map2.put(arr2[i], i);
        }

        if (arr1[0] >= arr2[0]){
            for (int i = 1; i < arr1.length; i++){
                int complement = n - arr1[i];
                if (map2.containsKey(complement)){
                    result ++;
                }
            }
        }
        else {
            for (int i = 1; i < arr2.length; i++){
                int complement = n - arr2[i];
                if (map1.containsKey(complement)){
                    result ++;
                }
            }
        }

        return result;

    }
}