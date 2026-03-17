# **Senior Dev Intercom DSA Prep Sheet**

---

## **1️⃣ Sliding Window (Most Important)**

**Core Idea:** Maintain a window (fixed or variable size) over an array/string to optimize contiguous problems.

**Must-Practice Questions:**

1. Maximum Sum Subarray of Size K
2. Longest Substring Without Repeating Characters
3. Sliding Window Maximum
4. Minimum Window Substring
5. Fruit Into Baskets
6. Longest Repeating Character Replacement
7. Permutation in String
8. Find All Anagrams in a String
9. LRU cache

**Senior Additions / Variations:**

* Longest substring with at most K distinct characters
* Subarray product less than K
* Sliding window with negative numbers or variable size
* Two pointers + binary search on sorted arrays

---

## **2️⃣ Two Pointers**

**Core Idea:** Use two indices to process arrays/strings efficiently, often sorted.

**Must-Practice Questions:**

1. Longest Substring Without Repeating Characters
2. Container With Most Water
3. Two Sum in Sorted Array
4. Remove Duplicates from Sorted Array
5. 3Sum / 3Sum Closest
6. Trapping Rain Water

**Senior Additions / Variations:**

* 4Sum / K-Sum
* Two pointers with circular arrays
* Pair with difference K

---

## **3️⃣ HashMap Usage**

**Core Idea:** Store frequency, index, or previous occurrence for O(1) access.

**Must-Practice Questions:**

1. Two Sum
2. Subarray Sum Equals K
3. Group Anagrams
4. Longest Substring Without Repeating Characters
5. Top K Frequent Elements
6. First Unique Character in String
7. Valid Anagram
8. Minimum Window Substring

**Senior Additions / Variations:**

* Longest subarray with sum divisible by K
* Count pairs with difference K
* Cycle detection in directed graphs (DFS + HashMap)
* Prefix sum with HashMap for advanced counting

---

## **4️⃣ Tree / Binary Tree / BST**

**Core Idea:** Recursion, DFS, BFS, and iterative stack solutions.

**Must-Practice Questions:**

1. Maximum Depth
2. Validate BST
3. Lowest Common Ancestor (BST & Binary Tree)
4. Binary Tree Level Order Traversal
5. Diameter of Binary Tree

**Senior Additions / Variations:**

* Serialize / Deserialize Binary Tree
* Balanced Binary Tree (Height Balanced)
* Path Sum / All Paths With Given Sum
* Zigzag Level Order Traversal
* Iterative Preorder / Inorder / Postorder
* Kth smallest / largest in BST

---

## **5️⃣ Stack Problems**

**Core Idea:** LIFO structure for nested/ordered problems.

**Must-Practice Questions:**

1. Valid Parentheses
2. Min Stack
3. Next Greater Element
4. Daily Temperatures
5. Largest Rectangle in Histogram
6. Evaluate Reverse Polish Notation
7. Sliding Window Maximum
8. Decode String
9. Trapping Rain Water (stack method)
10. Stock Span Problem

**Senior Additions / Variations:**

* Expression evaluation with operator precedence
* Next smaller / previous greater element variations
* Monotonic stack + sliding window combination

---

## **6️⃣ BFS / DFS / Graph**

**Core Idea:** BFS → level-order, DFS → deep first, backtracking.

**Must-Practice Questions:**

1. Number of Islands
2. Binary Tree Level Order Traversal
3. Rotting Oranges
4. Clone Graph
5. Course Schedule / Topological Sort
6. Word Search
7. Flood Fill

**Senior Additions / Variations:**

* Detect cycles (directed/undirected)
* Shortest path in weighted graphs (Dijkstra / Bellman-Ford)
* Union-Find / Disjoint Set problems (Accounts Merge)
* Connected components / Bridges / Articulation Points
* Multi-source BFS

**Interview Tips:**

* Ask if graph is weighted/unweighted
* BFS → shortest path (unweighted), DFS → explore all paths/backtracking

---

## **7️⃣ Heap / Priority Queue**

**Core Idea:** Efficiently get min/max element.

**Must-Practice Questions:**

1. Implement Queue using Stacks
2. Sliding Window Maximum
3. Rotting Oranges (BFS with queue)
4. Binary Tree Level Order Traversal
5. Task Scheduler

**Senior Additions / Variations:**

* Merge K Sorted Lists / Streams
* Kth Largest / Smallest element
* Median in a data stream (min-max heap)
* Top K frequent elements (array/string)

---

## **8️⃣ Backtracking / Recursion**

**Core Idea:** Explore all possibilities; DFS on state space.

* N-Queens, Sudoku Solver
* Subsets / Permutations / Combination Sum
* Word Search II

---

## **9️⃣ Dynamic Programming (Senior Level)**

* Longest Increasing Subsequence / Subarray
* Coin Change, Knapsack
* Matrix DP: Unique Paths, Minimum Path Sum
* Fibonacci / Factorial / Regex Matching (with memoization)

---

## **10️⃣ Bit Manipulation**

* Single Number (XOR)
* Counting Bits
* Subsets using bitmask

---

## ✅ Senior Dev Preparation Strategy

1. **Cover core questions first** from your list (sliding window, two pointers, hashmap, stack, tree, BFS/DFS).
2. **Add advanced variations** for senior-level edge cases.
3. **Practice iterative and optimized solutions** — recursive only is not enough.
4. **Simulate 1-hour coding rounds** with mixed problem sets.
5. **Explain patterns to the interviewer**: sliding window, monotonic stack, prefix sum + hashmap, BFS/DFS choice.

---


Perfect! Here’s a **1-hour mixed mock coding set for a senior dev at Intercom**. It covers **sliding window, two pointers, hashmap, stack, tree, BFS/DFS, heap, and DP patterns** — very close to the style and difficulty they test. I’ve included **problem statements, hints, and expected patterns**, so you can practice efficiently.

---

# **Intercom Senior Dev – 1-Hour Mock Coding Set**

---

## **1️⃣ Sliding Window**

**Problem:** Longest Substring Without Repeating Characters
**Input:** `"abcabcbb"` → **Output:** `3`
**Pattern:** Sliding window + hashmap/set
**Hint:** Maintain a set of characters in the current window; move left pointer on duplicates.

---

**Problem:** Maximum Sum Subarray of Size K
**Input:** `[2,1,5,1,3,2]`, `k=3` → **Output:** `9`
**Pattern:** Fixed-size sliding window
**Hint:** Compute initial sum, then slide window by adding next element, removing first.

---

## **2️⃣ Two Pointers**

**Problem:** Container With Most Water
**Input:** `[1,8,6,2,5,4,8,3,7]` → **Output:** `49`
**Pattern:** Two pointers
**Hint:** Move smaller height pointer to maximize area.

---

**Problem:** 3Sum
**Input:** `[-1,0,1,2,-1,-4]` → **Output:** `[[-1,-1,2],[-1,0,1]]`
**Pattern:** Two pointers + sorting
**Hint:** Fix one number, use two pointers for remaining array.

---

## **3️⃣ HashMap / Frequency**

**Problem:** Two Sum
**Input:** `[2,7,11,15]`, `target=9` → **Output:** `[0,1]`
**Pattern:** HashMap for complement lookup

---

**Problem:** Top K Frequent Elements
**Input:** `[1,1,1,2,2,3]`, `k=2` → **Output:** `[1,2]`
**Pattern:** HashMap + Min Heap / Bucket Sort

---

## **4️⃣ Stack / Monotonic Stack**

**Problem:** Next Greater Element
**Input:** `[4,5,2,25]` → **Output:** `[5,25,25,-1]`
**Pattern:** Monotonic stack

---

**Problem:** Valid Parentheses
**Input:** `"({[]})"` → **Output:** `true`
**Pattern:** Stack for matching opening and closing brackets

---

## **5️⃣ Tree / Binary Tree**

**Problem:** Lowest Common Ancestor (Binary Tree)
**Input:** Tree with nodes `p=5, q=1` → **Output:** `3`
**Pattern:** Recursive DFS with backtracking
**Hint:** Return node if matches p or q; combine left/right DFS.

---

**Problem:** Diameter of Binary Tree
**Pattern:** Recursive DFS
**Hint:** Max(leftDepth + rightDepth) at each node.

---

## **6️⃣ BFS / DFS / Graph**

**Problem:** Number of Islands
**Input:** `[['1','1','0'],['0','1','0'],['1','0','1']]` → **Output:** `3`
**Pattern:** BFS or DFS
**Hint:** Mark visited, explore all connected ‘1’s.

---

**Problem:** Rotting Oranges
**Pattern:** Multi-source BFS
**Hint:** Add all rotten oranges to queue; increment minutes per BFS level.

---

**Problem:** Course Schedule (Topological Sort)
**Input:** `numCourses = 2`, `prerequisites = [[1,0]]` → **Output:** `true`
**Pattern:** BFS / DFS cycle detection
**Hint:** Use in-degree array + queue (BFS) or visited states (DFS).

---

## **7️⃣ Heap / Priority Queue**

**Problem:** Sliding Window Maximum
**Input:** `[1,3,-1,-3,5,3,6,7]`, `k=3` → **Output:** `[3,3,5,5,6,7]`
**Pattern:** Max-heap or deque
**Hint:** Maintain current max in window.

---

**Problem:** Task Scheduler
**Input:** `tasks = ["A","A","A","B","B","B"], n=2` → **Output:** `8`
**Pattern:** Heap + greedy
**Hint:** Use max-heap of frequencies, schedule tasks with cooling interval.

---

## **8️⃣ Dynamic Programming / Backtracking**

**Problem:** Longest Increasing Subsequence
**Input:** `[10,9,2,5,3,7,101,18]` → **Output:** `4`
**Pattern:** DP (O(n²)) or DP + Binary Search (O(n log n))

---

**Problem:** Word Search
**Input:** Board with letters, word = `"ABCCED"` → **Output:** `true`
**Pattern:** DFS + backtracking

---

## **9️⃣ Optional / Bonus (Senior Edge Cases)**

* Serialize / Deserialize Binary Tree
* Subarrays with sum divisible by K
* Median in a data stream (min/max heap)
* N-Queens / Sudoku Solver (backtracking)

---

## **⏱ Suggested 1-Hour Mock Session**

| Time   | Focus                         |
| ------ | ----------------------------- |
| 0-10m  | Sliding Window / Two Pointers |
| 10-20m | HashMap problems              |
| 20-30m | Stack / Monotonic Stack       |
| 30-40m | Tree (DFS/BFS)                |
| 40-50m | Graph BFS / DFS               |
| 50-60m | Heap / DP / Backtracking      |

> Rotate problems: easy → medium → hard. Track **time per problem**.

---

If you want, I can also **make a “ready-to-practice sheet” with code templates** in **Java** for **all 25–30 problems** above — so you can start **mock rounds immediately**.

Do you want me to create that next?
