package com.javacampu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION =  "jdbc:mysql://localhost/mahasiswa";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD  = "";
    public static void main(String[] args){
        try {
            insertTable();
        }catch (SQLException ex){
            ex.printStackTrace();
        }

    }
    public static void insertTable() throws SQLException{
        Connection connection = null;
        Statement statement = null;
        int count = 0;

        String insetTableSQL = "INSERT INTO profil" + "(id, nama_mhs, nim, prodi)" + "VALUE" +"(null, 'muhaemin', '48584584', 'Teknik Informatika'" +")";

        try{
            //dapatkan database connection
            connection = getDatabaseConnection();

            //membuat object connection
            statement = connection.createStatement();
            System.out.println(insetTableSQL);

            //eksekusi insert SQl sttement
            statement.executeUpdate(insetTableSQL);

            //mendapatkan total record yang telah di-insert
            count = statement.getUpdateCount();

            System.out.println(count+"record telah berhasil di masukan ke dalam table PROFIL");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            if(statement != null){
                statement.close();
            }
            if (connection != null){
                connection.close();
            }
        }
    }

    public static Connection getDatabaseConnection(){
        Connection connection = null;
        try{
            Class.forName(DB_DRIVER);
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            return connection;
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return connection;
    }

}
