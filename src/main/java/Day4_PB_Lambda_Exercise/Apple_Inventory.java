package Day4_PB_Lambda_Exercise;// use parameter passing
// find apples with color red:
// find apples which weighs more than 200:
import java.util.ArrayList;
import java.util.List;

public class Apple_Inventory {
    public static void main(String[] args) {

        Apple apple = new Apple();
        List<Apple> apples = new ArrayList<>();
        apple.setColor(Color.GREEN);
        apple.setWeight(300);
        apples.add(apple);
        apples.add(new Apple(Color.RED, 150));
        apples.add(new Apple(Color.GREEN, 400));
        apples.add(new Apple(Color.RED, 250));
        System.out.println("apples = " + apples);

        // find apples with color red:
        FilterApple filterApple= new FilterAppleByColor();
        List<Apple> redApples=filterApple.filter(apples, filterApple);
        System.out.println("redApples = " + redApples);

        // find apples which weighs more than 200:
        FilterApple filterApple2=new FilterAppleByWeight();
        List<Apple> heavyApples=filterApple2.filter(apples, filterApple2);
        System.out.println("heavyApples = " + heavyApples);

    }

}
