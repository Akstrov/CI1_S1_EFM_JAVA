
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author THUNDEROBOT
 */
public class LoginManagement {

    static Connection con = AppConfig.connexion();
    static Statement stmt = null;
    static ResultSet rs = null;
    static PreparedStatement ps = null;

    public static boolean validation(String un, String pwd) {
        String username = null;
        String password = null;
        try {
            String query = "SELECT * FROM users WHERE nom_utilisateur = ? AND mot_de_passe = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, un);
            ps.setString(2, pwd);

            rs = ps.executeQuery();

            while (rs.next()) {
                username = rs.getString("username");
                password = rs.getString("password");
            }

            if (username == null || password == null) {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur de connexion", JOptionPane.ERROR_MESSAGE);
        }
        return true;
    }

    public static String getRole(String username) {
        String role = null;
        try {
            String query = "SELECT * FROM users";
            ps = con.prepareStatement(query);

            rs = ps.executeQuery();

            while (rs.next()) {
                role = rs.getString("role");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Erreur de role", JOptionPane.ERROR_MESSAGE);
        }
        return role;
    }
}
