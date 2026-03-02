import java.util.ArrayList;
import java.util.List;

public class TestWinter {
    public static void main(String[] args) {
        Winter w1 = new Winter("холодный", "теплый");
        System.out.println(w1.january);
        System.out.println(w1.february);
        Winter w2 = new Winter("df", "dfs", "dfdf");
        System.out.println(w2.january);
        System.out.println(w2.february);
        Winter w3 = new Winter("Январь", "февраль", 15);
        System.out.println(w3.january);
        System.out.println(w3.february);

        w3.february = "dfdfsdfsdfsdfsdfs";
        System.out.println(w3.february);
        SpringTime s1 = new SpringTime("may", 9);
        Holidays victory = new Holidays(s1);
        System.out.println(victory);

        SpringTime s2 = victory.getHoliday();
        s2.date = 10;
        System.out.println(victory);
        Summer2025 s3 = new Summer2025("august ", 18);
        s3.print();

        List<Autumn> dateList = new ArrayList<>();
        Autumn a1 = new Autumn();
        a1.year = 2025;
        a1.month = 9;

        Autumn a2 = new Autumn();
        a2.year = 2025;
        a2.month = 10;

        Autumn a3 = new Autumn();
        a3.year = 2024;
        a3.month = 8;

        Autumn a4 = new Autumn();
        a4.year = 2020;
        a4.month = 7;

        dateList.add(a1);
        dateList.add(a2);
        dateList.add(a3);
        dateList.add(a4);

        for (Autumn a : dateList) {
            System.out.println(a.year + " " + a.month);
        }

        int year = 0;
        int month = 0;

        for (Autumn a : dateList) {
            if (a.year % 2 == 0) {
                year += a.year;
            }
            if (a.month % 2 == 0) {
                month += a.month;
            }
        }
        System.out.println(year + " " + month);

//        dateList.removeIf(a -> a.year % 2 == 0);

        for (int i = dateList.size(); i > 0; i--) {
            if (dateList.get(i - 1).year % 2 == 0) {
                dateList.remove(i - 1);
            }
        }

        for (Autumn a : dateList) {
            System.out.println(a.year + " " + a.month);
        }

    }

}
