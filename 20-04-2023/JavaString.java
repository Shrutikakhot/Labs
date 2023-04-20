package PracticeCodes;

public class JavaString 
{
    public static void main(String[] args)
    {
        String str = "Welcome to Java World";
        
        // Returns the character at 5th position and display it.
        char ch = str.charAt(4);
        System.out.println("Character at 5th position: " + ch);
        System.out.println();
        
        // Compares the above String with “Welcome” lexicographically ignoring case differences and display the result.
        boolean isEqual = str.substring(0, 7).equalsIgnoreCase("Welcome");
        System.out.println("Is the string equal to 'Welcome' (ignoring case)? " + isEqual);
        System.out.println();
        
        // Concatenates “- Let us learn” to the above string and display it.
        String newStr = str.concat(" - Let us learn");
        System.out.println("New string: " + newStr);
        System.out.println();
        
        // Returns the position of the first occurrence of character ‘a’ and display it.
        int index = str.indexOf('a');
        System.out.println("Index of first occurrence of 'a': " + index);
        System.out.println();
        
        // Replaces all the occurrences of ‘a’ character with the new ‘e’ and display it.
        String replacedStr = str.replace('a', 'e');
        System.out.println("String after replacing 'a' with 'e': " + replacedStr);
        System.out.println();
        
        // Returns string between 4th position and 10th position and display it.
        String subStr = str.substring(3, 10);
        System.out.println("Substring between 4th and 10th position: " + subStr);
        System.out.println();
        
        // Returns the lowercase of the string and display it.
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerCaseStr);
    }
}
