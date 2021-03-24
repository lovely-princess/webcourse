import DAO.usersDAO;
import classes.users;

import java.util.List;

public class main {
    public static void main(String[] args){
        System.out.println("its alive!");
        usersDAO user_dao = new usersDAO();
        List<users> user_list = user_dao.loadAll();
        for (users usr : user_list) {
            System.out.println("\n  " + usr.getUser_name());
        }
    }
}
