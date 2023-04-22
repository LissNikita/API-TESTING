package utils;

import java.io.*;
import java.util.NoSuchElementException;
import java.util.Properties;

public class PropertyReader {

    public static String getPropertyValue(String propertyName, String filePath){
        Properties properties = new Properties();
        String textExeption = "This element not found";
        try {
            InputStream inputStream = new FileInputStream(filePath);
            properties.load(inputStream);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
       if(properties.getProperty(propertyName) != null){
            return properties.getProperty(propertyName);
        }else {
            throw new NoSuchElementException(propertyName + " is not found");
        }
    }
}
