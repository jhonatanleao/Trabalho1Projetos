/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CalculadoraSalario;

import model.Funcionario;

/**
 *
 * @author jhonatan
 */
public class CalculadoraSalarioService {
    
    public void calculaSalario(ICalculadoraSalario calculadora, Funcionario funcionario){
        calculadora.processarSalario(funcionario);
    }
}
