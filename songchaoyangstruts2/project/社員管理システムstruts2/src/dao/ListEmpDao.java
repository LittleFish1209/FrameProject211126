package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListEmpDao {
//	private static Connection conn;
//   private static User user = new User();
//    private PreparedStatement ps;
//    private ResultSet rs;
    public static void main(String[] args) {
        //dao.DBUtilからデータベースへの接続を得る
//        conn = DBUtil.getConnect();
        //SQLステートメント、オブジェクトの作成
//        Statement stm = con.createStatement();
//        String sql = "select * from empinfo";
//        ResultSet rs = stm.executeQuery(sql);
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM empinfo";
        try {
        	con = DBUtil.getConnect();
        	stmt = con.prepareStatement(sql);
        	rs = stmt.executeQuery();
       /* ps.setString(1, id);*/
        //結果の出力
//        rs = ps.executeQuery();
        while (rs.next()) {
        	String empCd=rs.getString("empCd");
        	String name=rs.getString("name");
        	String birthday=rs.getString("birthday");
        	String countryCd=rs.getString("countryCd");
        	String sexCd=rs.getString("sexCd");

            System.out.println(empCd+name+birthday+countryCd+sexCd);
        }} catch (SQLException e) {
        	System.out.println("データベースアクセスエラーです");
        } finally {
        try {
        if (con != null) {
     con.close();
                    }
    } catch (SQLException e) {
        System.out.println("データベースアクセスエラーです");
                }
            }
    }
}

