// package ca.utoronto.utm.parsing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// https://www.debuggex.com/
public class MultiplesOf5 {
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line;
		try {
			while ((line = in.readLine()) != null) {
				if (recognizeSomethingRegex(line)) {
					System.out.println("recognizeSomethingRegex accepts " + line);
				} else {
					System.out.println("recognizeSomethingRegex rejects " + line);
				}
				if (recognizeSomethingFSM(line)) {
					System.out.println("recognizeSomethingFSM accepts " + line);
				} else {
					System.out.println("recognizeSomethingFSM rejects " + line);
				}
				if (recognize5Regex(line)) {
					System.out.println("recognize5Regex accepts " + line);
				} else {
					System.out.println("recognize5Regex rejects " + line);
				}
				if (recognize5FSM(line)) {
					System.out.println("recognize5FSM accepts " + line);
				} else {
					System.out.println("recognizeFSM rejects " + line);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Come up with some strings so that recognizeSomethingRegex returns true
	// Describe what this recognizes.
	public static boolean recognizeSomethingRegex(String s) {
		Pattern p = Pattern.compile("^(ab){3}(.*):(2|3|4)+(end)+$");
		Matcher m = p.matcher(s);
		if (m.matches()) {
			System.out.println("Groupcount: " + m.groupCount());
			System.out.println("Group 2: " + m.group(2));
			System.out.println("Group 3: " + m.group(3));
			return true;
		} else {
			return false;
		}
	}

	// Come up with some strings so that recognizeSomethingFSM returns true
	// Describe what this recognizes.
	public static boolean recognizeSomethingFSM(String s) {
		char[] c = s.toCharArray();
		int len = s.length();
		// We can now access the characters of s one at a time via c[0], c[1], ...,
		// c[len-1]

		boolean isAccepted = true;

		int n = 0;
		int state = 0; // Start out in the initial state
		while (n < len) {
			switch (state) {
			case 0:
				if ('a' <= c[n] && c[n] <= 'z')
					state = 0;
				else if ('0' <= c[n] && c[n] <= '9')
					state = 1;
				else
					state = 2;
				break;
			case 1:
				if ('0' <= c[n] && c[n] <= '9')
					state = 1;
				else
					state = 2;
				break;
			case 2:
				break;
			}
			n = n + 1;
		}
		if (state == 2)
			isAccepted = false;
		return isAccepted;
	}

	/**
	 * This recognizer uses a regular expression to determine whether s represents a
	 * multiple of 5
	 * 
	 * @param s
	 * @return whether s is the string representation of a multiple of 5
	 */
	public static boolean recognize5Regex(String s) {
		Pattern p = Pattern.compile("^\\d*(0|5)$");
		Matcher m = p.matcher(s);
		return m.matches();
	}

	/**
	 * This recognizer uses a Finite State Machine to determine whether s
	 * represents a multiple of 5
	 * 
	 * @param s
	 * @return whether s is the string representation of a multiple of 5
	 */
		public static boolean recognize5FSM(String s) {
	        char [] c=s.toCharArray();
	        int len=s.length();
	        // We can now access the characters of s one at a time via c[0], c[1], ..., c[len-1]
	        
	        boolean isAccepted=true;
	        
	        int n=0;
	        int state=0; // Start out in the initial state
	        while(n<len){
	            switch(state){    
	                case 0:
	                    if(c[n]=='0'|| c[n]=='5')state=1;
	                    else if('1'<=c[n] && c[n]<='9')state=0;
	                    else state=2;
	                    break;
	                case 1:
	                    if(c[n]=='0'|| c[n]=='5')state=1;
	                    else if('0'<=c[n] && c[n]<='9')state=0;
	                    else state=2;
	                    break;
	                case 2:
	                    break;
	            }
	            n=n+1;
	        }
	        if(state!=1)isAccepted=false;
	        return isAccepted;
	    }
}
