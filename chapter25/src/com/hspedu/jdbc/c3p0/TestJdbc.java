package jdbc.c3p0;

/**
 * @author A
 * @date 2021/12/29 - 12 - 29 - 0:08
 * jdbc.c3p0
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestJdbc {
    public static void main(String[] args){
        Connection conn=JDBCUtil.getConnection();
        System.out.println(conn);
        try {
            PreparedStatement stmt=conn.prepareStatement("select * from admin");
            ResultSet re=stmt.executeQuery();
            while(re.next()){
                String name=re.getString(3);
                System.out.println(name);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}


