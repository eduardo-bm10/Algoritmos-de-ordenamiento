import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SortAlgorithmsTester
{
    SortAlgorithms probar = new SortAlgorithms();
    int[] i = null;
    int[] i2 = {1,2,5,6};

    @Test
    void checkIfListHasData()
    {
        Assertions.assertNotEquals(0, probar.bubbleSort(i2).length);
    }

    @Test
    void parameterIsANullArray()
    {
        Assertions.assertThrows(IllegalArgumentException.class, () -> probar.bubbleSort(i));
    }
}
