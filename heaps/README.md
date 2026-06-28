# Heaps

## Problem List
| # | Problem | Difficulty |
|---|---------|------------|
| 1 | Last Stone Weight | Easy |
| 2 | Kth Largest Element | Medium |
| 3 | Top K Frequent Elements | Medium |

## Approach
In brute force, I sorted the data every time which was slow. In optimal, I used PriorityQueue which was much more efficient.

## Complexity Table
| Problem | Brute | Optimal |
|---------|-------|---------|
| Last Stone Weight | O(n^2 log n) | O(n log n) |
| Kth Largest Element | O(n log n) | O(n log k) |
| Top K Frequent Elements | O(n log n) | O(n log k) |

## How to Run
javac KthLargestElement.java && java KthLargestElement
