import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main (String args[]) {

        Scanner scanner = new Scanner(System.in);

        int l;
        int m;
        int target;


        System.out.println("Введите длину массива 1");
        l = scanner.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        arr1.add(l);
        System.out.println("Введите значения элементов массива");
        for (int i = 0; i < l; i++){
            arr1.add(scanner.nextInt());
        }

        System.out.println("Введите длину массива 2");
        m = scanner.nextInt();
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr2.add(m);
        System.out.println("Введите значения элементов массива");
        for (int i = 0; i < m; i++){
            arr2.add(scanner.nextInt());
        }

        System.out.println("Введите целевое число");
        target = scanner.nextInt();

        System.out.println("Количество совпадений: " + two_sum(arr1, arr2, target));

    }

    public static int two_sum (ArrayList<Integer> arr1, ArrayList<Integer> arr2, Integer n){
        int result = 0;

        Map<Integer, Integer> map1 = new HashMap<>();
        for (int i = 1; i < arr1.size(); i++) {
            map1.put(arr1.get(i), i);
        }

        Map<Integer, Integer> map2 = new HashMap<>();
        for (int i = 1; i < arr2.size(); i++){
            map2.put(arr2.get(i), i);
        }

        if (arr1.get(0) >= arr2.get(0)){
            for (int i = 1; i < arr1.size(); i++){
                int complement = n - arr1.get(i);
                if (map2.containsKey(complement)){
                    result ++;
                }
            }
        }
        else {
            for (int i = 1; i < arr2.size(); i++){
                int complement = n - arr2.get(i);
                if (map1.containsKey(complement)){
                    result ++;
                }
            }
        }

        return result;

    }
}