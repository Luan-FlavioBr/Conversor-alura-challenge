/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package br.com.challenge.conversor.moeda;

/**
 *
 * @author Luan Flavio
 */
public enum SiglaMoeda {
    
    BRL ("Real Brasileiro", "BRL"),
    USD ("Dólar Americano", "USD"),
    EUR ("Euro", "EUR"),
    GBP ("Libra Esterlina", "GBP"),
    JPY ("Iene Japonês", "JPY"),
    KRW ("Won Coreano", "KRW"),
    AUD ("Dólar Australiano", "AUD"),
    CAD ("Dólar Canadense", "CAD"),
    CHF ("Franco Suíço", "CHF"),
    CNY ("Yuan Chinês", "CNY"),
    SEK ("Coroa Sueca", "SEK"),
    RUB ("Rublo Russo", "RUB"),
    INR ("Rúpia Indiana", "INR"),
    MXN ("Peso Mexicano", "MXN"),
    SGD ("Dólar de Singapura", "SGD");
    
    private String nomeMoeda;
    private String siglaMoeda; 

        
    SiglaMoeda(String nomeMoeda, String siglaMoeda){
        this.nomeMoeda = nomeMoeda;
        this.siglaMoeda = siglaMoeda;
    }
    
    public String getNomeMoeda(){
        return this.nomeMoeda;
    }

    public String getSiglaMoeda() {
        return this.siglaMoeda;
    }   
    
}
