package org.example;

public class Pessoas {

    private Long id ;

    private String nome;

    private  int idade;

    public Pessoas(Long id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        setIdade(idade);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if(isMaiordeIdade(idade)) {
            this.idade = idade;
        }else{
            throw  new RuntimeException();
        }

    }

    public  boolean isMaiordeIdade(int idade){
        return idade >= 18;
    }


    @Override
    public String toString() {
        return "Pessoas{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}


