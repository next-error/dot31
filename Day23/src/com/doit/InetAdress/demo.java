package com.doit.InetAdress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class demo {
    /*
    java.net.InetAddress
    静态方法创建对象: static InetAddress getLocalHost :返回本地主机的ip地址对象
    方法:
     */
    public static void main(String[] args) throws UnknownHostException {
        //获取本机的ip对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        String hostAddress = localHost.getHostAddress();
        System.out.println(hostAddress);
        String hostName = localHost.getHostName();
        System.out.println(hostName);
        System.out.println("-------------------------------");
        //获取其他主机的ip地址对象
        InetAddress byName = InetAddress.getByName("114.114.114.114");//可以传入网址 ip 主机名
        System.out.println(byName.getHostName());
        System.out.println(byName.getHostAddress());
        String canonicalHostName = byName.getCanonicalHostName();
        System.out.println(canonicalHostName);
    }
}
