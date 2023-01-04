package Samples;

public class arrayPalindrome {

    public static void main(String[] args)
    {
        // initialize the array
        String[] s = { "java", "longer word", "civic", "apple","raceCar","mom","anna" };
        //caling the findLongestPalindrome() method
        findLongestPalindrome(s);
    }

    //findLongestPalindrome() method to find longest palindrome
    static void findLongestPalindrome(String[] arr)
    {
        // initialize variables
        int len = 0;
        String longest = "";
        for (String s : arr) {
            // check if the string is palindromic
            if (isPalindrome(s.toLowerCase())) {
                // update len and s
                if (s.length() > len) {
                    len = s.length();
                    longest = s;
                }
            }
        }
        System.out.println("Longest palindrome in the array is \"" + longest );
    }

    // method to check if the string is palindromic
    static boolean isPalindrome(String s)
    {
        StringBuffer sb = new StringBuffer(s);
        return s.equals(sb.reverse().toString());

    }


}

