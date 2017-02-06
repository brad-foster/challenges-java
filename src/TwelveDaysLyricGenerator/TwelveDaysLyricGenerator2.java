package TwelveDaysLyricGenerator;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwelveDaysLyricGenerator2 {
	
	private static final List<String> DAYS = new ArrayList<>(Arrays.asList("first", "second", "third", "fourth",
			"fifth", "sixth", "seventh", "eigth", "ninth", "tenth", "eleventh", "twelfth"));
	
	private static final List<String> GIFTS = new ArrayList<>(Arrays.asList("a Partridge in a Pear Tree",
            "two Turtle Doves", "three French Hens", "four Calling Birds", "five Golden Rings",
            "six Geese a Laying","seven Swans a Swimming", "eight Maids a Milking", "nine Ladies Dancing",
            "ten Lords a Leaping", "eleven Pipers Piping","twelve Drummers Drumming"));
	
	public static void main(String[] args) {
		
		String gift = "";
		int index = 0;
		
		for(String day : DAYS) {
			System.out.println(MessageFormat.format("On the {0} day of Christmas my true love sent to me: ", day));
			index = DAYS.indexOf(day);
			
			for(int i = index; i >= 0; i--) {
				gift = GIFTS.get(i);
				
				if(index > 0 && i == 0) {
					gift = "and " + gift;
				}
				
				System.out.println(gift);
			}
			
			System.out.println("");
		}	
		
	}
	
}
