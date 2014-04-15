import com.pergamon.ds.DiscreteSet

/**
 * Created by ge3k on 2/4/14.
 */
class GroovyDiscreteSetTest extends GroovyTestCase {


    void testConnected() {
        DiscreteSet unionFind = new DiscreteSet(10)
        unionFind.union(4,3)
        unionFind.union(3,8)
        unionFind.union(6,5)
        unionFind.union(9,4)
        unionFind.union(2,1)
        unionFind.union(5,0)
        unionFind.union(7,2)
        unionFind.union(6,1)
        assertEquals unionFind.count(),2
    }

}
