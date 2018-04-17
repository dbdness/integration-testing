package glarmester_solution.data;

import static glarmester_solution.logic.Controller.DEBUG;
import glarmester_solution.logic.FrameType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author RODA
 */
public class DataAccessorDatabase implements DataAccessor {
    private String database;

    public DataAccessorDatabase(String database){
        this.database = database;
    }

    @Override
    public double getGlassprice() {
        try{
            Connection connection = new DBConnector(database).getConnection();
            Statement stmt = connection.createStatement();
            String query = "SELECT `price` FROM `prices` WHERE `name` = 'glass';";
            ResultSet res = stmt.executeQuery(query);
            if(res.next()){
                double price = res.getDouble("price");
                return price;
            }
        }catch(Exception e){
            if(DEBUG) e.printStackTrace();
        }
        return Double.NaN;
    }

    @Override
    public double getFramePrice(FrameType type) {
        try{
            Connection connection = new DBConnector(database).getConnection();
            String query = "SELECT `price` FROM `prices` WHERE `name` = ?;";
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, type.toString().toLowerCase());
            ResultSet res = stmt.executeQuery();
            if(res.next()){
                double price = res.getDouble("price");
                return price;
            }
        }catch(Exception e){
            if(DEBUG) e.printStackTrace();
        }
        return Double.NaN;
    }
    
}
