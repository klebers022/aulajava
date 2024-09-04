package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PessoaDaoImplemantada implements PessoaDao {

    private final Connection connection;

    public PessoaDaoImplemantada(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Pessoas pessoas) throws SQLException {
        String sql =  "INSERT INTO PESSOA_1TDSPJ(id,name,idade) VALUES (?, ?, ?)";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setLong(1, pessoas.getId());
        pstmt.setString(2, pessoas.getNome());
        pstmt.setInt(3, pessoas.getIdade());
        pstmt.executeUpdate();
    }

    @Override
    public List<Pessoas> read() {
        return List.of();
    }

    @Override
    public void update(Pessoas pessoas) {

    }

    @Override
    public void delete(Long id) {

    }
}
