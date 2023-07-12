package br.com.challenge.conversor.massa;

import java.util.Optional;
import javax.swing.JOptionPane;

public class ConversorMassas {
    public Optional<Double> verificaValor(String valorS){
        double valor;
        try {
            valorS = valorS.replace(".","").replace(",", ".");
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
    
    public double converteMassa(double valor, String unidadeOrigem, String unidadeDestino){
        double valorConversao = valor / SiglaMassas.getValorByNome(unidadeOrigem);
        return valorConversao * SiglaMassas.getValorByNome(unidadeDestino);
    }
}

