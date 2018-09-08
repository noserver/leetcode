package com.gudda.leetcode.Solution_001_020;

import java.util.ArrayList;

/**
 * https://leetcode-cn.com/题库中001~020题目
 */
class Solution {
    /**
     * no.001
     * @param nums 输入数组
     * @param target 和
     * @return 结果数组
     */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i< nums.length-1;i++){
            for( int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    /**
     * no.002
     * 求两个链表表示的数字和.
     * @param l1 first list.
     * @param l2 second list.
     * @return sum of l1 and l2.
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode i1 = l1;
        ListNode i2 = l2;
        ListNode head = new ListNode(0);
        ListNode i = head;
        int ifAdd = 0;

        while(i1!=null&&i2!=null){
            int res = i1.val+i2.val+ifAdd;
            i.next = new ListNode(res%10);
            ifAdd = res >= 10 ? 1:0;
            i = i.next;
            i1 = i1.next;
            i2 = i2.next;
        }

        while(i1!=null){
            int res = i1.val+ifAdd;
            i.next = new ListNode(res%10);
            ifAdd = res >= 10 ? 1:0;
            i = i.next;
            i1 = i1.next;
        }

        while (i2!=null){
            int res = i2.val+ifAdd;
            i.next = new ListNode(res%10);
            ifAdd = res >= 10 ? 1:0;
            i = i.next;
            i2 = i2.next;
        }

        if(ifAdd==1){
            i.next = new ListNode(1);
        }

        return head.next;

    }

    /**
     * no.003
     * 找出最长不重复的子字符串.
     * @param s 字符串.
     * @return 最长不重复子字符串长度.
     */
    public int lengthOfLongestSubstring(String s){
        ArrayList<Character> list = new ArrayList<>();
        int max = 0;
        for(char c :s.toCharArray()){
            if(list.size()==0){
                list.add(c);
            }
            else{
                while(list.contains(c)){
                    list.remove(0);
                }
                list.add(c);
            }
            if(max<list.size()){
                max = list.size();
            }
        }
       return max;
    }

    /**
     * no.004
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i1 = 0;
        int i2 = 0;
        double res;
        if((nums1.length+nums2.length)%2==0){
            //偶数处理
            for(int i=0;i<(nums1.length+nums2.length-1)/2;i++){
                if(nums1[i1]<nums2[i2]){
                    i1++;
                }
                else{
                    i2++;
                }
            }
            if(nums1[i1]<nums2[i2]){
                res = nums1[i1];
            }
            else{
                res = nums2[i2];
            }
        }
        return 0;
    }

    /**
     * Definition for singly-linked list.
     */
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLongestSubstring(" "));
    }
}
