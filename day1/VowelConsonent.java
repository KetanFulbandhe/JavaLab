public class VowelConsonent {
    public static void main(String[] args) {
        char s='B';
        switch (s) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
                System.out.println("Vowel");                
                break;
            default:
                System.out.println("Consonants");
                break;
        }
    }
}