
public class NowStringBuilder {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("Hello");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
        System.out.println(builder.toString());

        builder.delete(0, 3); // delete in range
        System.out.println(builder);

        builder.deleteCharAt(0); // delete char at a particular index
        System.out.println(builder);

        System.out.println(builder.indexOf("gh")); // gives starting index of subString 

        builder.reverse();  // reverse the string
        System.out.println(builder);
    }
    
}
