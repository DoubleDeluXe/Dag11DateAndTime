package org.example.DaveLevi.DateAndTime;

import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class DateAndTimeTest {

    @Test
    public void getCurrentDateAndTime() {
        //getting current date and time using Date class
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
        System.out.println(df.format(dateobj));

        /*getting current date time using calendar class
         * An Alternative of above*/
        Calendar calobj = Calendar.getInstance();
        System.out.println(df.format(calobj.getTime()));

        //get current date
        LocalDate today = LocalDate.now();
        System.out.println("Today's Local date : " + today);

        //get current time
        LocalTime time = LocalTime.now();
        System.out.println("local time now : " + time);
        System.out.println(LocalTime.now());
        System.out.println("Test");

        //convert calender to date
        Calendar calendar1 = Calendar.getInstance();
        Date date1 =  calendar1.getTime();
        System.out.println(date1);

        //convert date to calender
        //SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        //String dateInString = "27-04-2016 10:22:56";
        //Date date = sdf.parse(dateInString);

        //Calendar calendar = Calendar.getInstance();
        //calendar.setTime(date);
    }

    @Test
    public void CardTest() {
        Card threeOfclubs = new Card(3,0);
        Card aceOfHearts = new Card(1, 2);
        System.out.println(threeOfclubs.toString());
        System.out.println(aceOfHearts.toString());
    }

}
