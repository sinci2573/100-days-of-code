# Reverse Integer

This repository contains a Python implementation of the **Reverse Integer** problem, a common algorithmic challenge frequently asked in technical interviews.

## Problem Description

Given a signed 32-bit integer `x`, return `x` with its digits reversed. If reversing `x` causes the value to go outside the signed 32-bit integer range `[-2³¹, 2³¹ - 1]`, then return `0`.

### Constraints:
- `-2³¹ <= x <= 2³¹ - 1`
- The environment does not allow storing 64-bit integers (signed or unsigned).

## Examples
Input: 123 Output: 321

Input: -123 Output: -321

Input: 120 Output: 21

The solution:
1. Determines the sign of the number.
2. Converts the number to a string, reverses it, and converts it back to an integer.
3. Applies the original sign.
4. Checks whether the reversed integer is within the 32-bit signed integer range.

If the reversed number overflows the 32-bit range, the function returns `0`.

