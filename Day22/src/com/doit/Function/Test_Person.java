package com.doit.Function;

import java.util.function.Function;
import java.util.function.Supplier;

public class Test_Person {
    public static void main(String[] args) {
        //标准格式
    method("张三",(s -> {
        return new Person(s);
    }));
        //省略格式
        method("李四",s -> new Person(s));
        method("王五",s -> new Person());//Person{name='null'}
        //极简
        method("赵六",Person::new);

        //空参构造
        method2(()->{
            return new Person();
        });
        method2(()-> new Person());
        method2(Person::new);
    }
    public static void method(String s, Function<String,Person> f){
        Person p = f.apply(s);
        System.out.println(p);
    }
    //空参构造
    public static  void method2(Supplier<Person> su){
        Person p = su.get();
        System.out.println(p);
    }
}
