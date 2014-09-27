package br.com.controleconvidados.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesLoader {

    private Properties props;

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

    public  String getValue(String key) {
        return (String) props.getProperty(key);
    }

}
