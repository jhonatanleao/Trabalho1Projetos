/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package log.model;

import log.interfaces.ILog;

/**
 *
 * @author jhonatan
 */
public class Log implements ILog {
    private String logInfo;

    @Override
    public String getLogInfo() {
        return logInfo;
    }
    
    public Log(String nome) {
        this.logInfo = nome;
    }      
}
