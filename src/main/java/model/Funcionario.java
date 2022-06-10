/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Geovane
 */
public class Funcionario {
    private String Nome;
    private int Idade;
    private double Salario;
    private double SalarioBase;
    private String Cargo;
    private int Falta;
    private int TempoServico;
    private int QtdMembroFamilia;
    private double DistanciaTrabalho;
    private double ValorTotalBonus;
    public Bonus bonus;

    public Funcionario(String Nome, int Idade, double Salario, double SalarioBase, String Cargo, int Falta, int TempoServico, int QtdMembroFamilia, double DistanciaTrabalho, double ValorTotalBonus) {
        this.Nome = Nome;
        this.Idade = Idade;
        this.Salario = Salario;
        this.SalarioBase = SalarioBase;
        this.Cargo = Cargo;
        this.Falta = Falta;
        this.TempoServico = TempoServico;
        this.QtdMembroFamilia = QtdMembroFamilia;
        this.DistanciaTrabalho = DistanciaTrabalho;
        this.ValorTotalBonus = ValorTotalBonus;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public void setSalarioBase(double SalarioBase) {
        this.SalarioBase = SalarioBase;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public int getFalta() {
        return Falta;
    }

    public void setFalta(int Falta) {
        this.Falta = Falta;
    }

    public int getTempoServico() {
        return TempoServico;
    }

    public void setTempoServico(int TempoServico) {
        this.TempoServico = TempoServico;
    }

    public int getQtdMembroFamilia() {
        return QtdMembroFamilia;
    }

    public void setQtdMembroFamilia(int QtdMembroFamilia) {
        this.QtdMembroFamilia = QtdMembroFamilia;
    }

    public double getDistanciaTrabalho() {
        return DistanciaTrabalho;
    }

    public void setDistanciaTrabalho(double DistanciaTrabalho) {
        this.DistanciaTrabalho = DistanciaTrabalho;
    }

    public double getValorTotalBonus() {
        return ValorTotalBonus;
    }

    public void setValorTotalBonus(double ValorTotalBonus) {
        this.ValorTotalBonus = ValorTotalBonus;
    }
    
    public Bonus getBonus() {
        return bonus;
    }

    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }

}
