package br.com.alura.bytebank.domain;

import com.mysql.cj.exceptions.ClosedOnExpiredPasswordException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection recuperaConexao(){
        try {
            return DriverManager
                    .getConnection("jdbc:mysql:" +
                            "//localhost:3306/byte_bank?user=root&password=Aaaadsd][/123");
        }
        catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String... x) {

    }

}
