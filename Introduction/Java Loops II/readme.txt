We use the integers , , and  to create the following series:
	
	(a+2^0*b),(a+2^0*b+2^1*b),....,(a+2^0*b+2^1*b+...+2^n-1*b)

You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.

Input Format

The first line contains an integer, , denoting the number of queries.
Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.

Constraints

0<=q<=500
0<=a,b<=50
1<=n<=15

Output Format

For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.

Sample Input

2
0 2 10
5 3 5
Sample Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98
Explanation

We have two queries:

1. We use a = 0, b = 2 and n = 10 to produce some series s0,s1...sn-1
	s0 = 0 + 1*2 = 2
	s1 = 0 + 1*2 +2*2 = 6
	s2 = 0 + 1*2 +2*2 + 4*2 = 14
Once we hit n = 10, we print the first ten terms as a single line of space-separated integers.