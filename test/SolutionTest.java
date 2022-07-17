import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    public void canConstructAFromB() {
        assertFalse(new Solution().canConstruct("a", "b"));
    }

    @Test
    public void canConstructAAFromAB() {
        assertFalse(new Solution().canConstruct("aa", "ab"));
    }

    @Test
    public void canConstructAAFromAAB() {
        assertTrue(new Solution().canConstruct("aa", "aab"));
    }

}