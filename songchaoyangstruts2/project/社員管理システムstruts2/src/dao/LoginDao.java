package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.User;

public class LoginDao {
	private Connection conn;
    private User user = new User();
    private PreparedStatement ps;
    private ResultSet rs;
    public User getUser(String id) throws SQLException {
        //dao.DBUtilからデータベースへの接続を得る
        conn = DBUtil.getConnect();
        //SQLステートメント、オブジェクトの作成
        String sql = "select * from loginuser where accountId=?";
        ps = conn.prepareStatement(sql);
        ps.setString(1, id);
        //結果の出力
        rs = ps.executeQuery();
        while (rs.next()) {
            user.setAccountId(rs.getString("accountId"));
            user.setPassword(rs.getString("password"));
            return user;
        }
        return null;
    }
}
