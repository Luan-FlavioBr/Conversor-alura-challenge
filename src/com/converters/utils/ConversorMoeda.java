package com.converters.utils;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import javax.swing.JOptionPane;

public class ConversorMoeda {
	
    String conversaoNome;
    String moedaDeOrigem;
    String moedaParaConversao;
    
    public ConversorMoeda(String moedaDeOrigem, String moedaParaConversao) {
    	this.conversaoNome = moedaDeOrigem+moedaParaConversao;
    	this.moedaDeOrigem = moedaDeOrigem;
    	this.moedaParaConversao = moedaParaConversao;
    }
    
    
    public double getValorDaConversao() {
        if(moedaDeOrigem.equals(moedaParaConversao)){
            JOptionPane.showMessageDialog(null, "Erro! Escolha moedas diferentes!", "Moeda iguais!", JOptionPane.ERROR_MESSAGE);
            return 0;
        } else {
            ClientHttp clientHttp = new ClientHttp();
            // Retorna JSON com 
            String data = clientHttp.getData("https://economia.awesomeapi.com.br/last/"+moedaDeOrigem+"-"+moedaParaConversao);

            Gson gson = new Gson();
            JsonObject json = gson.fromJson(data, JsonObject.class); // Converte o JSON para obejto JSONobj

            JsonObject usdBrl = json.getAsJsonObject(conversaoNome);

            // Pega o valor da conversão
            JsonElement valorReal = usdBrl.get("ask");

            // Transforma o JSONElement em double
            double valorDaConversao = valorReal.getAsDouble();
        
            return valorDaConversao;
	}
    }	
}
