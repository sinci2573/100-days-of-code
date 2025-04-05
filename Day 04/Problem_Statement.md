# Find Median of Two Sorted Arrays

## Problem Statement
Given two sorted arrays, `nums1` and `nums2`, of sizes `m` and `n` respectively, return the median of the two sorted arrays. The overall run time complexity should be `O(log(m+n))`.

## Example 1
**Input:**
nums1 = [1, 3] nums2 = [2]
**Output:**
2.0
**Explanation:**
The merged array is `[1, 2, 3]` and the median is `2`.

## Example 2
**Input:**
nums1 = [1, 2] nums2 = [3, 4]
**Output:**
2.5
**Explanation:**
The merged array is `[1, 2, 3, 4]` and the median is `(2 + 3) / 2 = 2.5`.

## Example 3
**Input:**
nums1 = [] nums2 = [1]
**Output:**
1.0

**Explanation:**
Since `nums1` is empty, the median is taken directly from `nums2`, which is `1`.

## Constraints
- `0 <= m, n <= 1000`
- `1 <= m + n <= 2000`
- `-10^6 <= nums1[i], nums2[i] <= 10^6`
