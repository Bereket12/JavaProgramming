package Day16;

public class alphabetLetter {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++) {
            // Print the alphabet
            for (char j = 'a'; j <='z' ; j++) {
                System.out.print(" "+i+""+j);
            }
            System.out.println();
        }
    }
}
