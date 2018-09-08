## 题目001~020
### [001.Two Sum 两数之和](https://leetcode-cn.com/problems/two-sum/description/)
*题目:*
```
给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
```

*示例:*
```
给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
```

### [002.两数相加](https://leetcode-cn.com/problems/add-two-numbers/description/)
*题目：*
```
给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
你可以假设除了数字 0 之外，这两个数字都不会以零开头。
```

*示例：*
```
输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807
```

### [003.无重复字符的最长子串](https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/description/)
*题目：*
```
给定一个字符串，找出不含有重复字符的最长子串的长度。
```

*示例 1:*
```
输入: "abcabcbb"
输出: 3 
解释: 无重复字符的最长子串是 "abc"，其长度为 3。
```

*示例 2:*
```
输入: "bbbbb"
输出: 1
解释: 无重复字符的最长子串是 "b"，其长度为 1。
```

*示例 3:*
```
输入: "pwwkew"
输出: 3
解释: 无重复字符的最长子串是 "wke"，其长度为 3。
     请注意，答案必须是一个子串，"pwke" 是一个子序列 而不是子串。
```

### [004.两个排序数组的中位数](https://leetcode-cn.com/problems/median-of-two-sorted-arrays/description/)
*题目：*
```
给定两个大小为 m 和 n 的有序数组 nums1 和 nums2 。

请找出这两个有序数组的中位数。要求算法的时间复杂度为 O(log (m+n)) 。

你可以假设 nums1 和 nums2 不同时为空。
```

*示例 1:*
```
nums1 = [1, 3]
nums2 = [2]

中位数是 2.0
```

*示例 2:*
```
nums1 = [1, 2]
nums2 = [3, 4]

中位数是 (2 + 3)/2 = 2.5
```