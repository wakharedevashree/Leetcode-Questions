class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder();

        // Step 1: Reverse the whole string
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();

        int i = 0;
        while (i < n) {

            // Step 2: Skip spaces
            while (i < n && s.charAt(i) == ' ') {
                i++;
            }

            // Step 3: Collect a word
            StringBuilder word = new StringBuilder();
            while (i < n && s.charAt(i) != ' ') {
                word.append(s.charAt(i));
                i++;
            }

            // Step 4: Reverse the word to correct order
            word.reverse();

            // Step 5: Add word to answer
            if (word.length() > 0) {
                if (ans.length() > 0) ans.append(" ");
                ans.append(word);
            }
        }

        return ans.toString();
    }
}
