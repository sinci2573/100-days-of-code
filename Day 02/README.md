
# Add Two Numbers

## Problem Statement
Given two non-empty linked lists representing two non-negative integers, where digits are stored in reverse order, return a linked list representing their sum.

## Code Explanation
- We use a **dummy node** to simplify handling edge cases.
- A **carry variable** is maintained to handle sums greater than 9.
- We iterate through **both linked lists**, adding corresponding digits along with the carry.
- A new node is created for each sum result and appended to the output list.
- The iteration continues until all digits (and any remaining carry) are processed.

## Complexity Analysis
- **Time Complexity:** `O(max(m, n))` - Iterates through both lists once.
- **Space Complexity:** `O(max(m, n))` - Creates a new linked list of similar size.
