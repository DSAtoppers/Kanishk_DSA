package Year2022.Jan;

public class Problem4 {
    //https://leetcode.com/problems/defanging-an-ip-address/

    //This is the most direct way
//    public static String defangIPaddr(String address) {
//        return address.replaceAll("\\.", "[.]");
//    }

    //The better solution will be
    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < address.length(); i++){
            if (address.charAt(i) == '.'){
                sb.append("[.]");
            }else{
                sb.append(address.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
}
