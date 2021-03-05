package Main;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteToCSV {

    public static void writeCSV() {

        CreateLists cl1 = new CreateLists();
        cl1.readEvent();

        ArrayList<String> EventName32 = cl1.getEventList();
        ArrayList<String> EventDate32 = cl1.getDateList();
        ArrayList<String> AllDate32 = cl1.getAllList();

        cl1.createEventName(EventName32, AllDate32);
        cl1.createEventDate(EventDate32, AllDate32);

        CreateFormat cf1 = new CreateFormat();

        ArrayList<String> DayList = cf1.getDayList();
        ArrayList<String> MonthList = cf1.getMonthList();
        ArrayList<String> YearList = cf1.getYearList();
        ArrayList<String> TimeList = cf1.getTimeList();
        ArrayList<String> YearAndTimeList = cf1.getYearAndTimeList();
        ArrayList<String> FullDateList = cf1.getFullDateList();

        cf1.createYearAndTime(EventDate32, YearAndTimeList);
        cf1.createYear(YearAndTimeList, YearList);
        cf1.createTime(YearAndTimeList, TimeList);
        cf1.createMonth(EventDate32, MonthList);
        cf1.createDay(EventDate32, DayList);

        cf1.CreateFormat2();

        cf1.fixTime(TimeList);
        cf1.createFullDate(DayList, MonthList, YearList, FullDateList);
        cf1.fixEventName(EventName32);

        try {
            File file = new File("src/Files/EventsOutput.csv");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Subject" + ",");
            bw.write("Start date" + ",");
            bw.write("Start time" + ",");
            bw.write("End date" + ",");
            bw.write("End time" + "\n");
            bw.newLine();

            for(int i = 0; i < EventName32.size(); i++){
                bw.write(EventName32.get(i) + "," + FullDateList.get(i) + "," + TimeList.get(i) + "," + FullDateList.get(i) + "," + TimeList.get(i));
                bw.newLine();
            }

            bw.close();
            fw.close();
        }
        catch(Exception e){
            System.out.println("Something went wrong.");
            }
        }
    }
