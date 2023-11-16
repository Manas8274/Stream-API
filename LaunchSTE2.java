import java.util.*;
import java.util.stream.*;

public class LaunchSTE2 {

    public static void main(String[] args) {
        
        List<Integer> list1 = Arrays.asList(2,5,6,1,8);
        
        Stream<Integer> streamData = list1.stream();
        //streamData.forEach(n->System.out.println(n));
        
        //Stream<Integer> sortedStream = streamData.sorted();
        //sortedStream.forEach(n->System.out.println(n));

        // Multiple operation 
        Stream<Integer> finalStream = streamData.
        filter(n->n%2==0)
        .sorted()
        .map(n->n*2);

        finalStream.forEach(n->System.out.println(n));
    
    }
    
}
