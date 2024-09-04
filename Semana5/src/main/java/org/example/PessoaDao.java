package org.example;

import java.sql.SQLException;
import java.util.List;

public interface PessoaDao {
    //TODO: Criar assinaturas para Create
    void create(Pessoas pessoas) throws SQLException;

    //TODO: Criar assinaturas para Read
    List<Pessoas> read();

    //TODO: Criar assinaturas para Update
    void update(Pessoas pessoas);

    //TODO: Criar assinaturas para Delete
    void delete(Long id);
}
