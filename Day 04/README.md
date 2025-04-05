Find Median of Two Sorted Arrays  
Problem Statement  
You are given two sorted arrays `nums1` and `nums2`. The task is to find the median of the two sorted arrays. The overall run time complexity should be `O(log (m+n))`.

Code Explanation  
This problem is solved using a binary search approach:

- We always apply binary search on the smaller array to minimize time complexity.
- We partition both arrays such that the elements on the left are less than or equal to elements on the right.
- `maxLeftX` and `minRightX` represent the values around the partition in `nums1`.
- `maxLeftY` and `minRightY` represent the values around the partition in `nums2`.
- The goal is to find the correct partition where:
  - `maxLeftX <= minRightY`
  - `maxLeftY <= minRightX`
- If total length is even, the median is the average of `max(maxLeftX, maxLeftY)` and `min(minRightX, minRightY)`.
- If total length is odd, the median is `max(maxLeftX, maxLeftY)`.

Complexity Analysis  
Time Complexity: `O(log(min(m, n)))` - We perform binary search on the smaller array.  
Space Complexity: `O(1)` - Constant extra space is used.
