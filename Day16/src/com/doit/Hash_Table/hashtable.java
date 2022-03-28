package com.doit.Hash_Table;

public class hashtable {
    /*
    哈希表:数组+链表结构
        扩容机制:
            1.7之前扩容机制:长度*加载因子,超过后再有一次哈希碰撞即扩容
            1.8之后,超过即扩容,或链表长度超过8单元素个数小于64; 长度超过8元素个数超过64链表部分会转为红黑树,此时删除一个不会立马转为链表,有一个过渡期
        构造方法可以定义它的长度和加载因子,其长度一定会是16的倍数
        linkedhashset:底层是链表+哈希表
     */
}
