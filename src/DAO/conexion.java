package DAO;
import java.sql.*;


public class conexion {
    String driver="com.mysql.jdbc.Driver";
    String url="jdbc:mysql://localhost:3306/comedor";
    String user="root";
    String pwd="moises1236";
    
public ResultSet Listar(String Cad){
    try{
    Class.forName(driver).newInstance();
    Connection cn=DriverManager.getConnection(url,user,pwd);
    PreparedStatement da = cn.prepareStatement(Cad);
    ResultSet tbl = da.executeQuery();
    return tbl;  
    }catch(Exception e){
    javax.swing.JOptionPane.showMessageDialog(null,e.getMessage());
    return null;
    }

}
public String Ejecutar(String Cad){
    try{
    Class.forName(driver).newInstance();
    Connection
    cn=DriverManager.getConnection(url,user,pwd);
    PreparedStatement da = cn.prepareStatement(Cad);
    int r=da.executeUpdate();
    return "Se afectaron " + r + " filas";
    }catch(Exception e){
    javax.swing.JOptionPane.showMessageDialog(null,e.getMessage());
    return "Error "+e.getMessage();
    }
}

}
