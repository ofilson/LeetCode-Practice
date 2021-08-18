import java.util.ArrayList;
import java.util.List;

class valid_parentheses {
    public static void main(String[] args){
        String input = "([{}]){}";
        boolean output = isValid(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

    // public static boolean isValid(String s) {

    //     List<Character> stack = new ArrayList<Character>();

    //     for (int i = 0; i < s.length(); i++) {
    //         char currChar = s.charAt(i);
    //         switch(currChar) {
    //             case '(':
    //             case '[':
    //             case '{':
    //                 stack.add(currChar);
    //                 break;
    //             case ')':
    //                 if (stack.size() == 0 || '(' != stack.remove(stack.size() - 1)) {
    //                     return false;
    //                 }
    //                 break;
    //             case ']':
    //                 if (stack.size() == 0 || '[' != stack.remove(stack.size() - 1)) {
    //                     return false;
    //                 }
    //                 break;
    //             case '}':
    //                 if (stack.size() == 0 || '{' != stack.remove(stack.size() - 1)) {
    //                     return false;
    //                 }
    //                 break;
    //         }
    //     }
    //     if (stack.size() > 0) {
    //         return false;
    //     }
    //     return true;
    // }

    public static boolean isValid(String s) {
        while(!s.isEmpty()){
            if(s.equals("INVALID")) {
                return false;
            } else if(s.charAt(0) == '('){
                s = parenValidate(s.substring(1));
            } else if(s.charAt(0) == '['){
                s = bracketValidate(s.substring(1));
            } else if(s.charAt(0) == '{'){
                s = squiglyValidate(s.substring(1));
            } else {
                return false;
            }
        }
        return true;
    }

    public static String parenValidate(String str) {
        if(str.isEmpty()){return "INVALID";}
        char nextChar = str.charAt(0);
        while(nextChar != ')'){
            if(str.equals("INVALID")){
                return "INVALID";
            } else if(nextChar == '('){
                str = parenValidate(str.substring(1));
                if(str.isEmpty()){
                    return "INVALID";
                }
                nextChar = str.charAt(0);
            } else if(nextChar == '['){
                str = bracketValidate(str.substring(1));
                if(str.isEmpty()){
                    return "INVALID";
                }
                nextChar = str.charAt(0);
            } else if(nextChar == '{'){
                str = squiglyValidate(str.substring(1));
                if(str.isEmpty()){
                    return "INVALID";
                }
                nextChar = str.charAt(0);
            } else {
                return "INVALID";
            }
        }
        return str.substring(1);
    }

    public static String bracketValidate(String str) {
        if(str.isEmpty()){return "INVALID";}
        char nextChar = str.charAt(0);
        while(nextChar != ']'){
            if(str.equals("INVALID")){
                return "INVALID";
            } else if(nextChar == '('){
                str = parenValidate(str.substring(1));
                if(str.isEmpty()){
                    return "INVALID";
                }
                nextChar = str.charAt(0);
            } else if(nextChar == '['){
                str = bracketValidate(str.substring(1));
                if(str.isEmpty()){
                    return "INVALID";
                }
                nextChar = str.charAt(0);
            } else if(nextChar == '{'){
                str = squiglyValidate(str.substring(1));
                if(str.isEmpty()){
                    return "INVALID";
                }
                nextChar = str.charAt(0);
            } else {
                return "INVALID";
            }
        }
        return str.substring(1);
    }

    public static String squiglyValidate(String str) {
        if(str.isEmpty()){return "INVALID";}
        char nextChar = str.charAt(0);
        while(nextChar != '}'){
            if(str.equals("INVALID")){
                return "INVALID";
            } else if(nextChar == '('){
                str = parenValidate(str.substring(1));
                if(str.isEmpty()){
                    return "INVALID";
                }
                nextChar = str.charAt(0);
            } else if(nextChar == '['){
                str = bracketValidate(str.substring(1));
                if(str.isEmpty()){
                    return "INVALID";
                }
                nextChar = str.charAt(0);
            } else if(nextChar == '{'){
                str = squiglyValidate(str.substring(1));
                if(str.isEmpty()){
                    return "INVALID";
                }
                nextChar = str.charAt(0);
            } else {
                return "INVALID";
            }
        }
        return str.substring(1);
    }
}