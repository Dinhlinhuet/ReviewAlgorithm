import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by warrior on 5/16/2016.
 */
public class QuickSort {
    public static ArrayList partition(ArrayList<Integer> arrayList, int pivot){
        ArrayList<Integer> output = arrayList;
        ArrayList<Integer> Less = new ArrayList<>();
        ArrayList<Integer> Equal = new ArrayList<>();
        ArrayList<Integer> Greater = new ArrayList<>();
        int i=0;
        while(!output.isEmpty()) {
            if (output.get(i) < output.get(pivot)) {
                Less.add(output.get(i));
            }
            if(output.get(i)== output.get(pivot)){
                Equal.add(output.get(i));
            }
            if(output.get(i) > output.get(pivot)) {
                Greater.add(output.get(i));
            }
        }
        Less.addAll(Equal);
        Less.addAll(Greater);
        return Less;
    }
    public static ArrayList<Integer> sort(ArrayList<Integer> input, int left, int right){
        ArrayList<Integer> result = new ArrayList<>();
        if(left > right )
            return result;
        right = input.size();
        int pivot = input.size()/2;
        System.out.println("pivot"+pivot);
        result = partition(input, pivot);
        sort(input,0,pivot);
        sort(input, pivot+1,right);
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>(Arrays.asList(7,4,9,6,2));
        sort(test,1,5);
        System.out.println(test);
    }
}
