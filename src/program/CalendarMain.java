//package program;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class CalendarMain {
//    public static void main(String[] args) {
//        List<List<Integer>> timeList = new ArrayList<>();
//        timeList.add(Arrays.asList(10,20));
//        timeList.add(Arrays.asList(15,25));
//        timeList.add(Arrays.asList(20,30));
//
//        MyCalendar myCalendar = new MyCalendar();
//        myCalendar.setValue(0);
//        for(List list:timeList){
//            System.out.println(myCalendar.book((Integer) list.get(0), (Integer) list.get(1)));
//        }
//    }
//}
