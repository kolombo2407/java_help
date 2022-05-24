import java.util.Scanner;


public class CorrectBrackets {
    public static void main (String args[]) {
        String var = "[)(]";
        System.out.println(checker(var));
    }

    public static boolean checker (String s){
        // variables for each type of brackets count
        int check_bracket_type1 = 0;
        int check_bracket_type2 = 0;

        // reading elements of string
        for (int i = 0; i < s.length(); i++) {
            // control if closing bracket comes before opening
            if (check_bracket_type1 < 0 || check_bracket_type2 < 0) {
                return false;
            }
            // going by the string's elements and counting brackets of different type
            String one_symbol = s.substring(i, i + 1);
            if (one_symbol.equals("(")) {
                check_bracket_type1++;
            } else if (one_symbol.equals("[")){
                check_bracket_type2++;
            } else if (one_symbol.equals(")")){
                check_bracket_type1--;
            } else if (one_symbol.equals("]")){
                check_bracket_type2--;
            }
        }
        //after counted all the brackets making conclusion
        if (check_bracket_type1 == 0 && check_bracket_type2 == 0){
            return true;
        } else {
            return false;
        }
    }

}
