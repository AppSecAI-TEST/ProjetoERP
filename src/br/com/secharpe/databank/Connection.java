/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.secharpe.databank;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.DriverManager;
import java.sql.SQLException;
import br.com.secharpe.util.Log;

/**
 *
 * @author LuizAlexandre17 <luizalexandreluz@unesc.net>
 */
public class Connection {

    

    public static java.sql.Connection getConnection() {
        java.sql.Connection conn = null;
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            //conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/bancodb", "sa", "");
            conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/agendadb", "sa", "");
        } catch (SQLException e) {
            System.out.println("Problemas ao conectar no banco de dados");
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            Log log = new Log();
            log.put("Connection", exceptionAsString);
        } catch (ClassNotFoundException e) {
            System.out.println("O driver não foi configurado corretametne");
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            String exceptionAsString = sw.toString();
            Log log = new Log();
            log.put("Connection", exceptionAsString);
        }

        return conn;
    }

}
