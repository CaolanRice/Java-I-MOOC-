import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;


public class ExerciseManagementTest {
    private ExerciseManagement management;

    @Before
    public void initialize() {
        management = new ExerciseManagement();
    }
    
    @Test
    public void ExerciseManagementTest() {
        assertEquals(0, management.exerciseList().size());
    }
    
}
