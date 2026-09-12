package Strings;

public class CheckStringsAreRotations {
    public static void main(String[] args) {
        String str1="abcd";
        String str2="cdab";

        if(str1.length()==str2.length()){
             
            String res = str1+str1;

            if(res.contains(str2)){
                System.out.println("Strings are rotations");
            }else{
                System.out.println("not rotations");
            }
        }else{
                System.out.println("not rotations");
            }
    }
}
