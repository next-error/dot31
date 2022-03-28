package com.doit.Copy;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IO_Tools {
    public static void shutdown(InputStream in, OutputStream out){
        try {
            if (in!=null) {
                in.close();
            }
        }
        catch ( IOException e)
        {
            e.printStackTrace();
        }

        try {
            if (out!=null) {
                out.close();
            }
        }
        catch ( IOException e)
        {
            e.printStackTrace();
        }
    }
}
