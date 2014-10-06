package br.com.controleconvidados.utils;

import org.brazilutils.br.cpfcnpj.Cnpj;
import org.brazilutils.br.cpfcnpj.Cpf;

public class ValidarCPF {

    public static void main(String[]args){
        
        System.out.println(
        Cpf.isValid("085.142.496-14") + "" + 
        Cnpj.isValid("77.832.433/0001-38"));
    }
}
