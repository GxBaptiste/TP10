package Date;


import java.text.DateFormat;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;


public class Main {
	
	public static void main(String[] args) {
		DateFormat fullDateFormat = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
		Date date = new Date();
		System.out.println("Début du programme : "+fullDateFormat.format(date));
		System.out.println("\n-------------------------------\n");
		
		
		@SuppressWarnings("deprecation")
		Date d = new Date(95,1,1);
		System.out.println(d);
		DayOfWeek dow = DayOfWeek.MONDAY;
		Locale loc = Locale.getDefault();
		System.out.println(dow.getDisplayName(TextStyle.FULL, loc));
		System.out.println(dow.getDisplayName(TextStyle.SHORT, loc));
		System.out.println(dow.getDisplayName(TextStyle.NARROW, loc));
		
		
		
		
		System.out.println("\n-------------------------------\n");
	    LocalDateTime date3 = LocalDateTime.of(2019, Month.JANUARY, 25, 21, 0);
	    System.out.println("Date de noel : " + DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(date3));

//	     Optional<String> empty = Optional.empty();
//	     String test = "zefkzefkfeakfaekazfe";
//	     assertFalse(empty.isPresent());
//	     Optional.of(test);

	}


}
