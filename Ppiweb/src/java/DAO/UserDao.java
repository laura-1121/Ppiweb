
package DAO;

import Model.Clientes;
import Util.DbUtil;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private final Connection connection;
    private List<Clientes> clientes;
    private Clientes Clientes;

    public UserDao() {
        connection = DbUtil.getConnection();
    }

    public void addClientes(Clientes clientes) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("insert into Clientes(Codclient,Nombclient,Papellidoclient,Sapellidoclient,Fechnacclient,MailClient,Direccclient,Celclient) values (?, ?, ?, ?, ?, ?, ?, ? )");
    
            preparedStatement.setString(1, clientes.getIdCliente());
            preparedStatement.setString(2, clientes.getTipodocCliente());
            preparedStatement.setString(3, clientes.getNombreCliente());
            preparedStatement.setString(4, clientes.getApellidosCliente());
            preparedStatement.setString(5, clientes.getTelefonoCliente());
            preparedStatement.setString(6, clientes.getDireccCliente());
            preparedStatement.setString(7, clientes.getGeneroCliente());
            preparedStatement.setDate(8, (Date) clientes.getFechNacCliente());
            preparedStatement.setString(8, clientes.getCelCliente());
            
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteClientes(String Codclient) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("delete from users where Codclient=?");
           
            preparedStatement.setString(1, Codclient);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateClientes(Clientes clientes) {
        try {
            PreparedStatement preparedStatement = connection
                    .prepareStatement("update users set Codclient=?, Nombclient=?, Papellidoclient=?, Sapellidoclient=?, Fechnacclient=?, MailClient=?, Direccclient=?, Celclient=?");
            
            preparedStatement.setString(1, clientes.getIdCliente());
            preparedStatement.setString(2, clientes.getTipodocCliente());
            preparedStatement.setString(3, clientes.getNombreCliente());
            preparedStatement.setString(4, clientes.getApellidosCliente());
            preparedStatement.setString(5, clientes.getTelefonoCliente());
            preparedStatement.setString(6, clientes.getDireccCliente());
            preparedStatement.setString(7, clientes.getGeneroCliente());
            preparedStatement.setString(8, clientes.getCelCliente());
            preparedStatement.setDate(9, (Date) clientes.getFechNacCliente());
            
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Clientes> getAllClientes() {
        List<Clientes> cliente = new ArrayList<Clientes>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from clientes");
            while (rs.next()) {
                Clientes clientes = new Clientes();
                clientes.setIdCliente(rs.getString("idCliente"));
                clientes.setTipodocCliente(rs.getString("tipodocCliente"));
                clientes.setNombreCliente(rs.getString("nombreCliente"));
                clientes.setApellidosCliente(rs.getString("apellidosCliente"));
                clientes.setTelefonoCliente(rs.getString("telefonoClientet"));
                clientes.setDireccCliente(rs.getString("mailClient"));
                clientes.setGeneroCliente(rs.getString("generoCliente"));
                clientes.setCelCliente(rs.getString("celCliente"));
                clientes.setFechNacCliente(rs.getDate("fechNacCliente"));
                
                
                clientes.addClientes(clientes); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return clientes;
    }

    public Clientes getUserById(String codclient) {
        Clientes clientes = new Clientes();
        try {
            PreparedStatement preparedStatement = connection.
                    prepareStatement("select * from users where userid=?");
            preparedStatement.setString(1, codclient);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()) {
                clientes.setIdCliente(rs.getString("idCliente"));
                clientes.setTipodocCliente(rs.getString("tipodocCliente"));
                clientes.setNombreCliente(rs.getString("nombreCliente"));
                clientes.setApellidosCliente(rs.getString("apellidosCliente"));
                clientes.setTelefonoCliente(rs.getString("telefonoClientet"));
                clientes.setDireccCliente(rs.getString("mailClient"));
                clientes.setGeneroCliente(rs.getString("generoCliente"));
                clientes.setCelCliente(rs.getString("celCliente"));
                clientes.setFechNacCliente(rs.getDate("fechNacCliente"));
                
            }
        } catch (SQLException e) {
        }

        return (Clientes);
    }
}
