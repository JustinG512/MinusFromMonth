/* Online Java Compiler and Editor */
public class HelloWorld {

    public static void main(String []args) {
        // System.out.println("Hello, World!");

        int month = 1;
        int day = 2;

        String result = fourDaysBefore(day, month);
        System.out.println(result);

    }

    public static String fourDaysBefore(int day, int month) {
        int[] months = {0,31,28,31,30,31,30,31,31,30,31,30,31};

        if (day >= 5) {
            day -= 4;
        } else {
            month -= 1;
            if (month == 0) {
                month = 12;
            }
            int daysFromPMonth = 4 - day;
            day = months[month] - daysFromPMonth;
        }

        return month + "," + day;
    }

}
