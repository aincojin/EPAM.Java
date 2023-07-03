package BasicsOfOOP.ex3;

import java.util.ArrayList;

public class Calendar {
    private ArrayList<Day> dayList;

    Calendar(){
       dayList = new ArrayList<>();
    }
    public void printHolidays(){
        System.out.println("Выведем выходные дни: ");
        for(Day day : dayList){
            if(day.getIsHoliday()) {
                System.out.println(day);
            }
        }
    }
    public void addDay(Day day) {
        dayList.add(day);
    }
    public ArrayList<Day> getDayList() {
        return dayList;
    }

    public void setDayList(ArrayList<Day> dayList) {
        this.dayList = dayList;
    }
    public class Day {

        private String date;
        private boolean isHoliday;

        Day(String date, boolean isHoliday){

            this.date = date;
            this.isHoliday = isHoliday;
        }
        @Override
        public String toString(){
            return date;
        }

        public boolean getIsHoliday() {
            return isHoliday;
        }

        public void setHoliday(boolean holiday) {
            isHoliday = holiday;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }
}
