package illich.so.iteration5.GenomicRangeQuery;

//For example, given the string S = CAGCCTA and arrays P, Q such that:
//
//        P[0] = 2    Q[0] = 4
//        P[1] = 5    Q[1] = 5
//        P[2] = 0    Q[2] = 6
//        the function should return the values [2, 4, 1]

class Solution {

    int[] getSolution(String S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            int minImpactFactors = 4;
            for (int j = P[i]; j <= Q[i]; j++) {
                int currentImpactFactors = 0;
                switch (S.charAt(j)) {
                    case 'A':
                        currentImpactFactors = 1;
                        break;
                    case 'C':
                        currentImpactFactors = 2;
                        break;
                    case 'G':
                        currentImpactFactors = 3;
                        break;
                    case 'T':
                        currentImpactFactors = 4;
                        break;
                }
                minImpactFactors = Math.min(minImpactFactors, currentImpactFactors);
            }
            result[i] = minImpactFactors;
        }
        return result;
    }

    int[] getSolution1(String[] S, int[] P, int[] Q) {
        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            int minImpactFactors = 4;
            for (int j = P[i]; j <= Q[i]; j++) {
                int currentImpactFactors = 0;
                switch (S[j]) {
                    case "A":
                        currentImpactFactors = 1;
                        break;
                    case "C":
                        currentImpactFactors = 2;
                        break;
                    case "G":
                        currentImpactFactors = 3;
                        break;
                    case "T":
                        currentImpactFactors = 4;
                        break;
                }
                minImpactFactors = Math.min(minImpactFactors, currentImpactFactors);
            }
            result[i] = minImpactFactors;
        }
        return result;
    }
}
