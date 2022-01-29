package Day4_PB_Lambda_Exercise;

import java.util.List;

//@interface
public interface FilterApple {

    List<Apple> filter(List<Apple> apples, FilterApple filterApple);

}
