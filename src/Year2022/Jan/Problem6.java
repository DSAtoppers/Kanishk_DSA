package Year2022.Jan;

public class Problem6 {

    //https://leetcode.com/problems/goal-parser-interpretation/

    //G - G, () - o, (al) - al

    //Best solution
    public static String interpret(String command) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < command.length()){
            char s = command.charAt(i);
            if (s == 'G'){
                sb.append("G");
                i++;
            }else{
                if (command.charAt(i+1) == ')'){
                    sb.append("o");
                    i = i+2;
                }else{
                    sb.append("al");
                    i = i+4;
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(interpret("G()()()()(al)"));
    }
}
