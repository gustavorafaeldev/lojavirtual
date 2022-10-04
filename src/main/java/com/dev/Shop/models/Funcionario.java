package com.dev.Shop.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

import java.util.Date;


@Entity
@Data
@Table(name = "funcionario")
public class Funcionario implements Serializable{
    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private double salarioBruto;
    @Temporal(TemporalType.DATE)
    private Date dataEntrada;
    @Temporal(TemporalType.DATE)
    private Date dataSaida;
    private String cargo;
    private String cidade;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String uf;
    private String cep;

}
