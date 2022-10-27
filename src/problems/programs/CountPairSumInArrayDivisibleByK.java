package problems.programs;

public class CountPairSumInArrayDivisibleByK {
    public static void main(String[] args) {
        int[] arr = {5, 9, 36, 74, 52, 31, 42};
        int k = 3;

        int[] modularSpace = new int[k];
        for (int i = 0; i < arr.length; i++) {
            modularSpace[arr[i] % k]++;
        }

        int sum = (modularSpace[0] * (modularSpace[0] - 1) / 2);
        for (int i = 1; i <= modularSpace.length / 2; i++) {
            if (i == modularSpace.length / 2 && k % 2 == 0) {
                sum += (modularSpace[i] * (modularSpace[i] - 1) / 2);
            } else {
                sum += modularSpace[i] * modularSpace[k - i];
            }
        }

        System.out.println(sum);
    }
}
