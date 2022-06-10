/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.trabalhoprojeto;

import dao.LogDao;
import dto.LogDTO;
import log.GerenciaLogService;
import log.model.Log;

public class TrabalhoProjeto {

    public static void main(String[] args) {
        LogDao logDao = new LogDao();
        LogDTO logDto = new LogDTO();
        logDto = logDao.read();
        
        int logType = logDto.getLogType();
        GerenciaLogService log = new GerenciaLogService(logType);
        
        
        
        log.alteraTipoPersistencia();
        //log.escreveArquivo();
    }
}
