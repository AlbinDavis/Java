package problems.programs;

public class HeightChecker {
    public static void main(String[] args) {
        int[] arr= {1,1,4,2,1,3};
        int max=arr[0];
        int min = arr[0];
        for(int i:arr){
            if(i>max)
                max=i;
            else if(i<min)
                min=i;
        }
        int[] frequencyArray = new int[max-min+1];

        for(int i=0;i<arr.length;i++){
            frequencyArray[arr[i]-min]++;
        }
        int j=0,count =0;
        for(int i=0;i<frequencyArray.length;i++){
            while(frequencyArray[i]!=0){
                if(arr[j]!=i+min)
                    count++;
                j++;
                frequencyArray[i]--;
            }
        }
    }
}
