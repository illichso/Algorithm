package illich.so.BinaryGup;

import java.util.Arrays;

public class Solution {

    public int solution(int N) {
        String binaryString = Integer.toBinaryString(N);
        if (!binaryString.contains("0") || !binaryString.contains("1")) {
            return 0;
        }
        binaryString = binaryString.substring(0, binaryString.lastIndexOf("1") + 1);
        String[] arrayOfZeros = binaryString.split("1");
        if (arrayOfZeros.length == 0) {
            return 0;
        }
        Arrays.sort(arrayOfZeros);
        return arrayOfZeros[arrayOfZeros.length - 1].length();
    }

}
