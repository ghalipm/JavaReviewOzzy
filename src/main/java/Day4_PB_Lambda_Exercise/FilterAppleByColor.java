package Day4_PB_Lambda_Exercise;

import java.util.LinkedList;
import java.util.List;

public class FilterAppleByColor implements FilterApple {

    @Override
    public List<Apple> filter(List<Apple> apples, FilterApple filterApple) {
        // The implementation based on color separation.
        List<Apple> colorApples = new LinkedList<>();
        for (Apple apple1 : apples) {
            if (apple1.getColor().equals(Color.RED))
                colorApples.add(apple1);
        }

        return colorApples;
    }
}
