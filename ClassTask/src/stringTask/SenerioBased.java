package stringTask;

import java.util.Arrays;

// Scenario: Data Cleanup in Messaging App
public class SenerioBased 
{
	/*public static void main(String[] args) 
	{
	//		String str="you.are.a.good.person.";
		String str="a..b...c";
		
		String str2[]=str.split("\\.");
		for(int i=str2.length-1;i>=0;i--)
		{
			String msg=str2[i];
			
			if(msg.equals(" "))
			{
				break;
			}
			else 
			{
				if(i > 0)
				{
					msg=msg.concat(".");
				}
			}
			 
			System.out.print(msg);
	//			System.out.println(Arrays.toString(str2));
		}
	}*/

	    // Static method to clean and reverse dot-separated words
	    public static String formatMessage(String message) {
	        if (message == null || message.isEmpty()) {
	            return "";
	        }

	        // Split the message using one or more dots
	        String[] words = message.split("\\.+");

	        // Use StringBuilder to build the result
	        StringBuilder result = new StringBuilder();
	        
	        // Traverse the array in reverse and append non-empty strings
	        for (int i = words.length - 1; i >= 0; i--) {
	            if (!words[i].isEmpty()) {
	                result.append(words[i]);
	                if (i > 0) {
	                    // Append dot only if more words are to come
	                    result.append(".");
	                }
	            }
	        }

	        // Remove any trailing dot that might be extra
	        String output = result.toString();
	        if (output.endsWith(".")) {
	            output = output.substring(0, output.length() - 1);
	        }

	        return output;
	    }

	    // Main method to test the formatter
	    public static void main(String[] args) {
	        // Test inputs
	        String[] testInputs = {
	            "..",
	            ".....",
	            "you.are.a.good.person.",
	            "...alpha......",
	            "a..b...c"
	        };

	        // Print outputs
	        for (String input : testInputs) {
	            System.out.println("Input: " + input);
	            System.out.println("Output: " + formatMessage(input));
	            System.out.println();
	        }
	    }
	



}
