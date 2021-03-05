package Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateFormat {

    ArrayList<String> Day = new ArrayList<String>();
    ArrayList<String> Month = new ArrayList<String>();
    ArrayList<String> Year = new ArrayList<String>();
    ArrayList<String> Time = new ArrayList<String>();
    ArrayList<String> YearAndTime = new ArrayList<String>();
    ArrayList<String> FullDate = new ArrayList<String>();



    public void CreateFormat2 () {

        CreateLists cl1 = new CreateLists();
        cl1.readEvent();

        ArrayList<String> EventName32 = cl1.getEventList();
        ArrayList<String> EventDate32 = cl1.getDateList();
        ArrayList<String> AllDate32 = cl1.getAllList();

        cl1.createEventName(EventName32, AllDate32);
        cl1.createEventDate(EventDate32, AllDate32);

        //Month format fix 2
        for (int i = 0; i < Month.size(); i++) {
            String replaceLetters = Month.get(i);
            replaceLetters = replaceLetters.replaceAll("Jan", "1");
            Month.set(i, replaceLetters);
            replaceLetters = replaceLetters.replaceAll("Feb", "2");
            Month.set(i, replaceLetters);
            replaceLetters = replaceLetters.replaceAll("Mar", "3");
            Month.set(i, replaceLetters);
            replaceLetters = replaceLetters.replaceAll("Apr", "4");
            Month.set(i, replaceLetters);
            replaceLetters = replaceLetters.replaceAll("May", "5");
            Month.set(i, replaceLetters);
            replaceLetters = replaceLetters.replaceAll("Jun", "6");
            Month.set(i, replaceLetters);
            replaceLetters = replaceLetters.replaceAll("Jul", "7");
            Month.set(i, replaceLetters);
            replaceLetters = replaceLetters.replaceAll("Aug", "8");
            Month.set(i, replaceLetters);
            replaceLetters = replaceLetters.replaceAll("Sep", "9");
            Month.set(i, replaceLetters);
            replaceLetters = replaceLetters.replaceAll("Oct", "10");
            Month.set(i, replaceLetters);
            replaceLetters = replaceLetters.replaceAll("Nov", "11");
            Month.set(i, replaceLetters);
            replaceLetters = replaceLetters.replaceAll("Dec", "12");
            Month.set(i, replaceLetters);
        }

        //Day Array Format Fix
        for (int i = 0; i < Day.size(); i++) {
            String replaceLetters = Day.get(i);
            replaceLetters = replaceLetters.replaceAll(",", "");
            Day.set(i, replaceLetters);
        }

        //Year Array Format Fix
        for (int i = 0; i < Year.size(); i++) {
            String replaceLetters = Year.get(i);
            replaceLetters = replaceLetters.replaceAll(" ", "");
            Year.set(i, replaceLetters);
        }
    }

    public static void fixEventName(List<String> EventName32) {
        for (int i = 0; i < EventName32.size(); i++){
            String replaceLetters = EventName32.get(i);
            replaceLetters = replaceLetters.replaceAll(",", "");
            EventName32.set(i, replaceLetters);
        }
    }

    public static void fixTime(List<String> Time) {
        for (int i = 0; i < Time.size(); i++){
            String replaceLetters = Time.get(i);
            replaceLetters = replaceLetters.replaceAll(" ", "");
            Time.set(i, replaceLetters);
        }
    }
/*
    public static void differentTime(List<String> NewTime, List<String> OldTime){
        for (int i = 0; i < OldTime.size(); i++){
            String timeChange = OldTime.get(i);
            timeChange = timeChange.replaceAll("12:59 AM", "12:59 AM");
            NewTime.set(i, timeChange);
            timeChange = timeChange.replaceAll("1:59 AM", "1:59 AM");
            NewTime.set(i, timeChange);
            timeChange = timeChange.replaceAll("2:59 AM", "2:59 AM");
            NewTime.set(i, timeChange);
            timeChange = timeChange.replaceAll("3:59 AM", "3:59 AM");
            NewTime.set(i, timeChange);
            timeChange = timeChange.replaceAll("4:59 AM", "4:59 AM");
            NewTime.set(i, timeChange);
            timeChange = timeChange.replaceAll("5:59 AM", "5:59 AM");
            NewTime.set(i, timeChange);
            timeChange = timeChange.replaceAll("6:59 AM", "6:59 AM");
            NewTime.set(i, timeChange);
            timeChange = timeChange.replaceAll("7:59 AM", "7:59 AM");
            NewTime.set(i, timeChange);
            timeChange = timeChange.replaceAll("8:59 AM", "8:59 AM");
            NewTime.set(i, timeChange);
            timeChange = timeChange.replaceAll("9:59 AM", "9:59 AM");
            NewTime.set(i, timeChange);
            timeChange = timeChange.replaceAll("10:59 AM", "10:59 AM");
            NewTime.set(i, timeChange);
            timeChange = timeChange.replaceAll("11:59 AM", "1:59 AM");
            NewTime.set(i, timeChange);
            timeChange = timeChange.replaceAll("12:59 PM", "12:59 PM");
            NewTime.set(i, timeChange);
            timeChange = timeChange.replaceAll("1:59 PM", "1:59 PM");
            NewTime.set(i, timeChange);
            timeChange = timeChange.replaceAll("2:59 PM", "2:59 PM");
            NewTime.set(i, timeChange);
            timeChange = timeChange.replaceAll("3:59 PM", "3:59 PM");
            NewTime.set(i, timeChange);
            timeChange = timeChange.replaceAll("4:59 PM", "4:59 PM");
            NewTime.set(i, timeChange);
            timeChange = timeChange.replaceAll("5:59 PM", "5:59 PM");
            NewTime.set(i, timeChange);
            timeChange = timeChange.replaceAll("6:59 PM", "6:59 PM");
            NewTime.set(i, timeChange);
            timeChange = timeChange.replaceAll("7:59 PM", "7:59 PM");
            NewTime.set(i, timeChange);
            timeChange = timeChange.replaceAll("8:59 PM", "8:59 PM");
            NewTime.set(i, timeChange);
            timeChange = timeChange.replaceAll("9:59 PM", "9:59 PM");
            NewTime.set(i, timeChange);
            timeChange = timeChange.replaceAll("10:59 PM", "10:59 PM");
            NewTime.set(i, timeChange);
            timeChange = timeChange.replaceAll("11:59 PM", "11:59 PM");
            NewTime.set(i, timeChange);
        }
    }
*/
    public static void createYear(List<String> YearAndTime, List<String> Year) {
        for(String elem : YearAndTime){
            Year.add(elem.substring(0, 5));
        }
    }

    public static void createTime(List<String> YearAndTime, List<String> Time) {
        for(String elem : YearAndTime){
            if(elem.length() == 11){
                Time.add(elem.substring(3, 11));
            }
            else if (elem.length() == 12){
                Time.add(elem.substring(4, 12));
            }
            else if (elem.length() == 13){
                Time.add(elem.substring(5, 13));
            }
        }
    }

    public static void createYearAndTime(List<String> EventDate32, List<String> YearAndTime) {
        for(String elem : EventDate32){
            if(elem.length() == 18){
                YearAndTime.add(elem.substring(6, 18));
            }
            else if(elem.length() == 19){
                YearAndTime.add(elem.substring(6, 19));
            }
            else if(elem.length() == 20){
                YearAndTime.add(elem.substring(7, 20));
            }
            else if(elem.length() == 21){
                YearAndTime.add(elem.substring(8, 21));
            }
        }
    }


    public static void createDay(List<String> EventDate32, List<String> Day) {
        for(String elem : EventDate32){
            Day.add(elem.substring(4, 6));
        }
    }

    public static void createMonth(List<String> EventDate32, List<String> Month) {
        for(String elem : EventDate32){
            Month.add(elem.substring(0, 3));
        }
    }

    public static void createFullDate(List<String> Day, List<String> Month, List<String> Year, List<String> FullDate) {
        for(int i = 0; i < Month.size(); i++){
            FullDate.add(Month.get(i) + "/" + Day.get(i) + "/" + Year.get(i));
        }
    }

    public ArrayList<String> getDayList(){
        return Day;
    }
    public ArrayList<String> getMonthList(){
        return Month;
    }
    public ArrayList<String> getYearList(){
        return Year;
    }
    public ArrayList<String> getTimeList(){
        return Time;
    }
    public ArrayList<String> getYearAndTimeList(){
        return YearAndTime;
    }
    public ArrayList<String> getFullDateList(){
        return FullDate;
    }
}
