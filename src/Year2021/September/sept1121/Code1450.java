package Year2021.September.sept1121;

public class Code1450 {

    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int students = 0;
        for (int i = 0; i < startTime.length; i++){
            int start = startTime[i];
            int end = endTime[i];

            if (start == queryTime || end == queryTime){
                students++;
            }else if(start < queryTime && end > queryTime){
                students++;
            }
        }

        return students;
    }

    public static void main(String[] args) {
        System.out.println(busyStudent(new int[]{1,2,3},new int[]{3,2,7},4));
    }
}
