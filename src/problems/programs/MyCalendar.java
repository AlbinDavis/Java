package problems.programs;

import java.util.TreeMap;

class MyCalendar {
    TreeMap<Integer,Integer> map = new TreeMap<>();

    public MyCalendar() {
    }

    public boolean book(int start, int end) {
        Integer prevStart = map.floorKey(start),
                nextStart = map.ceilingKey(start);
        if((prevStart == null || start>=map.get(prevStart)) && (nextStart == null || end<=nextStart))
        {
            map.put(start,end);
            return true;
        }
        return false;
    }
}
//class MyCalendar {
//    List<int[]> list = new ArrayList<>();
//
//    public MyCalendar() {
//    }
//
//    public boolean book(int start, int end) {
//        if(list.isEmpty()){
//            list.add(new int[]{start,end});
//            return true;
//        }
//        for(int[] array:list)
//            if(start<array[1] && array[0]<end)
//                return false;
//        list.add(new int[]{start,end});
//        return true;
//    }
//}
