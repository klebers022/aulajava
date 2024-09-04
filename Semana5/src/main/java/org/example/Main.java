package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static final  String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCl" ;
    public static final String USER = "RM557887";
    public static final String PASS = "210106";

    public static void main(String[] args) throws SQLException {



        Pessoas cliente = new Pessoas(5l,"Thiago",25);
        System.out.println(cliente);

        DatabaseConfig db = new DatabaseConfig(URL,USER,PASS);
        Connection connection = db.getConnection();

        PessoaDao pessoaDao = new PessoaDaoImplemantada(connection);
        pessoaDao.create(cliente);

    }
}