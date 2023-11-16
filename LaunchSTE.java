import java.util.*;
import java.util.stream.*;

public class LaunchSTE {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stdata = list.stream();
        stdata.forEach(n->System.out.println(n));
    }
    
}
