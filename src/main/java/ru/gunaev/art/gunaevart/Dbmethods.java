package ru.gunaev.art.gunaevart;

public class Dbmethods extends ConnectnoSql {
    public static void addUser(String name, int phone) throws Exception {
        // prepareStatement
        ConnectnoSql.connectDb();
        String sql = "INSERT INTO users (name, phone) VALUES (?, ?); ";
        prepareStatement = connect.prepareStatement(sql);
        prepareStatement.setString(1, name);
        prepareStatement.setInt(2, phone);
        prepareStatement.executeUpdate();
        System.out.println("Данные добавены.");
    }


    public static void addUserNew(String name, int phone) throws Exception {
        //statement
        ConnectnoSql.connectDb();
        statement = connect.createStatement();
        String sql = "INSERT INTO users (name, phone) VALUES ('" + name + "', '" + phone + "');";
        statement.executeUpdate(sql);
        System.out.println("Данные добавены.");
    }


    public static void selectUser() throws Exception{
        ConnectnoSql.connectDb();
        prepareStatement = connect.prepareStatement("SELECT * FROM users");
        resultSet = prepareStatement.executeQuery();
        while (resultSet.next()){
            String name = resultSet.getString("name");
            int phone = resultSet.getInt("phone");
            System.out.print("Имя " + name + ": Телефон :" + phone +"\n");

        }
        connect.close();
        prepareStatement.close();
        resultSet.close();
    }


}
