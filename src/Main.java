import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 8, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> listPositiveEvenNumber = new ArrayList<>();
        for (Integer num: intList) {
            if (num > 0) {
                if (num % 2 == 0) listPositiveEvenNumber.add(num);
            }
        }
        listPositiveEvenNumber.sort(Comparator.naturalOrder());

        for (Integer num: listPositiveEvenNumber) {
            System.out.println(num);
        }

    }
}
