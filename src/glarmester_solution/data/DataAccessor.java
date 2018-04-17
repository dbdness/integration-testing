package glarmester_solution.data;

import glarmester_solution.logic.FrameType;

/**
 *
 * @author RODA
 */
public interface DataAccessor {

    public double getGlassprice();
    public double getFramePrice(FrameType type);
    
}
