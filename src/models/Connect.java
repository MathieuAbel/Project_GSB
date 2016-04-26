package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

  public static Connection Connection() throws SQLException, ClassNotFoundException {
    
      Class.forName("oracle.jdbc.driver.OracleDriver");
      
//      String url = "jdbc:oracle:thin:172.15.11.102/2SLAM_EQUIPE2_test@//localhost:1521/xe";
//      String user = "mabel";
//      String password = "jfcw4";
      
        String url = "jdbc:oracle:thin:@172.15.11.102:1521:orcl";
        String user = "ora_2slamppe_eq2";
        String password = "equipe02";

      Connection con = DriverManager.getConnection(url, user, password);

      return con;
      
  }
}