package com.daskama.shelby.Mysql;

import com.daskama.shelby.config_program.ConfigAll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


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
    private static String connectionString = "jdbc:mysql://"
        + config.getMysqlHost()
        + ":3306/"
        + config.getMysqlDbname()
        + "?user="
        + config.getMysqlName()
        + "&password="
        + config.getMysqlPassword()
        + "&useUnicode=true&characterEncoding=UTF-8";


    /**
     * Vytvorí Table v MYSQL.
     */
    public static void createTableMysql() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(connectionString);
            stmt = conn.createStatement();

            System.out.println(generatemysqlTable("server_info"));
            stmt.executeUpdate(generatemysqlTable("server_info")); //create a mysql table
            System.out.println(ANSI_GREEN + " MYSQL Done " + ANSI_RESET);

            System.out.println(
                ANSI_GREEN + " PLEASE SET ON CONFIG :  ADMIN_INSTALL_MODE_FIRST_TIME=false "
                    + ANSI_RESET);
        } catch (Exception e) {
            System.err.println(ANSI_RED + "ERROR : Cannot connect to database server" + ANSI_RESET);
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }


    /**
     * Odošle na table udaje zo servera .
     *
     * @param serverID - SERver id.
     * @param ownerID  - owner id .
     */
    public static void uploadToMysqlServer(long serverID, long ownerID) {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(connectionString);
            stmt = conn.createStatement();
            int numero = stmt.executeUpdate(connectionString,
                Statement.RETURN_GENERATED_KEYS); //get last ID of table

            System.out.println(numero);
            stmt.executeUpdate(generatemysqlValuequery(1, "server_info", numero, serverID,
                ownerID)); //create a mysql table

        } catch (Exception e) {
            System.err.println(ANSI_RED + "ERROR : Cannot connect to database server" + ANSI_RESET);
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }


    //mysql sql create   DEVELOPER MODE  !!!!!

    /**
     * Vytvori table.
     *
     * @param tableNameCreate meno table.
     * @return querry
     */
    public static String generatemysqlTable(String tableNameCreate) {


        String emptyGameStringTable = String.format("create table %s("
                + "id INT PRIMARY KEY, server_id BIGINT (160) , owner_id BIGINT (160) )",
            tableNameCreate);

        return emptyGameStringTable;
    }


    /**
     * insert do mysql.
     *
     * @param switchID      .
     * @param tableName     meno table .
     * @param dbId          id.
     * @param valueServerID .
     * @param valueOwenrid  .
     * @return QUERRY.
     */
    //Mysql query (value)
    public static String generatemysqlValuequery(int switchID, String tableName, int dbId,
                                                 long valueServerID, long valueOwenrid) {

        switch (switchID) {

            case 1:
                String querryGlobalStats = String
                    .format("insert into %s(id, server_id , owner_id  ) values(%d, %d , %d )", tableName,
                        dbId, valueServerID, valueOwenrid);

                return querryGlobalStats;

        }
        return "NO WORKS GeneratemysqlValuequery. NEED FIX ";
    }


}
