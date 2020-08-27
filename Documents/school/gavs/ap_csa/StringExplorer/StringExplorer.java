/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		position = sample.indexOf("slow");
		System.out.println("sample.indexOf(\"slow\") = " + position);
		position = sample.indexOf("the", 3);
		System.out.println("sample.indexOf(\"the\", 3) = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:

		//  This is a demonstration of the toUpperCase method.
		String upperCase = sample.toUpperCase();
		System.out.println("sample.toUpperCase() = " + upperCase);
		System.out.println("After toUpperCase(), sample = " + sample);

		//  This is a demonstration of the substring(int start) method.
		String substringStart = sample.substring( 4 );
		System.out.println("sample.substring(4) = " + substringStart);
		System.out.println("After substring( int start), sample = " + sample);

		//  This is a demonstration of the substring(int start, int end) method.
		String substringStartEnd = sample.substring(0,3);
		System.out.println("sample.substring(0,3) = " + substringStartEnd);
		System.out.println("After substring(int start, int end), sample = " + sample);

		//  This is a demonstration of the charAt(in index) method.
		char charPosition = sample.charAt(4);
		System.out.println("sample.chartAt(4) = " + charPosition);
		System.out.println("After chartAt(), sample = " + sample);

		//  This is a demonstration of the cmpareTo(string) method.
		String dummy = sample;
		int comparison = sample.compareTo(dummy);
		System.out.println("sample.compareTo(dummy) = " + comparison);
		System.out.println("After compareTo(), sample = " + sample);

		//  This is a demonstration of the equals(1String) method.
		boolean equalityTest = sample.equals(dummy);
		System.out.println("sample.equals(dummy) = " + equalityTest);
		System.out.println("After equals(), sample = " + sample);

		//  This is a demonstration of the equalsIgnoreCase(String) method.
		boolean equalityCase = sample.equalsIgnoreCase("the fox is slow");
		System.out.println("sample.equalsIgnoreCase() = " + equalityCase);
		System.out.println("After equals(), sample = " + sample);

		//  This is a demonstration to show the length() method.
		int len = sample.length();
		System.out.println("sample.length() = " + len);
		System.out.println("After equals(), sample = " + sample);

		//  This is a demonstration to show the replace(char old, char new) method.
		String newSample = sample.replace(' ', ',');
		System.out.println("sample.replace(' ', ',') = " + newSample);
		System.out.println("After equals(), sample = " + sample);

		//  This is a demonstration to show the trim() method.
		String sampleTrim = sample.trim();
		System.out.println("sample.trim() = " + sampleTrim);
		System.out.println("After equals(), sample = " + sample);

		//  This is a demonstration of the concat() method.
		String concatination = sample.concat(" Concatinated Successfully!");
		System.out.println("sample.concat(\" Concatinated Successfully\") = " + concatination);
		System.out.println("After equals(), sample = " + sample);

		//  This is a demonstration of the contains() method.
		boolean containsTest = sample.contains("fox");
		System.out.println("sample.contains(\"fox\") = " + containsTest);
		System.out.println("After equals(), sample = " + sample);

		//  This is a demonstration of the endsWith() method.
		boolean endsWithTest = sample.endsWith("dog.");
		System.out.println("sample.endsWithTest(\"dog.\") = " + endsWithTest);
		System.out.println("After equals(), sample = " + sample);

	}

}
