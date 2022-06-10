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
public class BonusAssiduidade implements IMetodoDeBonus{
    
    @Override
    public void calculaBonus(Funcionario funcionario) {
        if(funcionario.getFalta() == 0)
            funcionario.setBonus(new Bonus("0 faltas ",1.10, LocalDate.now()));
        else if(funcionario.getFalta() == 1 || funcionario.getFalta() <= 3)
            funcionario.setBonus(new Bonus("Entre 1 a 3 faltas ",1.05, LocalDate.now()));
        else if(funcionario.getFalta()== 4 || funcionario.getFalta() == 5)
            funcionario.setBonus(new Bonus("Possui 4 ou 5 faltas",1.05, LocalDate.now()));
        else if(funcionario.getFalta()>= 6)
            funcionario.setBonus(new Bonus("Possui 6 faltas ou mais ",1.07, LocalDate.now()));
    }
        
}
