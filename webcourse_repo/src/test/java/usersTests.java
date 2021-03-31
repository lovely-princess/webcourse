import DAO.usersDAO;
import classes.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLException;



public class usersTests {
    @Test
    public void loadAllTest () throws SQLException{
        usersDAO usr_dao = new usersDAO();
        Assert.assertEquals(usr_dao.loadAll().size(), 3);
    }
}
