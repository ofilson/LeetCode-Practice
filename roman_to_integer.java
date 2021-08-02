import java.util.HashMap;
import java.util.Map;

public class roman_to_integer {
    public static void main(String[] args)
    {
        String input = "MCMXCIV";
        int result = romanToInt(input);
        System.out.println("Input: " + input + "\nResult: " + result);
    }

    public static int romanToInt(String s) {
        // Create hashmap of roman numeral values.
        Map<String, Integer> roman = new HashMap<String, Integer>();
        roman.put("I", 1);
        roman.put("IV", 4);
        roman.put("V", 5);
        roman.put("IX", 9);
        roman.put("X", 10);
        roman.put("XL", 40);
        roman.put("L", 50);
        roman.put("XC", 90);
        roman.put("C", 100);
        roman.put("CD", 400);
        roman.put("D", 500);
        roman.put("CM", 900);
        roman.put("M", 1000);

        int sum = 0;
        String lenTwo = "";
        String lenOne = "";
        
        while(!s.isEmpty()){
            if(s.length() > 1) {
                lenTwo = s.substring(0, 2);
            } else {
                lenTwo = "";
            }
            lenOne = s.substring(0, 1);
            if(roman.containsKey(lenTwo)){
                sum += roman.get(lenTwo);
                s = s.substring(2);
            } else {
                sum += roman.get(lenOne);
                s = s.substring(1);
            }
        }
        return sum;
    }
}
