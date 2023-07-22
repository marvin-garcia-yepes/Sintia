package com.example.sintia.conexion.bd;

import android.database.SQLException;

import java.sql.Array;
import java.sql.DriverManager;

public class BaseDatos {

//    fun bd(args:Array<String>) {
//        val url = "jdbc:mysql://<hostname>:<port>/<database_name>"
//        val username = "<username>"
//        val password = "<password>"
//
//        try {
//            // Crea la conexión a la base de datos
//            val connection = DriverManager.getConnection(url, username, password)
//
//            // Crea una consulta SQL
//            val query = "SELECT * FROM <table_name>"
//
//            // Ejecuta la consulta y obtiene los resultados
//            val statement = connection.createStatement()
//            val resultSet = statement.executeQuery(query)
//
//            // Procesa los resultados
//            while (resultSet.next()) {
//                val column1 = resultSet.getString("<column1_name>")
//                val column2 = resultSet.getInt("<column2_name>")
//                // ...
//            }
//
//            // Cierra los recursos
//            resultSet.close()
//            statement.close()
//            connection.close()
//
//        } catch (e:SQLException) {
//            e.printStackTrace()
//        }
//    }
}
