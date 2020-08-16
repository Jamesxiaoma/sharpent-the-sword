package com.company.offer5;

/**
 * offer5
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(replaceSpace("We are happy."));
    }

    public static String replaceSpace1(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i =0; i< s.length();i++){
            char c = s.charAt(i);
            if(c == ' '){
                sb.append("%20");
            }else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static String replaceSpace(String s) {
        int length = s.length();
        char[] array = new char[length*3];
        int size = 0;
        for(int i=0; i<length;i++){
            char c = s.charAt(i);
            if(c == ' '){
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            }else {
                array[size++] = c;
            }
        }
        String newStr = new String(array,0,size);
        return newStr;
    }
}
