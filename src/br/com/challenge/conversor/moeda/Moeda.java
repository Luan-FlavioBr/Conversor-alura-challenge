package br.com.challenge.conversor.moeda;

import javax.swing.JOptionPane;
import com.converters.utils.ConversorMoeda;

public class Moeda {

    private String moedaDeOrigem;
    private String moedaParaConversao;

    public Moeda(String moedaDeOrigem, String moedaParaConversao) {
        this.moedaDeOrigem = moedaDeOrigem;
        this.moedaParaConversao = moedaParaConversao;
    }
	
    public double converterMoeda(String valorS) {
        double valor = 0.0;
        ConversorMoeda conversor = new ConversorMoeda(this.moedaDeOrigem, this.moedaParaConversao);
        try {
            valorS = valorS.replace(".","").replace(",", ".");
            valor = Double.parseDouble(valorS);
        } catch(NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Você cancelou a converção :(", "Conversão Cancelada", JOptionPane.ERROR_MESSAGE);
            return -1;
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Insira um número válido", "Número Inválido", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
        return valor * conversor.getValorDaConversao();

    }
}
