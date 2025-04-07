# Problem: Zigzag Conversion

The string `"PAYPALISHIRING"` is written in a zigzag pattern on a given number of rows as follows:

For example, when the number of rows is 3:
P A H N
A P L S I I G
Y I R
After writing in a zigzag, the string is read line by line:  
**Output:** `"PAHNAPLSIIGYIR"`

---

## Task

Write a function that takes a string and a number of rows, and returns the string written in a zigzag pattern and read line by line.

Examples
Example 1
Input:
s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"

Example 2
Input:
s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Pattern:
css
Copy
Edit
P     I    N  
A   L S  I G  
Y A   H R  
P     I
Example 3
Input:
s = "A", numRows = 1
Output: "A"

Constraints
1 ≤ s.length ≤ 1000

s consists of only digits and English letters.

1 ≤ numRows ≤ 1000
