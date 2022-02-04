package Day4_PB_Lambda_Exercise;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// in Dev env. these two are used, not much @Builder
public class Apple {
    private Color color;
    private int weight;
}
