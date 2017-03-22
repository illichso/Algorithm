package illich.so.iteration5.GenomicRangeQuery;

//For example, given the string S = CAGCCTA and arrays P, Q such that:
//
//        P[0] = 2    Q[0] = 4
//        P[1] = 5    Q[1] = 5
//        P[2] = 0    Q[2] = 6
//        the function should return the values [2, 4, 1]

class Solution {

    int[] getSolution(String S, int[] P, int[] Q) {
        int[] A = new int[S.length()];
        int[] C = new int[S.length()];
        int[] G = new int[S.length()];


        for (int i = 0; i < S.length(); i++) {
            int currentA = 0;
            int currentC = 0;
            int currentG = 0;

            switch (S.charAt(i)) {
                case 'A':
                    currentA = 1;
                    break;
                case 'C':
                    currentC = 1;
                    break;
                case 'G':
                    currentG = 1;
                    break;

            }

            A[i] = currentA;
            C[i] = currentC;
            G[i] = currentG;

            if (i > 0) {
                A[i] += A[i - 1];
                C[i] += C[i - 1];
                G[i] += G[i - 1];
            }

        }

        int[] result = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            if (A[P[i]] < A[Q[i]]) {
                result[i] = 1; // A
            } else if (C[P[i]] < C[Q[i]]) {
                result[i] = 2; // C
            } else if (G[P[i]] < G[Q[i]]) {
                result[i] = 3; // G
            } else {
                result[i] = 4; // T there has to be some value
            }
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
