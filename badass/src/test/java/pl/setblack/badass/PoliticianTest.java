package pl.setblack.badass;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jarekratajski
 */
public class PoliticianTest {

    public PoliticianTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void testTaskExecuted() {
        final StringBuilder slogan = new StringBuilder("yes");
        Politician.beatAroundTheBush(() -> slogan.append(" we can"));
        assertEquals("yes we can", slogan.toString());
    }

    @Test
    public void testTaskExecutedAndReturns() {
        final StringBuilder slogan = new StringBuilder("yes");
        slogan.append(Politician.beatAroundTheBush(() -> " we can"));
        assertEquals("yes we can", slogan.toString());
    }

    @Test(expected = RuntimeException.class)
    public void testTaskException() {
        Politician.beatAroundTheBush(() -> {
            throw new Exception("what if we can't");
        });

    }
}
