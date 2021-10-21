package October.oct2121;

import java.util.ArrayList;
import java.util.Stack;

public class NearestSmallestToLeft {

    public static ArrayList<Integer> nearestSmallestToLeft(int[] arr, int size){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0;i < size ; i++){
            if (stack.size() <= 0){
                arrayList.add(-1);
            }else if (stack.peek() < arr[i]){
                arrayList.add(stack.peek());
            }else if (stack.peek() >= arr[i]){
                while (stack.size() > 0 && stack.peek() >= arr[i]){
                    stack.pop();
                }

                if (stack.size() <=0){
                    arrayList.add(-1);
                }else{
                    arrayList.add(stack.peek());
                }
            }
            stack.add(arr[i]);
        }

        return arrayList;
    }

    public static void main(String[] args) {
        System.out.println(nearestSmallestToLeft(new int[]{4,5,2,10,8},5));
    }
}
