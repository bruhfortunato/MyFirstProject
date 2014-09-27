package br.com.controleconvidados.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Classe respons�vel por carregar um arquivo de properties.
 * 
 * @author  - 
 * @version 1.0
 */
public class PropertiesLoader {

    private Properties props;

    /**
     * Construtor.
     * 
     * @param filePath {@link String}.
     */
    public PropertiesLoader(String filePath) {
        props = new Properties();
        InputStream in = this.getClass().getResourceAsStream(filePath);
        try {
            props.load(in);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @author
     * Retorna o valor da variavel
     *         setada no arquivo de properties de acordo com sua chave.
     * @param key {@link String}
     * @return {@link String}
     */
    public  String getValue(String key) {
        return (String) props.getProperty(key);
    }

}
