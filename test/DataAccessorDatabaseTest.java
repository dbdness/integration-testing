import org.junit.Before;
import org.junit.Test;

import glarmester_solution.data.DataAccessor;
import glarmester_solution.data.DataAccessorDatabase;

import static org.hamcrest.MatcherAssert.assertThat;

public class DataAccessorDatabaseTest {

    private DataAccessor database = new DataAccessorDatabase("glarmester_staging");



    @Before
    public void init(){

    }

    @Test
    public void getGlasspriceTest() {


    }

    @Test
    public void getFramePriceTest() {
    }
}