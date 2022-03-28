package com.doit.Reviw;

import java.util.Arrays;
import java.util.Iterator;
//首先写了Iterator,继承Iterable才不会报错
public class MyArraylist<E> implements Iterable<E>{
   private int size;
    private Object [] arr ;
    private Object [] NULL_ARR={};

    public MyArraylist() {
        arr =NULL_ARR;
    }
    public boolean add(E key){
        //集合没有元素时,默认给集合扩容为10
        if (arr.length==0) {

            arr=new Object[10];
        }
        //当集合长度超过时,给集合扩容
        grow();
        arr[size++]=key;
        return true;
    }
    //remove
    public Object remove (int index){
        //判断索引是否越界
        outOfIndex(index);
        Object arr_index =arr[index];
        int move_Num = size-index-1;
        System.arraycopy(arr,index+1,arr,index,move_Num);
        arr[--size]=null;
        return arr_index;
    }

    //插入add
    public boolean add (int index , E keyValue){
        outOfIndex(index);
        if (arr.length==0) {
            arr=new Object[10];
        }
        int move_Num =size-index;
        System.arraycopy(arr,index,arr,index+1,move_Num);
        arr[index]=keyValue;
        size++;
        return true;


    }
    //改:set,并返回修改前该索引的元素
    public Object set (int index,E keyValue){
        outOfIndex(index);
        Object arr_Index=arr[index];
        arr[index]=keyValue;
        return arr_Index;
    }

    //迭代器

    //扩容
    public void grow(){
        if (arr.length==size) {
            int old = arr.length;
            int new_arr =old+(old>>1);//注意:这里要括起来!
            //size = arr.length+(arr.length>>1);//这个不行,因为下面添加元素用到了size
            arr=Arrays.copyOf(arr,new_arr);
            //arr=Arrays.copyOf(arr,size);
        }
    }
    //索引越界异常
    public void outOfIndex(int index){
        if (index> size) {
            throw new IndexOutOfBoundsException("索引越界"+index);
        }

    }

    @Override
    public String toString (){
    StringBuffer str =new StringBuffer();
    str.append("[");
        for (int i = 0; i < arr.length; i++) {
            str.append(arr[i]);
            if (i==arr.length-1) {
                str.append("]");
            }else {
                str.append(",");
            }
        }
        return str.toString();
    }

    //判断是否为空
    public boolean isEmpty(){
/*        if(size==0){
            return true;
        }
        return false;*/
        return size==0;
    }

//没写出来
public Iterator<E> iterator(){
        return new inner();
}

    private class inner implements Iterator{
        int cursor=0;
        @Override
        public boolean hasNext() {
            return size !=cursor;
        }

        @Override
        public E next() {
            int i=cursor;
            cursor++;
            return (E)arr[i];
        }
    }
}
