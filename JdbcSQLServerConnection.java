import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
 
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

/**
 * This program demonstrates how to establish database connection to Microsoft
 * SQL Server.
 * @author www.codejava.net
 *
 */
public class JdbcSQLServerConnection {
 
    public static void main(String[] args) {
 
        Connection conn = null;
 
        try {
            System.out.println("Line 1 ");
            String dbURL = "jdbc:sqlserver://132.148.185.6\\poojithamssql";
            String user = "poojitha";
            String pass = "Poojitha$9";
            System.out.println("Line 2 ");
            conn = DriverManager.getConnection(dbURL, user, pass);
            System.out.println("Line 3 ");
            if (conn != null) {
                DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
                System.out.println("Driver name: " + dm.getDriverName());
                System.out.println("Driver version: " + dm.getDriverVersion());
                System.out.println("Product name: " + dm.getDatabaseProductName());
                System.out.println("Product version: " + dm.getDatabaseProductVersion());
            }
 
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}