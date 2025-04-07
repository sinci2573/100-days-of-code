# Zigzag Conversion

**Problem**  
Convert a given string into a zigzag pattern on a specified number of rows, then read line by line.

## Examples

**Example 1**  
Input: `"PAYPALISHIRING"`, `numRows = 3`  
Pattern:
P A H N
A P L S I I G
Y I R
Output: `"PAHNAPLSIIGYIR"`

**Example 2**  
Input: `"PAYPALISHIRING"`, `numRows = 4`  
Pattern:
P I N
A L S I G
Y A H R
P I
Output: `"PINALSIGYAHRPI"`

**Example 3**  
Input: `"A"`, `numRows = 1`  
Output: `"A"`

## Approach

Simulate placing characters in rows:
1. Create a list of empty strings, one for each row.
2. Use a pointer to track the current row.
3. Move the pointer up and down to simulate the zigzag.
4. Append characters to rows accordingly.
5. Join all rows to get the final result.

## Complexity

- Time: O(n), where n is the length of the string  
- Space: O(n), for storing characters in rows
