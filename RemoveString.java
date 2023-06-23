import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class RemoveString {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("rohit", "raj", "rohan", "shubham", "kirti"));

        List<String> stringList = new ArrayList<>();
        //First Way
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).charAt(0) != 'r') {
                stringList.add(list.get(i));
            }
        }
        System.out.println(stringList);

        //Second Way
        List<String> list1 = list.stream().filter(k -> !k.startsWith("r")).collect(toList());
        System.out.println(list1);
    }
}
