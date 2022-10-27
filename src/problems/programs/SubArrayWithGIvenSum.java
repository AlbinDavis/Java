package problems.programs;

import java.util.ArrayList;

public class SubArrayWithGIvenSum {

    public static void main(String[] args) {
        int[] arr =
                //{1 ,2, 13, 5 ,7};
                {1,2,3,7,5};
                //{1,2,3,4};
        int s=12;
        ArrayList<Integer> list = new ArrayList<>();
        int startIndex = 0;
        int sum = arr[0];
        int i = 1;
        if(arr[0]==s){
            list.add(1);
            list.add(1);
            System.out.println(list);
            System.exit(0);
        }
        while (i < arr.length) {

            sum += arr[i];


            while (sum > s) {
                sum -= arr[startIndex];
                startIndex += 1;
            }
            if (sum == s) {
                list.add(startIndex + 1);
                list.add(i + 1);
                System.out.println(list);
                System.exit(0);
            }
            i += 1;



        }
        if(arr[arr.length-1]==s){
            list.add(arr.length);
            list.add(arr.length);
            System.out.println(list);
            System.exit(0);
        }
        // else
        list.add(-1);
        System.out.println(list);
        System.exit(0);
    }
}
