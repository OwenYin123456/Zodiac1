package com.company;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws IOException, ParseException {
    Zodiac Zodiac[] = new Zodiac[12];
    Zodiac[0] = new Zodiac("Wassermann", new Date(0, Calendar.JANUARY,21),new Date(0, Calendar.FEBRUARY,19) );
    Zodiac[1] = new Zodiac("Fische", new Date(0, Calendar.FEBRUARY,20),new Date(0, Calendar.MARCH,20) );
    Zodiac[2] = new Zodiac("Widder", new Date(0, Calendar.MARCH,21),new Date(0, Calendar.APRIL,20) );
    Zodiac[3] = new Zodiac("Stier", new Date(0, Calendar.APRIL,21),new Date(0, Calendar.MAY,20) );
    Zodiac[4] = new Zodiac("Zwillinge", new Date(0, Calendar.MAY,21),new Date(0, Calendar.JUNE,21) );
    Zodiac[5] = new Zodiac("Krebs", new Date(0, Calendar.JUNE,22),new Date(0, Calendar.JULY,22) );
    Zodiac[6] = new Zodiac("Löwe", new Date(0, Calendar.JULY,23),new Date(0, Calendar.AUGUST,23) );
    Zodiac[7] = new Zodiac("Jungfrau", new Date(0, Calendar.AUGUST,24),new Date(0, Calendar.SEPTEMBER,23) );
    Zodiac[8] = new Zodiac("Waage", new Date(0, Calendar.SEPTEMBER,24),new Date(0, Calendar.OCTOBER,23) );
    Zodiac[9] = new Zodiac("Skorpion", new Date(0, Calendar.OCTOBER,24),new Date(0, Calendar.NOVEMBER,22) );
    Zodiac[10] = new Zodiac("Schütze", new Date(0, Calendar.NOVEMBER,23),new Date(0, Calendar.DECEMBER,21) );
    Zodiac[11] = new Zodiac("Steinbock", new Date(0, Calendar.DECEMBER,22),new Date(0, Calendar.JANUARY,20) );


    /*
    for(int i = 0;i< Zodiac.length;i++)
    {
        System.out.println(Zodiac[i].Zodiac);
        System.out.println(Zodiac[i].Begin);
        System.out.println(Zodiac[i].End);
    }

     */


        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Gib deinen Geburtstag ein Format: dd-MM-yyyy" );
        Date Geburtstag = formatter.parse(br.readLine());
        Geburtstag.setYear(0);


        boolean find = false;
        for(int i = 0;i< Zodiac.length-1;i++)
        {
            if(Geburtstag.after(Zodiac[i].Begin)&&Geburtstag.before(Zodiac[i].End))
            {
                System.out.println(Zodiac[i].Zodiac);
                find = true;
            }
        }
        if(find == false)
        {
            System.out.println(Zodiac[11].Zodiac);
        }



    }
}
