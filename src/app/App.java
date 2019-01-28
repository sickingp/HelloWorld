package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Timer");

        Timer t = new Timer();
        System.out.println(t.currentTime());  
        t.increment(1.0);      
        System.out.println(t.currentTime());
        t.increment(-1.);
        System.out.println(t.currentTime());
        t.increment(100.);
        System.out.println(t.currentTime());

        System.out.println("All done....");
        System.out.println("Master ending");
       }
}