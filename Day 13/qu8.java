package Day13Pack;

public class  qu8{
    public static void main(String args[]){
        /*Thread t1= new Thread(()->{int a=1; while(a<=10){System.out.println(a++);}},"first thread");
        t1.start();*/
        Runnable ref=(()->{int a=1;while(a<=10){System.out.println(a++);}});
        Thread t1 = new Thread(ref);
        t1.start();
    }
}