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
public class BonusTempoServico implements IMetodoDeBonus {
    
    @Override
    public void calculaBonus(Funcionario funcionario) {
        if(funcionario.getTempoServico() == 0)
            funcionario.setBonus(new Bonus("Menos de 1 ano de serviço na respectiva empresa ",1.00, LocalDate.now()));
        else if(funcionario.getTempoServico() == 1 || funcionario.getTempoServico() <= 5)
            funcionario.setBonus(new Bonus("Entre 1 a 5 anos de serviço na respectiva empresa ",1.02, LocalDate.now()));
        else if(funcionario.getTempoServico()== 6 || funcionario.getTempoServico() <= 10)
            funcionario.setBonus(new Bonus("Entre 6 a 10 anos de serviço na respectiva empresa ",1.03, LocalDate.now()));
        else if(funcionario.getTempoServico() == 11 || funcionario.getTempoServico() <= 15)
            funcionario.setBonus(new Bonus("Entre 11 a 15 anos de serviço na respectiva empresa ",1.08, LocalDate.now()));
        else if(funcionario.getTempoServico()== 16 || funcionario.getTempoServico() <= 20)
            funcionario.setBonus(new Bonus("Possui 16 a 20 anos de serviço na respectiva empresa",1.10, LocalDate.now()));
        else if(funcionario.getTempoServico() > 6)
            funcionario.setBonus(new Bonus("Possui mais de 20 anos de serviço na respectiva empresa, parabéns ",1.15, LocalDate.now()));
    }
    
}