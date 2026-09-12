package Strings;
import java.util.*;
public class ValidParanthesis {
    public static void main(String[] args) {
        // for this problem we are gonna use stack 

        String str = "{[()]}";
        boolean valid=true;

        Stack<Character> s = new Stack<>();

        for(char ch : str.toCharArray()){

            if(ch=='{' || ch =='[' || ch =='('){
                s.push(ch);
            }

            else{
                if(s.isEmpty()){
                    valid=false;
                    break;
                }
                char c= s.pop();
                if(ch =='}' && c!='{'){
                    valid =false;
                    break;
                }
                if(ch ==']' && c!='['){
                    valid =false;
                    break;
                }
                if(ch ==')' && c!='('){
                    valid =false;
                    break;
                }
            }
        }

        if(valid){
            System.out.println("Valid Paranthesis ");
        }else{
            System.out.println("Not a Valid Paranthesis");
        }

    }
}
