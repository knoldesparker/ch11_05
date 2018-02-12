import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer elements[]={7,4,-9,4,15,8,27,7,11,-5,32,-9,-9};
        List<Integer>  integerList = new LinkedList<>(Arrays.asList(elements));

        System.out.println(integerList);
        sortAndRemoveDubes(integerList);
    }

    public static void sortAndRemoveDubes(List<Integer> list){
        Set<Integer> newSet = new TreeSet<>();


        newSet.addAll(list);



        System.out.println(newSet);


    }
}
