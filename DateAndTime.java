package com.codegnan.JODA;
//# program for to display System Date and time

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateAndTime {

	
	public static void main(String[] args) {
		//We can represent a particular Date and Time by using LocalDateTime object as follows.
		
		LocalDateTime Dt1 = LocalDateTime.now();
		System.out.println("After six months " +Dt1.plusMonths(6));
		
   ZoneId zone1 = ZoneId.systemDefault();
   System.out.println(zone1);
   
   ZoneId la = ZoneId.of("America/Los_Angeles");
   ZonedDateTime zt = ZonedDateTime.now(la);
   System.out.println(zt);

    LocalDate  Today = LocalDate.now();
    LocalDate Brithday = LocalDate.of(2001,03,01);
   
    Period p = Period.between(Brithday,Today);
    System.out.printf("Age is %d years ,%d months ,and %d days.%n", p.getYears() , p.getMonths(), p.getDays());
    System.out.printf("Age is %d years, %d months, and %d days.%n", p.getYears(), p.getMonths(), p.getDays());

	//to get dats
    long days = ChronoUnit.DAYS.between( Brithday,Today);
    System.out.printf("Age is %d days.%n" ,days);
    

	}

	
}
		
		// Getting the current date
	/*	LocalDate date = LocalDate.now();
		System.out.println("Current Date " +date);
		
		//date formate to get separate Date,time,day
	    System.out.println("CURRENT DATE ");

		int DD =  date.getDayOfMonth();
	    int MM = date.getMonthValue();
	    int YY = date.getYear();
	    System.out.printf("\nFormated Date is : %d-%d-%d  " ,DD,MM,YY    );
	    System.out.println();
	    System.out.println("Day : " +DD);
	    System.out.println("Month : " +MM);
	    System.out.println("Year : " +YY);
		
	    
	    
		// Getting the current time
	    System.out.println("CURRENT TIME ");
	    LocalTime time =LocalTime.now();
	    System.out.println("Current Time " +time);
	    //time formate to get seaparet hour,mintue,sec,nanosec
	    
	    int Hour = time.getHour();
	    int Min = time.getMinute();
	    int Sec =time.getSecond();
	    int Nanosec = time.getNano();
	    
	    System.out.println("Hour : " +Hour );
	    System.out.println("Minute : " +Min);
	    System.out.println("Second : " +Sec);
	    System.out.println("Nano : " + Nanosec);
	    System.out.println();
	    System.out.printf("%d,%d,%d, %d :",Hour,Min,Sec,Nanosec );
	    
	    System.out.println();
	    
	    //date and time
	    LocalDateTime Dt = LocalDateTime.now();
	    System.out.println("Current date and time is : " + Dt);
	    
	 // Format the LocalDateTime using DateTimeFormatter

	    
	    DateTimeFormatter  formatted = DateTimeFormatter.ofPattern("yyyy-MM-dd  HH-mm-ss-nn");		
	    String formattedDateTime = Dt.format(formatted);
	    System.out.println(formattedDateTime);
	}

}*/
