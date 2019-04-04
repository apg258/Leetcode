// Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
//
// Example 1:
//
// Input: "Let's take LeetCode contest"
// Output: "s'teL ekat edoCteeL tsetnoc"
//
//
//
// Note:
// In the string, each word is separated by single space and there will not be any extra space in the string.
//


class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        for (String word : s.split(" ")) {
            Stack<Character> st = new Stack();
            for (Character c : word.toCharArray()) {
                st.push(c);
            }
            while (!st.empty()) {
                sb.append(st.pop());
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
