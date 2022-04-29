import org.w3c.dom.ls.LSOutput;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class ParenthesesChecker {


    public boolean checkParentheses(String sentence) {

        //new empty stack object of Stack reference variable
        Stack<String> charStack = new Stack<>();
        //go through each character in the string input
        for (int i = 0; i <= sentence.length() - 1; i++) {
            //add each character to the stack
            charStack.push(String.valueOf(sentence.charAt(i)));
        }
        //now change the reference variable of charStack to a List
        List<String> charList = charStack;
        //just to check, print out list
        //System.out.println(charList);
        //closing = number of times ")" occurs in list
        //opening = number of times "(" occurs in list
        int closing = Collections.frequency(charList, ")");
        int opening = Collections.frequency(charList, "(");
        //if the list contains ")" return false
        if (closing == opening) {
            return true;
        } else {
            return false;
        }


    }

}
