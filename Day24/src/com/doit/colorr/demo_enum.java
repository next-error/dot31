package com.doit.colorr;

public enum demo_enum {
    red,green("绿色");
    private String name;

    demo_enum() {
    }

    demo_enum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

/*    @Override
    public String toString() {
        return "demo_enum{" +
                "name='" + name + '\'' +
                '}';
    }*/
}
