import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by bici on 16/1/10.
 */

public class JavaClass {

    public static void main(String[] args){
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.abc(new String[]{"abc", "hello"});
        System.out.println(helloWorld.min(14, 15));
        helloWorld.testLoop(new String[]{"abc", "haahaa"});
        helloWorld.cases("hello");
        helloWorld.cases(123l);

        List<String> arrayList = helloWorld.testCollections(new String[]{"abc", "hello", "aaa"});
        System.out.println("\n" + arrayList.size());
        for(String abc : arrayList){
            System.out.println("item = "+abc);
        }

        Map<Integer, String> mapData = new HashMap();
        mapData.put(1, "abc");
        mapData.put(3, "hello");
        mapData.put(5, "TEST");
        mapData.put(4, "baidapang");
        mapData.put(2, "Dandan");
        helloWorld.testMap(mapData);

        for(int i=0; i<10; i++){
            System.out.println(HelloWorld.Resource.age);
        }
        helloWorld.cases(HelloWorld.Resource.age);

        helloWorld.testFile();

        Customer customer = new Customer("jiang", "jiang@163.com");
        customer.getEmail();
        customer.getName();
    }
}
