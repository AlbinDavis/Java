package program;

public class CompressVideo {
    public static void main(String[] args) {
        String value = "3331115477438892";
        int count =1;
        int i=1;
        while(i<value.length()){
            while(value.charAt(i)==value.charAt(i-1)){
                i++;
                if(i==value.length()){
                    System.out.println(count);
                    System.exit(1);}
            }
            count++;
            i++;
        }
        System.out.println(count);
    }
}
