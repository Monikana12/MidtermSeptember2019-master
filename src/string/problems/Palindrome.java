package string.problems;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        String word ="MOM";
        String toLowerCase =word.toLowerCase();
        String x = " ";

        for(int i =toLowerCase.length()-1;i>=0;i--) {
            x +=toLowerCase.charAt(i);
        }
        if(toLowerCase.equals(x)) {
            System.out.println("'" +word +"'" +"is a palindrome");
        } else {
            System.out.println(" ' " + word +"'" +"is not a palindrome");
        }


    }
}
