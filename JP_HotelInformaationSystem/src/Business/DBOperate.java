/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author yizhe
 */
public class DBOperate {
    //connect
    private static Connection getConn() {
    String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url = "jdbc:sqlserver://localhost:1433;DatabaseName=JP_Hotel";
    String username = "sa";
    String password = "12345";
    Connection conn = null;
    try {
        Class.forName(driver); //classLoader,加载对应驱动
        conn = (Connection) DriverManager.getConnection(url, username, password);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return conn;
    }
    
    //select
    public static ResultSet select(String sql) {
        Connection conn = getConn();
        PreparedStatement pstmt;
        ResultSet rs=null;
        try {
            pstmt = (PreparedStatement)conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
        } catch (SQLException e) {
            
        }
        return rs;
    }
    
    //insert+update+delete
    public static int update(String sql) {
        Connection conn = getConn();
        int i = 0;
        PreparedStatement pstmt;
        try {
            pstmt = (PreparedStatement) conn.prepareStatement(sql);
            i = pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            
        }
        return i;
    }
    
    
//    //insert
//    public static int insert(String sql,int length) {
//    String sql2=sql.substring(6);
//    String[] sqlList=sql2.split(",");
//    Connection conn = getConn();
//    int i = 0;
//    PreparedStatement pstmt;
//    try {
//        pstmt = (PreparedStatement) conn.prepareStatement(sql);
//        for(int j=0;j<length;j++){
//            pstmt.setString(j+1, sqlList[j]);
//        }
//        i = pstmt.executeUpdate();
//        pstmt.close();
//        conn.close();
//    } catch (SQLException e) {
//        e.printStackTrace();
//    }
//    return i;
//    }
    
    
//    private static int insert2(Student student) {
//    Connection conn = getConn();
//    int i = 0;
//    String sql = "insert into db_owner.students (Name,Sex,Age) values(?,?,?)";
//    PreparedStatement pstmt;
//    try {
//        pstmt = (PreparedStatement) conn.prepareStatement(sql);
//        pstmt.setString(1, student.getName());
//        pstmt.setString(2, student.getSex());
//        pstmt.setString(3, student.getAge());
//        i = pstmt.executeUpdate();
//        pstmt.close();
//        conn.close();
//    } catch (SQLException e) {
//        e.printStackTrace();
//    }
//    return i;
//    }
    
//    private static int update(Student student) {
//    Connection conn = getConn();
//    int i = 0;
//    String sql = "update db_owner.students set Age='" + student.getAge() + "' where Name='" + student.getName() + "'";
//    PreparedStatement pstmt;
//    try {
//        pstmt = (PreparedStatement) conn.prepareStatement(sql);
//        i = pstmt.executeUpdate();
//        System.out.println("resutl: " + i);
//        pstmt.close();
//        conn.close();
//    } catch (SQLException e) {
//        e.printStackTrace();
//    }
//    return i;
//    }
    
//    private static Integer getAll() {
//    Connection conn = getConn();
//    String sql = "select * from db_owner.students";
//    PreparedStatement pstmt;
//    try {
//        pstmt = (PreparedStatement)conn.prepareStatement(sql);
//        ResultSet rs = pstmt.executeQuery();
//        int col = rs.getMetaData().getColumnCount();
//        System.out.println("============================");
//        while (rs.next()) {
//            for (int i = 1; i <= col; i++) {
//                System.out.print(rs.getString(i) + "\t");
//                if ((i == 2) && (rs.getString(i).length() < 8)) {
//                    System.out.print("\t");
//                }
//             }
//            System.out.println("");
//        }
//            System.out.println("============================");
//    } catch (SQLException e) {
//        e.printStackTrace();
//    }
//    return null;
//    }
    
//    private static int delete(String name) {
//    Connection conn = getConn();
//    int i = 0;
//    String sql = "delete from db_owner.students where Name='" + name + "'";
//    PreparedStatement pstmt;
//    try {
//        pstmt = (PreparedStatement) conn.prepareStatement(sql);
//        i = pstmt.executeUpdate();
//        System.out.println("resutl: " + i);
//        pstmt.close();
//        conn.close();
//    } catch (SQLException e) {
//        e.printStackTrace();
//    }
//    return i;
//    }
    
    
    
//    public static void main2(String args[]) {
//    DBOperate.getAll();
//    DBOperate.insert(new Student("Achilles", "Male", "14"));
//    DBOperate.getAll();
//    DBOperate.update(new Student("Bean", "", "7"));
//    DBOperate.delete("Achilles");
//    DBOperate.getAll();
//    }
}
