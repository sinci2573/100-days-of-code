# Longest Substring Without Repeating Characters

## Problem Statement
Given a string `s`, find the length of the longest substring without duplicate characters.

### Constraints:
- `0 <= s.length <= 5 * 10^4`
- `s` consists of English letters, digits, symbols, and spaces.

---

## Solution Approach

### Sliding Window Technique
We use a **hashmap** to keep track of the last seen index of each character and a **two-pointer approach** to maintain a sliding window.

### Steps:
1. **Initialize Variables:**
   - `char_index = {}` (Dictionary to store character indices)
   - `left = 0` (Left pointer for the sliding window)
   - `max_length = 0` (To store the maximum length found)

2. **Iterate Through the String:**
   - For each character at index `right`, check if it has been seen before.
   - If it is within the current window (`char_index[s[right]] >= left`), move `left` pointer forward.
   - Update the character’s index in `char_index`.
   - Calculate `max_length` as the maximum window size found.

### Complexity Analysis
- **Time Complexity:** `O(n)`, as each character is processed at most twice.
- **Space Complexity:** `O(min(n, 26))`, where `26` is the number of unique English letters.

---

## Summary
This approach efficiently finds the longest substring without repeating characters using a **sliding window** and **hashmap**, making it optimal for large inputs.

