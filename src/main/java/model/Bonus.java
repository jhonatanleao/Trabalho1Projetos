/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Geovane
 */
public class Bonus {
    private String Nome;
    private double Valor;
    private LocalDate Data;

    public Bonus(String Nome, double Valor, LocalDate Data) {
        this.Nome = Nome;
        this.Valor = Valor;
        this.Data = Data;
    }

    public String getNome() {
        return Nome;
    }

    public double getValor() {
        return Valor;
    }
    
    public LocalDate getData() {
        return Data;
    }
    
    @Override
    public String toString() {
        return ("O tipo de bônus é: " + Nome + " | O seu valor é: " + Valor + " | A data deste cálculo efetuado é: " + Data );
    }
}
