package learning.java_8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();

        fillArray(arr);
        fillList(list);



          //map
       arr=  Arrays.stream(arr).map(x-> x*2).toArray();
       list =  list.stream().map(x -> x*2).collect(Collectors.toList());

       //filter




        System.out.println(list);
        System.out.println(Arrays.toString(arr));

    }
   static  void fillArray(int[] arr){
        for (int i = 0; i < 10; i++) {
            arr[i] = i+1;
        }
    }
   static  void fillList(List<Integer> list){
        for (int i = 0; i < 10; i++) {
            list.add(i+1);
        }
    }
}
