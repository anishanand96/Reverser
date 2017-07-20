package Reverser;
public class StringReverserWithRecursion implements Reverser {

	public String reverse(String stringToBeReversed) {

		if (stringToBeReversed.length() < 2) {
			return stringToBeReversed;
		} else {
			return reverse(stringToBeReversed.substring(1)) + stringToBeReversed.charAt(0);
		}
	}
}
