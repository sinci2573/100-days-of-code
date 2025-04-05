# Longest Palindromic Substring

## Problem Statement
Given a string `s`, return the longest palindromic substring in `s`.

A palindrome is a string that reads the same backward as forward. The goal is to find the longest contiguous substring that satisfies this condition.

### Constraints:
- `1 <= s.length <= 1000`
- `s` consists of only digits and English letters.

---

## Solution Approach

### Expand Around Center Technique
We treat each character (and each pair of characters) as the center of a potential palindrome and expand outward while the characters on both sides match.

### Steps:
1. **Initialize Variables:**
   - `start = 0`, `end = 0`: To keep track of the start and end of the longest palindrome found.

2. **Iterate Through Each Character:**
   - For each index `i` in the string:
     - Expand around the center `i` (odd-length palindrome).
     - Expand around the center between `i` and `i + 1` (even-length palindrome).
     - Track the longest palindrome by comparing the length of both expansions.
     - Update `start` and `end` if a longer palindrome is found.

3. **Return Result:**
   - Slice the string from `start` to `end + 1` to get the longest palindromic substring.

### Complexity Analysis
- **Time Complexity:** `O(n²)`, where `n` is the length of the string. Each expansion around center takes linear time.
- **Space Complexity:** `O(1)`, as no extra space is used apart from a few pointers.

---

## Summary
This approach efficiently finds the longest palindromic substring using the **expand around center** technique. It is optimal and practical for strings of length up to 1000 as required by the problem constraints.
