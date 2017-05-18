 
You have the following array 1, 5, 17, 22, 33, 37, known to be sorted. Write
a program that demonstrates a Θ (log(n)) time or better (in the average case) 
algorithm to determine if the value 5 is in that array. A reminder,
the Θ (log(n)) restriction applies only to finding the value, not
setting up values from stdin.

(a) Make sure your program allows as input on the command-line a
comma-separated (free of spaces) list of integers (the above being
just an example).
i. The list should be known to be sorted
ii. The file name should be bsort.java
iii. e.g.: java bsort 2,4,6,7,8,9,12,17,22,28 7

(b) As output to stdout, each step along the way, on a single line, indicate
what value you checked, followed by the symbol <, > or =. e.g. The
last line for this example would be "5=" (without the quotes)

(c) If the searched for value is not found, the last line should simply be
a "!" (without the quotes)
