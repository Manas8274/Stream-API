


public class LaunchDT1 {

    public static void main(String[] args) {
        
        java.util.Date dt = new java.util.Date();
        System.out.println(dt);

        long timeInMs = dt.getTime();

        java.sql.Date dt1 = new java.sql.Date(timeInMs);
        System.err.println(dt1);

    }
    
}
