package October.oct2121;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class NearestGreaterToLeft {

    public static ArrayList<Integer> nearestGreaterToLeft(int[] arr, int size){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < size; i++){
            if (stack.size() <= 0){
                arrayList.add(-1);
            }else if (stack.peek() > arr[i]){
                arrayList.add(stack.peek());
            }else if(stack.peek() <= arr[i]){
                while (stack.size() > 0 && stack.peek() <= arr[i]){
                    stack.pop();
                }

                if (stack.size() <= 0){
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
        System.out.println(nearestGreaterToLeft(new int[]{1,3,2,4}, 4));
    }
}
