package illich.so.OddOccurrencesInArray;

import java.util.List;

import static java.util.Arrays.stream;
import static java.util.Collections.frequency;
import static java.util.stream.Collectors.toList;

class Solution {

    int solution(int[] N) {
        List<Integer> integerList = stream(N).boxed().collect(toList());
        return integerList.stream()
                .filter(e -> frequency(integerList, e) == 1)
                .findFirst()
                .orElse(0);

    }

}
