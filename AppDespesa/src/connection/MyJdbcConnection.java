package connection;

import java.sql.*;

public class MyJdbcConnection {
    public static void main(String[] args) {
        try {
            Connection connection= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/despesa",
                    "root",
                    ""
            );

            Statement statement=connection.createStatement();
            ResultSet resultSet=statement.executeQuery(" SELECT * FROM tb_despesas");
            while (resultSet.next()) {
                System.out.println(resultSet.getDate("dataD")+ "| ");
                System.out.print(resultSet.getString("doc")+"| ");
                System.out.print(resultSet.getString("nrdoc")+"| ");
                System.out.print(resultSet.getDouble("valor")+"| ");

            }
            }catch (SQLException e){
            e.printStackTrace();
        }


    }

}
