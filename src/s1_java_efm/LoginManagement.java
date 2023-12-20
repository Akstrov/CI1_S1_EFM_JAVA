package s1_java_efm;

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

    public static String getName() {
        return name;
    }

    public static String getRole() {
        return role;
    }
    private static String name;
    private static String role;
    private static int id;

    public static int getId() {
        return id;
    }

    public static boolean validation(String un, String pwd) {
        String username = null;
        String password = null;
        try {
            String query = "SELECT * FROM users WHERE nom_utilisateur = ? AND mot_de_passe = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, un);
            ps.setString(2, pwd);

            rs = ps.executeQuery();
            rs.next();
            name = rs.getString("nom");
            role = rs.getString("role");
            username = rs.getString("nom_utilisateur");
            password = rs.getString("mot_de_passe");

            if (username == null || password == null) {
                return false;
            }
            if (role.equals("gerant")) {
                id = rs.getInt("id_gerant");
            }
<<<<<<< HEAD

            if (username == null || password == null) {
                return false;
            }
=======
>>>>>>> 3b82e76eb59b4ac14583980fe1d315e0ac60472d
        } catch (SQLException e) {
            return false;
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
