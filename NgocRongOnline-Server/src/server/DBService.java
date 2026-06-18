package server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBService {

    private static DBService instance;

    public static DBService gI() {
        if (instance == null) {
            instance = new DBService();
        }
        return instance;
    }

    public Connection getConnection() {
        Connection conn = null;
        try {
            String url = "jdbc:mysql://" + Manager.mysql_host + ":" + Manager.mysql_port + "/" + Manager.mysql_database
                    + "?useUnicode=true&characterEncoding=UTF-8&useSSL=false&useDynamicCharsetInfo=false";
            String user = Manager.mysql_user;
            String password = Manager.mysql_pass;

            // create a connection to the database
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    
    public static void main(String[] args) {
        Connection cn = DBService.gI().getConnection();
        if (cn != null) {
            System.out.println("ok");
        } else {
            System.out.println("lỗi");
        }
    }
    
    public static int resultSize(ResultSet rs){
        int count = 0;
        try {
            while (rs.next()) {
                count++;
            }
            rs.beforeFirst();
        } catch (SQLException e) {
        }
        return count;
    }
}
