package Day18;

public class HighestFrequencyString {
    String str ="SaraAron";

    public void HighestFrequencyString(){
        char ch = 'a';
        char ch2='s';
        char ch3='r';

        int frequency = 0;
str.equalsIgnoreCase(str);
        for(int i = 0; i < str.length(); i++) {
            if(ch == str.charAt(i)) {
                ++frequency;
            } else if (ch2== str.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("Frequency of " + ch + " = " + frequency);

    }

    public static void main(String[] args) {
        HighestFrequencyString hf= new HighestFrequencyString();
        hf.HighestFrequencyString();
    }
}
