package BasicsOfOOP.ex3;

public class exe {
    public static void main(String[] args) {

        Calendar calendar = new Calendar();
        calendar.addDay(calendar.new Day("08.03", true));
        calendar.addDay(calendar.new Day("01.01", true));
        calendar.addDay(calendar.new Day("03.07", false));
        calendar.addDay(calendar.new Day("04.07", false));


        calendar.printHolidays();

    }
}
