package com.doit.ThrowAble;

import com.sun.org.glassfish.gmbal.GmbalException;
import com.sun.prism.impl.FactoryResetException;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
//throws FileNotFoundException,GmbalException
public class demo03 {
    public static void main(String[] args)  {

        try{
            ass(1);
        } catch (GmbalException g){

        }
        catch (FileNotFoundException e){

        }

    }
    public static void ass (int a) throws FileNotFoundException,GmbalException{
        if (a==0) {
            throw new FileNotFoundException("");

        }
        if (a==1) {
            throw new GmbalException("");
        }
    }
}
