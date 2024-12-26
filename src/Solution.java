public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(CodelandUsernameValidation("u_hello_world1 23"));
    }

    public static String CodelandUsernameValidation(String str){
        Boolean is_valid = true;
        int length = str.length();
        if(length >= 4 && length <= 25 && (Character.isLetter(str.charAt(0)) == true) && (str.charAt(str.length()-1) != '_')){//rule 1, 2, and 4
            int i=0;
            while(i<length && is_valid)
            {
                if((Character.isDigit(str.charAt(i)) == true) || (Character.isLetter(str.charAt(i)) == true) || (str.charAt(i) == '_')){
                    is_valid = true;
                }else{
                    is_valid = false;//stop the loop when ule 3 is not met
                }
                i++;
            }
            if(is_valid == true){
                return "true";
            }else{
                return "false";
            }
        }else{
            return "false";
        }
    }
}
