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
public class BonusGeneroso implements IMetodoDeBonus{
    
    @Override
    public void calculaBonus(Funcionario funcionario) {
        funcionario.setBonus(new Bonus("Generoso", 1.01, LocalDate.now() ));
    }
}
