public class Result {
    public static void main(String[] args) {
        int score = 99;
        if (score < 35) {
            System.out.println("Better Luck Next Time");
        }
        else if(score > 35 && score <= 50)
        {
            System.out.println("Pass");
        }
        else if(score > 50 && score <= 80)
        {
            System.out.println("Second Class");
        }
        else if(score > 80 && score <= 90)
        {
            System.out.println("First class");
        }
        else if(score > 90 && score < 100)
        {
            System.out.println("Distinction");
        }
        else{
            System.out.println("Enter Valid number");
        }
    }
}