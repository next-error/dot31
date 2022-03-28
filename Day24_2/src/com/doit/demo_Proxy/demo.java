package com.doit.demo_Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
@SuppressWarnings("all")
public class demo {

    /*
    接口的动态代理:
    Proxy:提供用于创建动态代理类和实例的静态方法，它还是由这些方法创建的所有动态代理类的超类。
    方法:static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
            ClassLoader loader: 代理对象的字节码文件加载器,(对象.getClass.getClassLoader()) 或类名.class.getClassLoader()
            Class<?>[] interfaces: 代理对象的所有接口, (对象.getClass.getInterfaces()) 或类名.class.getInterfaces()
            InvocationHandler h: 接口
                重写方法: Object invoke(Object proxy, Method method, Object[] args)
                    在代理实例上处理方法调用并返回结果
                    proxy - 在其上调用方法的代理实例
                    method - 对应于在代理实例上调用的接口方法的 Method 实例
                    args - 包含传入代理实例上方法调用的参数值的对象数组，如果接口方法不使用参数，则为 null
     */
    public static void main(String[] args) {

//创建一个ArrayList的代理,不可以使用add和remove,但可以get 和set
    ArrayList<String> list = new ArrayList<>();
    list.add("aaa");
    list.add("bbb");

        List prolist = proArrayList(list);
        prolist.add("ccc");
        System.out.println(prolist.get(0));

    }
    public static List<String> proArrayList (List<String> list){

        List<String> prolist = (List<String>) Proxy.newProxyInstance(list.getClass().getClassLoader(), list.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if (method.getName().equals("add")) {
                            System.out.println("不允许add");
                        }
                        if (method.getName().equals("remove")) {
                            System.out.println("不允许remove");
                        }
                        //有的方法有返回值,有的没有,需要写一个返回值,当调用方法没有返回值值它为null
                        Object obj = method.invoke(list, args);//对象调用方法,对象.方法; 这里list是对象,args是方法参数
                        return obj;
                    }
                });
        return prolist;
    }


}
