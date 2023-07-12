package br.com.challenge.conversor.temperatura;

import java.util.Optional;

import javax.swing.JOptionPane;

    public class ConversorTemperatura {
        public Optional<Double> verificaValor(String valorS) {
        double valor;
        try {
            valorS = valorS.replace(",", ".");
            valor = Double.parseDouble(valorS);
        } catch(NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Você cancelou a converção :(", "Conversão Cancelada", JOptionPane.ERROR_MESSAGE);
            return Optional.empty();
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null, "Insira um número válido", "Número Inválido", JOptionPane.ERROR_MESSAGE);
            return Optional.empty();
        }
        return Optional.of(valor);
    }
	
	
    public double converterTemperatura(double valor, String unidadeOrigem, String unidadeDestino) {
        switch (unidadeOrigem) {
            case "C":
                if(unidadeDestino.equals("K")) {
                    return valor + 273.15;
                } else if(unidadeDestino.equals("F")) {
                    return valor * 9/5 + 32;
                } else if(unidadeDestino.equals(unidadeOrigem)){
                    return valor;
                }   break;
            case "K":
                if(unidadeDestino.equals("C")) {
                    return valor - 273.15;
                } else if(unidadeDestino.equals("F")) {
                    return (valor - 273.15) * 9/5 + 32;
                } else if(unidadeDestino.equals(unidadeOrigem)){
                    return valor;
                } break;
            case "F":
                if(unidadeDestino.equals("C")) {
                    return (valor - 32) * 5/9;
                } else if(unidadeDestino.equals("K")) {
                    return (valor - 32) * 5/9 + 273.15;
                } else if(unidadeDestino.equals(unidadeOrigem)){
                    return valor;
                }   
                break;
            default:
                break;
        }
        return 0;
    }
}
