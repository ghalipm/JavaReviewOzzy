package Day4_PB_Lambda_Exercise;

import java.util.LinkedList;
import java.util.List;
// For behavior parameterization or Lambda expression, the interface must have only one abstract method.

public class FilterAppleByWeight implements FilterApple {

    @Override
    public List<Apple> filter(List<Apple> apples, FilterApple filterApple) {
        int weight=200;
        List<Apple> heavyApples= new LinkedList<>();
        for (Apple apple1: apples) {
            if (apple1.getWeight()>weight)
                heavyApples.add(apple1);
        }

        return heavyApples;
    }
}
