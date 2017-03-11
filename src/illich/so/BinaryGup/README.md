BinaryGup

A binary gup within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.

For example, number 9 has binary representation 1001 and contains a binary gup of length 2. The number 529 has binary representation 1000010001 and contains two binary gups: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gup of length 1. The number 15 has binary representation 1111 and has no binary gups.

Write a function:

class Solution { public int solution(int N); }
that, given a positive integer N, returns the length of its longest binary gup. The function should return 0 if N doesn't contain a binary gup.

For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gup is of length 5.

Assume that:

N is an integer within the range [1..2,147,483,647].
Complexity:

expected worst-case time complexity is O(log(N));
expected worst-case space complexity is O(1).