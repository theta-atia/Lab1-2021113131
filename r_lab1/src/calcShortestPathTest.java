import java.io.FileNotFoundException;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class calcShortestPathTest {
    private DirectedGraphApp Dgraph;

    @Before
    public void setUp() throws FileNotFoundException {
        Dgraph=new DirectedGraphApp();
        DirectedGraphApp.clearGraph();
        String filePath = "test.txt";
        Dgraph.buildGraph(filePath);
    }

    @Test
    public void testcalcShortestPath_1() {
        String result = Dgraph.calcShortestPath("seek", "word2");
        assertEquals("No path between seek and word2", result);
    }

    @Test
    public void testcalcShortestPath_2() {
        String result = Dgraph.calcShortestPath("seek", "out");
        assertEquals("Shortest path (1): seek -> out", result);
    }

    @Test
    public void testcalcShortestPath_3() {
        String result = Dgraph.calcShortestPath("civilizations", "out");
        assertEquals("No path between civilizations and out", result);
    }

    @Test
    public void testcalcShortestPath_4() {
        String result = Dgraph.calcShortestPath("seek", "new");
        assertEquals("Shortest path (2): seek -> out -> new", result);
    }
}
