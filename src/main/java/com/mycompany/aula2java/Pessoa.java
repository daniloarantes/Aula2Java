/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aula2java;

/**
 *
 * @author danilo
 */
public class Pessoa {

    String nome;
    int idade;
    String escola;

    public String caixaAlta() {
        return nome.toUpperCase();
    }

    public void exibeIdade() {
        System.out.println(idade + " anos");
    }
}
