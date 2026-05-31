package sistemamakeup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    // MÉTODO 1: Traer los clientes de MySQL hacia el sistema Observer
    public List<Cliente> obtenerClientesSuscritos() {
        List<Cliente> listaClientes = new ArrayList<>();
        String sql = "SELECT * FROM clientes";

        try (Connection con = ConexionBD.conectar();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String email = rs.getString("email");

                // Construimos el objeto con los datos de la BD
                listaClientes.add(new Cliente(id, nombre, email));
            }
        } catch (SQLException e) {
            System.out.println("Error al cargar clientes de MySQL: " + e.getMessage());
        }
        return listaClientes;
    }

    // MÉTODO 2: Insertar un cliente nuevo cuando se registre en la caja
    public void insertarCliente(Cliente cliente) {
        String sql = "INSERT INTO clientes (nombre, email) VALUES (?, ?)";

        try (Connection con = ConexionBD.conectar();
             PreparedStatement pstmt = con.prepareStatement(sql)) {

            pstmt.setString(1, cliente.getNombre());
            pstmt.setString(2, cliente.getEmail());

            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("-> [BD] ¡Cliente registrado en MySQL con éxito!");
            }

        } catch (SQLException e) {
            // Si el correo ya existe saltará aquí por la restricción UNIQUE de tu BD
            System.out.println("Aviso BD: El cliente ya se encontraba registrado.");
        }
    }
}