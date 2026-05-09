import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.google.common.truth.Truth.assertThat;



public class Q1Test {

  @Test
  void testEven() {
    List<Integer> testlist = new ArrayList<>();
    List<Integer> output = new ArrayList<>();

    output.add(2);
    output.add(4);
    output.add(6);

    testlist.add(1);
    testlist.add(2);
    testlist.add(3);
    testlist.add(4);
    testlist.add(5);
    testlist.add(6);

    assertThat(Q1.even(testlist)).isEqualTo(output);
  }
}