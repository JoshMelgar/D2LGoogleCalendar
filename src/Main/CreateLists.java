package Main;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CreateLists {

    ArrayList<String> EventAll = new ArrayList<String>();
    ArrayList<String> EventName = new ArrayList<String>();
    ArrayList<String> EventDate = new ArrayList<String>();

    public void readEvent() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/Files/ScrapeOutput"))) {

            String line = null;
            while (br.ready()) {
                EventAll.add(br.readLine());
            }
            br.close();

            } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }

    public static void createEventName(List<String> EventName, List<String> EventAll) {
        for (int i = 0; i < EventAll.size(); i++)
        {
            if (i % 2 == 0)
            {
                EventName.add(EventAll.get(i));//add the indexes you want to a new list
            }
        }
    }

    public static void createEventDate(List<String> EventDate, List<String> EventAll) {
        for (int i = 0; i < EventAll.size(); i++)
        {
            if (i % 2 == 1)
            {
                EventDate.add(EventAll.get(i));//add the indexes you want to a new list
            }
        }
    }

    public ArrayList<String> getEventList(){
        return EventName;
    }
    public ArrayList<String> getDateList(){
        return EventDate;
    }
    public ArrayList<String> getAllList(){
        return EventAll;
    }
}

