package org.files;

import java.util.Calendar;
import java.util.Scanner;

public class Newspaper
{

	public static void getNewPaper()
	{
		System.out.println("Enter your option");
		Scanner scan=new Scanner(System.in);
		int  c=scan.nextInt();
		switch(c)
		{
		case 1:System.out.println("TOI");
		break;
		
		
		case 2:System.out.println("Hindu");
		break;
		
		case 3:System.out.println("ET");
		break;
		
		case 4:System.out.println("BM");
		break;
		
		case 5:System.out.println("HT");
		break;
		default :System.out.println("Nothing selected");
		}
		
	}
	public static  int countWeekendDays(int year, int month) {
	    Calendar calendar = Calendar.getInstance();
	    // Note that month is 0-based in calendar, bizarrely.
	    calendar.set(year, month - 1, 1);
	    int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

	    int count = 0;
	    for (int day = 1; day <= daysInMonth; day++) {
	        calendar.set(year, month - 1, day);
	        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
	        
	        if (dayOfWeek == Calendar.SUNDAY || dayOfWeek == Calendar.SATURDAY) {
	            count++;
	            System.out.print(dayOfWeek+"   ");
	            // Or do whatever you need to with the result.
	        }
	    }
	    return count;
	}
	public static void main(String[] args)
	{
	countWeekendDays(2020,02);
	}

}
