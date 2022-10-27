package problems.programs;

public class DayOfWeekFromGivenDate {
    public static void main(String[] args) {
        int day = 29, month = 2, year = 2016;

        String days[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday",
                "Saturday", "Sunday"};
        int shift_with_months[] = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

        int shift_without_leap_year = (year-1 + shift_with_months[month-1] + day-1)%7;

        int shift_with_leap_year = (shift_without_leap_year + year/4 - year/100 + year/400)%7;

        if(checkLeap(year) && (month<=2)){
            shift_with_leap_year = (shift_with_leap_year-1+7)%7;
        }
        System.out.println(days[shift_with_leap_year]);

    }

    private static boolean checkLeap(int y) {
        if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
            return true;
        else
            return false;
    }
}
