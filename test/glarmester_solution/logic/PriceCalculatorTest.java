package glarmester_solution.logic;

import glarmester_solution.data.DataAccessor;
import glarmester_solution.data.DataAccessorDatabase;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class PriceCalculatorTest {

    private DataAccessor dataAccessor = new DataAccessorDatabase("glarmester_staging");
    private PriceCalculator priceCalculator = new PriceCalculator();

    @Test
    public void calculatePriceTest() {
        double expectedPrice = 43.0;
        double actualPrice = priceCalculator.calculatePrice((double)10/100, (double)10/100, FrameType.Simple, dataAccessor);

        assertThat(expectedPrice, is(actualPrice));
    }
}