/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.trabalhoprojeto;

import CalculaBonusChain.CalculaBonus;
import dao.LogDao;
import dto.LogDTO;
import java.util.ArrayList;
import log.GerenciaLogService;
import log.model.Log;
import model.Bonus;
import model.Funcionario;

public class TrabalhoProjeto {

    public static void main(String[] args) {
        //LogDao logDao = new LogDao();
        //LogDTO logDto = new LogDTO();
        //logDto = logDao.read();
        
        //int logType = logDto.getLogType();
        //GerenciaLogService log = new GerenciaLogService(logType);
        
        
        
        //log.alteraTipoPersistencia();
        //log.escreveArquivo();
        
        Funcionario funcionario = new Funcionario("Jose", 22, 0, 1280, "Programador", 2, 10, 3, 10, 0);
        
        CalculaBonus chainBonus = new CalculaBonus();
        chainBonus.calculaBonus(funcionario, "Bonus Generoso");
        
        ArrayList<Bonus> listBonus = funcionario.getBonus();
        
        for(Bonus bonus : listBonus){
            System.out.println(bonus);
        }
        
        System.out.println(funcionario.getSalario() + " " + funcionario.getValorTotalBonus());
        
    }
}
