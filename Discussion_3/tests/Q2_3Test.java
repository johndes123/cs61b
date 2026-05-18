import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.Test;

import java.util.*;




public class Q2_3Test {
    @Test
    void testCommonBasic() {
        Q2_3.IntList2 L1 = new Q2_3.IntList2(1, new Q2_3.IntList2(2, null));
        Q2_3.IntList2 L2 = new Q2_3.IntList2(2, new Q2_3.IntList2(2, null));

        Q2_3.IntList2.replace(L1, 1, 2);
        assertThat(L1.first).isEqualTo(L2.first);
        assertThat(L1.rest.first).isEqualTo(L2.rest.first);

    }
}
