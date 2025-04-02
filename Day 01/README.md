# Two Sum Problem

## Problem Statement
Find two indices in an array whose values sum up to a given `target`.

## Example
```java
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
```

## Code Explanation
```java
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
```

### How It Works
1. **Uses a HashMap** to store numbers and their indices.
2. **Iterates through the array** and computes `complement = target - nums[i]`.
3. **Checks if the complement exists** in the HashMap.
4. **If found**, returns the indices of the two numbers.
5. **Otherwise**, stores the current number in the HashMap.
6. **Ensures O(n) time complexity** for fast lookup.

## Complexity
- **Time:** `O(n)`, HashMap allows fast lookup.
- **Space:** `O(n)`, stores elements in HashMap.

