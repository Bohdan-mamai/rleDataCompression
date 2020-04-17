import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoderFunctionalityTest {

    @Test
    public void positiveScenarios(){
        assertEquals("4A3a6B\\\\\\1\\2", CoderFunctionality.coder("AAAAaaaBBBBBB\\12"));
        assertEquals("1A3a2B\\2", CoderFunctionality.coder("AaaaBB2"));
        assertEquals("1A3a2B\\\\\\\\\\2", CoderFunctionality.coder("AaaaBB\\\\2"));
        assertEquals("4A3a6B\\\\\\1\\2", CoderFunctionality.coder("AAAAaaaBBBBBB\\12"));
    }

    @Test
    public void negativeScenarios() {
        assertNotEquals("AAAAaaaBBBBBB\\12", CoderFunctionality.coder("4F5S"));
        assertNotEquals("AaaaBB2", CoderFunctionality.coder("3333\\2"));
        assertNotEquals("AaaaBB\\\\2", CoderFunctionality.coder("55\\\\\\\\\\\\\\2"));
        assertNotEquals("2222", CoderFunctionality.coder("4A3a6B\\\\\\1\\\2"));
    }

}