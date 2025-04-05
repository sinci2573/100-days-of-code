# Find Median of Two Sorted Arrays

## Problem Statement
You are given two sorted arrays `nums1` and `nums2`. The task is to find the median of the two sorted arrays. The overall runtime complexity should be `O(log(m+n))`.

## Code Explanation
- **Binary Search on the Smaller Array:**  
  We always perform binary search on the smaller array to minimize the search space.
  
- **Partitioning the Arrays:**  
  We partition both arrays such that all elements on the left side of the partition are less than or equal to those on the right.
  
- **Handling Edge Cases:**  
  `maxLeftX` and `minRightX` represent the values around the partition in `nums1`, while `maxLeftY` and `minRightY` represent the values in `nums2`. We handle edge cases by using `Integer.MIN_VALUE` and `Integer.MAX_VALUE` where appropriate.
  
- **Finding the Correct Partition:**  
  The correct partition is found when:
  - `maxLeftX <= minRightY`
  - `maxLeftY <= minRightX`
  
- **Calculating the Median:**  
  - If the total number of elements is even, the median is the average of `max(maxLeftX, maxLeftY)` and `min(minRightX, minRightY)`.
  - If the total number of elements is odd, the median is `max(maxLeftX, maxLeftY)`.

## Complexity Analysis
- **Time Complexity:** `O(log(min(m, n)))` - because we perform binary search on the smaller array.
- **Space Complexity:** `O(1)` -
