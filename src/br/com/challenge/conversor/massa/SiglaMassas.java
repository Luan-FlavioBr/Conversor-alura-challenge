package br.com.challenge.conversor.massa;

import br.com.challenge.conversor.temperatura.SiglaTemperatura;
import static br.com.challenge.conversor.temperatura.SiglaTemperatura.values;

public enum SiglaMassas {
    KG("Quilograma", "Kg", 0.001),
    HG("Hectograma", "Hg", 0.01),
    DAG("Decagrama", "Dag",0.1),
    G("Grama", "g",1),
    DG("Decigrama", "Dg",10),
    CG("Centigrama", "Cg",100),
    MG("Miligrama", "Mg",1000);

    private String nomeUnidade;
    private String siglaUnidade;
    private double valorUnidade;
    
    SiglaMassas(String nomeUnidade, String siglaUnidade, double valorUnidade){
        this.nomeUnidade = nomeUnidade;
        this.siglaUnidade = siglaUnidade;
        this.valorUnidade = valorUnidade;
    }

    public String getNomeUnidade() {
        return nomeUnidade;
    }

    public String getSiglaUnidade() {
        return siglaUnidade;
    }

    public double getValorUnidade() {
        return valorUnidade;
    }
        
    public static String getSiglaByNome(String nome){
        for(SiglaMassas sigla : values()){
            if(sigla.getNomeUnidade().equalsIgnoreCase(nome)){
                return sigla.siglaUnidade;
            }
        }
        return null;
    }
    
    public static Double getValorByNome(String nome){
        for(SiglaMassas sigla : values()){
            if(sigla.getNomeUnidade().equalsIgnoreCase(nome)){
                return sigla.valorUnidade;
            }
        }
        return null;
    }
}
