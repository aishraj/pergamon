import com.pergamon.sorts.Shuffle

/**
 * Created by ge3k on 15/4/14.
 */
class GroovyShuffleTest extends GroovyTestCase{
    void testShuffled () {
        int[] testItems = new int[6]
        for (int i = 0; i < 6; i++) {
            testItems[i] = i;
        }
        Shuffle.shuffleArray(testItems);
        for (int i = 0; i < 6; i++) {
            assertNotNull(testItems[i])
            assert testItems[i] != i
        }
    }
}
