package com.doit.ThrowAble;

import java.io.FileNotFoundException;
/*
若父类方法没有异常,子类不能抛异常,真遇到了用 try catch
若父类方法抛了异常,子类方法可以抛出父类的异常或父类异常的子类异常
 */
public class FuzI {
    class Fu {
        public  void method  ()throws Exception{

        }
    }

    class  Zi extends Fu{
        @Override
        public void method() throws FileNotFoundException {

        }
    }
}
