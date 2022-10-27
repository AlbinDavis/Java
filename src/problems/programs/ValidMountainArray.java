package problems.programs;

public class ValidMountainArray {

    public static void main(String[] args) {
        int[] arr = {0, 3, 2, 1};
        boolean isMountainArray = findValidMountainArray(arr);
        System.out.println(isMountainArray);
    }

    private static boolean findValidMountainArray(int[] arr) {

        if (arr.length >= 3) {
            int index = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] == arr[i - 1]) {
                    return false;
                }
                if (arr[i] < arr[i - 1]) {
                    index = i;
                    break;
                }
            }
            if (index > 1) {
                for (int i = index; i < arr.length; i++) {
                    if (arr[i] == arr[i - 1]) {
                        return false;
                    }
                    if (arr[i] > arr[i - 1]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
}