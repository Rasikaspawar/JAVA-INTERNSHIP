import java.sql.*;

public class EmployeeDAO {
    private Connection conn;

    public EmployeeDAO() {
        conn = DBConnection.getConnection();
        if (conn == null) {
            System.out.println("Connection is NULL in DAO constructor!");
        }
    }

    public void addEmployee(Employee emp) {
        String sql = "INSERT INTO employee (name, email, salary) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, emp.getName());
            stmt.setString(2, emp.getEmail());
            stmt.setDouble(3, emp.getSalary());
            stmt.executeUpdate();
            System.out.println("Employee added.");
        } catch (SQLException e) {
            System.out.println("Error in addEmployee:");
            e.printStackTrace();
        }
    }

    public void viewEmployees() {
        String sql = "SELECT * FROM employee";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " +
                                   rs.getString("name") + " | " +
                                   rs.getString("email") + " | " +
                                   rs.getDouble("salary"));
            }
        } catch (SQLException e) {
            System.out.println("Error in viewEmployees:");
            e.printStackTrace();
        }
    }

    public void updateEmployee(Employee emp) {
        String sql = "UPDATE employee SET name=?, email=?, salary=? WHERE id=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, emp.getName());
            stmt.setString(2, emp.getEmail());
            stmt.setDouble(3, emp.getSalary());
            stmt.setInt(4, emp.getId());
            stmt.executeUpdate();
            System.out.println("Employee updated.");
        } catch (SQLException e) {
            System.out.println("Error in updateEmployee:");
            e.printStackTrace();
        }
    }

    public void deleteEmployee(int id) {
        String sql = "DELETE FROM employee WHERE id=?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Employee deleted.");
        } catch (SQLException e) {
            System.out.println("Error in deleteEmployee:");
            e.printStackTrace();
        }
    }
}