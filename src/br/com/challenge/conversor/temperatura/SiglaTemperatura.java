/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.com.challenge.conversor.temperatura;

/**
 *
 * @author Luan Flavio
 */
public enum SiglaTemperatura {
    CELSIUS("Celcius","C"),
    KELVIN("Kelvin","K"),
    FAHRENHEIT("Fahrenheit","F");
    
    private String nomeUnidade;
    private String siglaUnidade;

    SiglaTemperatura(String nomeUnidade, String siglaUnidade) {
        this.nomeUnidade = nomeUnidade;
        this.siglaUnidade = siglaUnidade;
    }

    public String getNomeUnidade() {
        return this.nomeUnidade;
    }

    public String getSiglaUnidade() {
        return this.siglaUnidade;
    }
    
    public static String getSiglaByNome(String nome){
        for(SiglaTemperatura sigla : values()){
            if(sigla.getNomeUnidade().equalsIgnoreCase(nome)){
                return sigla.siglaUnidade;
            }
        }
        return null;
    }
    
    
    
    
}
