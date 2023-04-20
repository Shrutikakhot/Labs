package PracticeCodes;

public class String_Buffer
{
    public static void main(String[] args) 
    {
        StringBuffer sb = new StringBuffer("This is StringBuffer");

        // Append a string to the end of the StringBuffer
        sb.append("- This is a sample program");
        System.out.println("Appended String: " + sb.toString());
        System.out.println();
        
        // Insert a string into the StringBuffer
        sb.insert(21, "Object ");
        System.out.println("Inserted String: " + sb.toString());
        System.out.println();

        // Reverse the StringBuffer
        sb.reverse();
        System.out.println("Reversed String: " + sb.toString());
        System.out.println();
        
      // replace the word "Buffer" with "Builder"
      		StringBuffer strbf = new StringBuffer("This is String Buffer ");
      		strbf.replace(15, 22, "Builder");
      		System.out.println("After replacing : " + strbf);
    
    }
}

