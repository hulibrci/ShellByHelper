package com.Daskama.shelby.Mysql;

import com.Daskama.shelby.config_program.ConfigAll;

import java.sql.*;


public class MysqlUploader {

    //COLOR
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    //mysql
    private static Connection conn = null;
    private static Statement stmt = null;   //statement

    private static ConfigAll config;

    //connect string
    private static String connectionString = "jdbc:mysql://" + config.getMysql_host() + ":3306/"+ config.getMysql_dbname()+ "?user="+config.getMysql_name() +"&password="+ config.getMysql_password() +"&useUnicode=true&characterEncoding=UTF-8";




    public static void createTableMYSQL(){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(connectionString);
            stmt = conn.createStatement();

            System.out.println(GeneratemysqlTable("server_info"));
            stmt.executeUpdate(GeneratemysqlTable("server_info")); //create a mysql table
            System.out.println(ANSI_GREEN + " MYSQL Done " + ANSI_RESET);

            System.out.println(ANSI_GREEN + " PLEASE SET ON CONFIG :  ADMIN_INSTALL_MODE_FIRST_TIME=false " + ANSI_RESET);
        } catch ( Exception  e ) {
            System.err.println(ANSI_RED + "ERROR : Cannot connect to database server"+ ANSI_RESET);
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }


    public static void uploadToMysqlServer(long serverID , long ownerID){
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(connectionString);
            stmt = conn.createStatement();
            int  numero = stmt.executeUpdate(connectionString, Statement.RETURN_GENERATED_KEYS); //get last ID of table

            System.out.println(numero);
            stmt.executeUpdate(GeneratemysqlValuequery(1,"server_info",numero, serverID, ownerID)); //create a mysql table

        } catch ( Exception  e ) {
            System.err.println(ANSI_RED + "ERROR : Cannot connect to database server"+ ANSI_RESET);
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }







    //mysql sql create   DEVELOPER MODE  !!!!!

    public static  String GeneratemysqlTable( String table_name_create ){


                String empty_game_string_table = String.format( "create table %s("
                        + "id INT PRIMARY KEY, server_id BIGINT (160) , owner_id BIGINT (160) )" , table_name_create );

                return empty_game_string_table;

    }




    //Mysql query (value)
    public static  String GeneratemysqlValuequery(int switchID , String table_name  , int db_id , long VALUE_serverID , long  VALUE_owenr_id  ){

        switch (switchID) {

            case 1:
                String querry_global_stats = String.format("insert into %s(id, server_id , owner_id  ) values(%d, %d , %d )", table_name , db_id ,VALUE_serverID , VALUE_owenr_id ) ;

                return querry_global_stats;

        }
        return "NO WORKS GeneratemysqlValuequery. NEED FIX ";
    }


}
