import glarmester_solution.logic.FrameType;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import glarmester_solution.data.DataAccessor;
import glarmester_solution.data.DataAccessorDatabase;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;

public class DataAccessorDatabaseTest {

    //Inject the staging database name into the connector.
    private DataAccessor database = new DataAccessorDatabase("glarmester_staging");

    @BeforeClass
    public static void beforeAll(){
        //Here I would call a method that would copy the production database
        //to the staging database.
    }

    @Test
    public void getGlasspriceTest() {
        double expectedPrice = 300;
        double actualPrice = database.getGlassprice();

        assertThat(actualPrice, is(expectedPrice));
    }

    @Test
    public void getSimpleFramePriceTest() {
        double expectedPrice = 100;
        double actualPrice = database.getFramePrice(FrameType.Simple);

        assertThat(actualPrice, is(expectedPrice));
    }

    @Test
    public void getOrnateFramePriceTest(){
        double expectedPrice = 200;
        double actualPrice = database.getFramePrice(FrameType.Ornate);

        assertThat(actualPrice, is(expectedPrice));
    }

    @Test
    public void getLavishFramePriceTest(){
        double expectedPrice = 350;
        double actualPrice = database.getFramePrice(FrameType.Lavish);

        assertThat(actualPrice, is(expectedPrice));
    }
}