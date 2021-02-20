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
public class Funcionario {

    private String cargo;

    public Funcionario(String nomeCargo) {
        this.cargo = nomeCargo;
    }

    public boolean solicitacao(double valor) {
        switch (this.cargo) {
            case "Gerente Imediato":
                if (valor >= 0 && valor <= 500) {
                    return true;
                }
                break;
            case "Gerente Geral":
                if (valor >= 0 && valor <= 1500) {
                    return true;
                }
                System.out.println("Requer o cargo de Gerente Geral.");
                break;
            case "Diretor Financeiro":
                if (valor > 0 && valor <= 5000) {
                    return true;
                }
                System.out.println("Requer o cargo de Diretor Financeiro.");
                break;
            case "Diretor Geral":
                if (valor > 0 && valor <= 15000) {
                    return true;
                }
                System.out.println("Requer o cargo de Diretor Geral.");
                break;
            default:
                return false;
        }
        return false;
    }
}
