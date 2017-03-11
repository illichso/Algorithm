package illich.so.OddOccurrencesInArray;

import java.util.List;

import static java.util.Arrays.stream;
import static java.util.Collections.frequency;
import static java.util.stream.Collectors.toList;

class Solution {

    int getSolution(int[] N) {
        int result = 0;

        for (int element : N) {
            result = result ^ element; // Implementation of XOR
        }
        return result;
    }

    int getFunctionalSolution(int[] N) {
        List<Integer> integerList = stream(N).boxed().collect(toList());
        return integerList.stream()
                .filter(e -> frequency(integerList, e) == 1)
                .findFirst()
                .orElse(0);

    }

}
