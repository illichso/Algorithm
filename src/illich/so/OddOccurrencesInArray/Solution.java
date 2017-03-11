package illich.so.OddOccurrencesInArray;

import java.util.List;

import static java.util.Arrays.stream;
import static java.util.Collections.frequency;
import static java.util.stream.Collectors.toList;

class Solution {

    int getSolution(int[] A) {
        int result = 0;

        for (int element : A) {
            result = result ^ element; // Implementation of XOR
        }
        return result;
    }

    int getFunctionalSolution(int[] A) {
        List<Integer> integerList = stream(A).boxed().collect(toList());
        return integerList.stream()
                .filter(e -> frequency(integerList, e) == 1)
                .findFirst()
                .orElse(0);

    }

}
