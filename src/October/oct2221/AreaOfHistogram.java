package October.oct2221;

import java.util.ArrayList;
import java.util.Stack;

class TwoValue{
    int value;
    int index;

    public TwoValue(int value, int index){
        this.index = index;
        this.value = value;
    }
}

public class AreaOfHistogram {

    public static ArrayList<Integer> nsl(int[] arr, int size){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<TwoValue> stack = new Stack<>();

        for (int i = 0;i < size ; i++){
            if (stack.size() <= 0){
                arrayList.add(-1);
            }else if (stack.peek().value < arr[i]){
                arrayList.add(stack.peek().index);
            }else if (stack.peek().value >= arr[i]){
                while (stack.size() > 0 && stack.peek().value >= arr[i]){
                    stack.pop();
                }

                if (stack.size() <=0){
                    arrayList.add(-1);
                }else{
                    arrayList.add(stack.peek().index);
                }
            }
            stack.add(new TwoValue(arr[i],i));
        }

        return arrayList;
    }

    public static ArrayList<Integer> nsr(int[] arr, int size){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Stack<TwoValue> stack = new Stack<>();

        for(int i = size -1; i >= 0; i--){
            if (stack.size() <=0){
                arrayList.add(0,size);
            }else if(stack.peek().value < arr[i]){
                arrayList.add(0,stack.peek().index);
            }else if(stack.peek().value >= arr[i]){
                while (stack.size() > 0 && stack.peek().value >= arr[i]){
                    stack.pop();
                }
                if(stack.size() <= 0){
                    arrayList.add(0,size);
                }else{
                    arrayList.add(0,stack.peek().index);
                }
            }
            stack.add(new TwoValue(arr[i], i));
        }

        return arrayList;
    }

    public static void main(String[] args) {
        int[] arr = {6,2,5,4,5,1,6};
        ArrayList<Integer> right = nsr(arr, arr.length);
        ArrayList<Integer> left = nsl(arr, arr.length);

        int max = 0;

        for (int i = 0; i < arr.length; i++){
            int width = right.get(i) - left.get(i) -1;
            int area = width * arr[i];
            if (max < area){
                max = area;
            }
        }

        System.out.println(max);
    }

}
