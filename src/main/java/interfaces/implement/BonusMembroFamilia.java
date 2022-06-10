/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.implement;

import interfaces.IMetodoDeBonus;
import java.time.LocalDate;
import model.Bonus;
import model.Funcionario;

/**
 *
 * @author Geovane
 */
public class BonusMembroFamilia implements IMetodoDeBonus{
    
    @Override
    public void calculaBonus(Funcionario funcionario) {
        if(funcionario.getQtdMembroFamilia() == 0)
            funcionario.setBonus(new Bonus("Você possui 0 familiares na residência ",1.00, LocalDate.now()));
        else if(funcionario.getQtdMembroFamilia() == 1)
            funcionario.setBonus(new Bonus("Você possui 1 familiar na residência ",1.01, LocalDate.now()));
        else if(funcionario.getQtdMembroFamilia() == 2)
            funcionario.setBonus(new Bonus("Você possui 2 familiares na residência ",1.02, LocalDate.now()));
        else if(funcionario.getQtdMembroFamilia() == 3)
            funcionario.setBonus(new Bonus("Você possui 3 familiares na residência ",1.03, LocalDate.now()));
        else if(funcionario.getQtdMembroFamilia() >= 4)
            funcionario.setBonus(new Bonus("Você possui 4 ou mais familiares na residência ",1.04, LocalDate.now()));
    }
    
}
