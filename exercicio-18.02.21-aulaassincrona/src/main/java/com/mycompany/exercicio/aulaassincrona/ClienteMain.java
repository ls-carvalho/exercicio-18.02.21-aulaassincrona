/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio.aulaassincrona;

/**
 *
 * @author The_Z
 */
public class ClienteMain {

    public static void main(String args[]) {
        try {
            Funcionario funcionario = new Funcionario("Diretor Geral");
            System.out.println(funcionario.solicitacao(16000));
        } catch (Exception e) {
            System.out.println("Erro(s):" + e.getMessage());
        }
    }
}
