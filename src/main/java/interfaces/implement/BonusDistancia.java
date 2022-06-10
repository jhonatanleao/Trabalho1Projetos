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
public class BonusDistancia implements IMetodoDeBonus{
    
    @Override
    public void calculaBonus(Funcionario funcionario) {
        if(funcionario.getDistanciaTrabalho() <= 15)
            funcionario.setBonus(new Bonus("Distância até 15km do local de trabalho ",1.01, LocalDate.now()));
        else if(funcionario.getDistanciaTrabalho() <= 30)
            funcionario.setBonus(new Bonus("Distância até 30km do local de trabalho ",1.03, LocalDate.now()));
        else if(funcionario.getDistanciaTrabalho() <= 50)
            funcionario.setBonus(new Bonus("Distância até 50km do local de trabalho ",1.05, LocalDate.now()));
        else if(funcionario.getDistanciaTrabalho()>50)
            funcionario.setBonus(new Bonus("Distância maior que 50km do local de trabalho ",1.07, LocalDate.now()));
    }
    
    
}
