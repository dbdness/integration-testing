package glarmester_solution.logic;

import glarmester_solution.presentation.UI;
import glarmester_solution.data.DataAccessor;
import glarmester_solution.data.DataAccessorDatabase;

import glarmester_solution.presentation.TUI;

/**
 *
 * @author RODA
 */
public class Controller {
    public static final boolean DEBUG = true;
    private UI ui = new TUI();
    //private UI ui = new GUI();
//  private DataAccessor glarmester_solution.data = new DataAccessorFile();
    private DataAccessor data = new DataAccessorDatabase("glarmester");
    private PriceCalculator logic = new PriceCalculator();
    
    public void go() {
        // Get input
        double height = ui.getFrameHeight();
        //System.out.println("Height = " + height);
        double width = ui.getFrameWidth();
        //System.out.println("Width = " + width);
        FrameType type = ui.getFrameType();
        //System.out.println("Type = " + type.toString());
        
        // Calculate price
        double price = logic.calculatePrice(height, width, type, data);
        
        // Display result
        ui.displayPrice(price);
        System.exit(0);
    }
    
}
