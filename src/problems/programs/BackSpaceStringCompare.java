package problems.programs;

public class BackSpaceStringCompare {
    public static void main(String[] args) {
        String s = "ab#c", t = "ad#c";
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        for(char i:s.toCharArray()){
            if(i!='#')
                sb.append(i);
            else
            if(sb.length()>0)
                sb.delete(sb.length()-1,sb.length());
        }
        for(char i:t.toCharArray()){
            if(i!='#')
                sb2.append(i);
            else
            if(sb2.length()>0)
                sb2.delete(sb2.length()-1,sb2.length());
        }
        System.out.println(sb2.toString().equals(sb.toString()));

    }
}
