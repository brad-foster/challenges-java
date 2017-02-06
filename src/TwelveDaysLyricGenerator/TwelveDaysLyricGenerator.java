package TwelveDaysLyricGenerator;

import java.util.Arrays;

public class TwelveDaysLyricGenerator {

	public static void main(String[] args) {
		
		String[] dayArray = {"first", "second", "third", "fourth", "fifth", "sixth",
				 "seventh", "eigth", "ninth", "tenth", "eleventh", "twelfth"};

		String[] giftArray = {"a Partridge in a Pear Tree", "2 Turtle Doves", "3 French Hens", "4 Calling Birds",
		                 "5 Golden Rings", "6 Geese a Laying", "7 Swans a Swimming", "8 Maids a Milking",
		                 "9 Ladies Dancing", "10 Lords a Leaping", "11 Pipers Piping", "12 Drummers Drumming"};
		int count = 0;
		
		while(count < giftArray.length) {
		System.out.println("On the " + dayArray[count] + " day of Christmas my true love gave to me:");
		
			for (int i = count; i >= 0; i--) {
				if(i == 0 && count > 0) {
					System.out.println("and a Partridge in a Pear Tree");
				} else {
					System.out.println(giftArray[i]);
				}
			}
			
			count++; 
		}

	}

}
