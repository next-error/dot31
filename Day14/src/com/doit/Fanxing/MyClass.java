package com.doit.Fanxing;

public class MyClass<daniu> {
    private daniu age;

    public daniu getAge() {
        return age;
    }

    public void setAge(daniu age) {
        this.age = age;
    }

    public <dahuang>  dahuang method(dahuang dh, daniu nn){
        System.out.println(dh.getClass());
        return dh;
    }
}
