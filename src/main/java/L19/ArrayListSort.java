package L19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListSort {
    private static void stringsToArrayList(String... strings) {
        Arrays.sort(strings, String.CASE_INSENSITIVE_ORDER.thenComparing(Comparator.naturalOrder()));
        Set<String> stingsSet = new HashSet<>(List.of(strings));
        List<String> stringsList = new ArrayList<>(stingsSet);
        System.out.println(stringsList);
    }

    public static void main(String[] args) {
        stringsToArrayList("Zz" ,"Arr", "Arr", "jj", "Ajj");
    }
}
