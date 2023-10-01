package lab1;

/**
 * A utility class containing several recursive methods
 * 
 * <pre>
 *  
* For all methods in this API, you are forbidden to use any loops, 
* String or List based methods such as "contains", or methods that use regular expressions
 * </pre>
 * 
 *
 */
public final class Lab1 {
	/**
	 * This is empty by design, Lab class cannot be instantiated
	 */
	private Lab1() {
		// empty by design
	}

	/**
	 * Returns the product of a consecutive set of numbers from <code> start </code>
	 * to <code> end </code>.
	 * 
	 * @param start is an integer number
	 * @param end   is an integer number
	 * @return the product of start * (start + 1) * ..*. + end 
	 * @pre.
	 *         <code> start </code> and <code> end </code> are small enough to let
	 *         this method return an int. This means the return value at most
	 *         requires 4 bytes and no overflow would happen.
	 */
	public static int product(int start, int end) {
		 if (start > end) {
	            return 1;//Base case, if start is greater than end, terminate
		 }
		 else {return start* product(start+1,end);}//recursively solve , keep returning start +1 
		 //until start is greater than end

		
	}

	/**
	 * This method creates a string using the given char by repeating the character
	 * <code> n </code> times.
	 * 
	 * @param first is the given character by which the string is made.
	 * @param n     is the number of characters in the final string
	 * @return a string made of the given character.
	 * 
	 * @pre. n is not negative.
	 */
	public static String makeString(char first, int n) {
		if (n <= 0) {
            return "";//Base case if length int n is 0, end program
		}
		else {return first +makeString(first, n-1);}//Recursive case
		//Keep printing first until n reaches 0
		
	}

	/**
	 * This method accepts a positive integer n and that returns n characters: The
	 * middle character should always be an asterisk ("*"). If you are writing an
	 * even number of characters, there will be two asterisks in the middle ("**").
	 * Before the asterisk(s) you should add less-than characters {@code ("<")}.
	 * After the asterisk(s) you should add greater-than characters {@code (">")}.
	 * 
	 * @param n is the total number of strings returned by the method
	 * @return returns a string made of 1 or 2 stars between a number of
	 *         {@code ("<")} and {@code (">")} characters. The string length should
	 *         be equal to n 
	 * @pre. the integer n should be positive
	 */
	public static String writeChars(int n) {
        if (n == 1) {
            return "*";//Base case if odd n
        } 
        else if (n == 2) {
            return "**";//Base case if even n
        } 
        else {
            return "<" + writeChars(n - 2) + ">";//wrap the asterisk(s) in < > until 1, or 2 
            //is reached in which case, base case
        }
        
	}

	/**
	 * This method returns a substring of the given input string that is enclosed in
	 * two given characters.
	 * 
	 * @param str   is a string that contains at least two characters including
	 *              <code> open </code> and <code> close </code>
	 * @param open  is a character at the beginning of the string that should be
	 *              returned.
	 * @param close is a character at the end of the string that should be returned.
	 * @return returns a string enclosed in two given characters of
	 *         <code> open </code> and <code> close </code>. 
	 * @pre. The given str
	 *         contains only one <code> open </code> and one <code> close </code>
	 *         character.
	 */
	public static String getSubstring(String str, char open, char close) {
		int openInd = str.indexOf(open);
        int closeInd = str.indexOf(close);

        if (openInd == -1 || closeInd == -1) {
            return ""; //case, character not found
        }

        if (openInd < closeInd) {
            // if open appears first, close appears second, return string in between
            return str.substring(openInd + 1, closeInd);
        } else {
            // if close appears first, search for string in between close and open
            return getSubstring(str, close, open);
        }

	}

	/**
	 * This method converts a decimal value into its binary representation.
	 * 
	 * @param value is a positive integer number
	 * @return the binary representation of the input. 
	 * @pre. the input is a positive
	 *         integer number.
	 */

	public static String decimalToBinary(int value) {

		if (value == 0) {
            return "0"; // Base case, 0
        } 
		else if (value == 1) {
            return "1"; // Base case, 1
        } 
		else {
            // Recursive case, find remainder, divide by two add remainder to end, until
			//value is 1 or 0 in which case, base case
            int rem = value % 2;
            int div = value / 2;
            String half = decimalToBinary(div);
            return half + rem;
        }
	}

}
