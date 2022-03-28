package com.doit.Map;

import javafx.beans.property.MapPropertyBase;
import javafx.beans.property.Property;

/*
Properties:

 */
import java.util.Properties;
import java.util.Set;

public class myPROPERT {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.setProperty("adc","12");
        p.setProperty("arr","33");
        System.out.println(p);
        Set<String> set = p.stringPropertyNames();
        for (String s :set){
            System.out.println(s+" "+p.getProperty(s));
        }
    }
}
