import fruits.Fruits;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vegitables.Vegetables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application_context.xml");

        List<Fruits> fruitsList = context.getBean("fruitsList", ArrayList.class);
        for (Fruits fruits: fruitsList) {
            System.out.println(fruits);
        }

        List<Vegetables> vegetablesList = context.getBean("vegetablesList", ArrayList.class);
        for (Vegetables vegetables: vegetablesList) {
            System.out.println(vegetables);
        }

        System.out.println("Samsung");
        Map<String, String> tVSamsungMap = context.getBean("samsung", HashMap.class);
        for (Map.Entry<String, String> map : tVSamsungMap.entrySet()) {
            System.out.println("TV " + map.getKey() + ": " + map.getValue());
        }

        System.out.println("LG");
        Map<String, String> tVLGMap = context.getBean("lg", HashMap.class);
        for (Map.Entry<String, String> map : tVLGMap.entrySet()) {
            System.out.println("TV " + map.getKey() + ": " + map.getValue());
        }

        System.out.println("Panasonic");
        Map<String, String> tVPanasonicMap = context.getBean("panasonic", HashMap.class);
        for (Map.Entry<String, String> map : tVPanasonicMap.entrySet()) {
            System.out.println("TV " + map.getKey() + ": " + map.getValue());
        }
    }
}