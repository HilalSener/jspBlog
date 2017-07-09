package blog.source;

import java.sql.*;

public class DB {
    public Connection conn;
    public String cS = "jdbc:mysql://127.0.0.1/blogdb?useUnicode=true&characterEncoding=UTF-8";
    
    public DB() throws Exception
    {
        Class.forName("org.gjt.mm.mysql.Driver");
        conn = DriverManager.getConnection(cS, "root", "");
    }
    
    public void query(String sql) throws Exception
    {
        Statement s = conn.createStatement();
        s.execute(sql);
        s.close();
    }
    
    public ResultSet execute(String sql) throws Exception
    {
        Statement s = conn.createStatement();
        ResultSet rs = s.executeQuery(sql);

        return rs;
    }
}