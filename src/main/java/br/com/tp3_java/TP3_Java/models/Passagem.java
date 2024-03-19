package br.com.tp3_java.TP3_Java.models;

import jakarta.persistence.*;

@Entity
@Table( name = "tb_passagem")
public class Passagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "partida")
    private String localPartida;

    @Column(name = "chegada")
    private String localChedada;

    private String duracao;
    private Double preco;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocalPartida() {
        return localPartida;
    }

    public void setLocalPartida(String localPartida) {
        this.localPartida = localPartida;
    }

    public String getLocalChedada() {
        return localChedada;
    }

    public void setLocalChedada(String localChedada) {
        this.localChedada = localChedada;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Passagem(){

    }

    @Override
    public String toString() {
        return "Passagem{" +
                "id=" + id +
                ", localPartida='" + localPartida + '\'' +
                ", localChedada='" + localChedada + '\'' +
                ", duracao='" + duracao + '\'' +
                ", preco=" + preco +
                '}';
    }
}
