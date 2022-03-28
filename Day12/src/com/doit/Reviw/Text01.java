package com.doit.Reviw;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Text01 {
    public static void main(String[] args) throws ParseException {
        /*
        StringBufer append toString
        date get...返回毫秒数 直接打印date对象,返回当前时间日期
        dateformate Date类型与String类型转换 创建对象用它的子类实现 formate:yyyy-MM-dd E ; paste:字符串转为Date
        Clender Clendter.in 创建对象, set方法 add方法 gettime方法转换为Date类型
        System 两个静态方法:返回当前系统时间的毫秒值;  数组复制
        Arr 两个方法:
        Buboble 冒泡排序简易代码实现
        二分法 简易代码实现
        数组方法类: sort排序(从小到大,字母排序为首字母的ASCII值)  toString,  二分查找(注意先要排序):如果字符数组查找字符串呢?
         */
        //append:可以添加任何类型的数据,最后都toString即可
        //System.out.println(new StringBuilder("abc").append('号').append(new int[3]).append(new Object()).append(123).toString());

        //Date getTime 方法,返回一个long类型的数字,若想改变时间,需要用字符串转换
        Date date =new Date();
        System.out.println(date);//Mon Mar 07 19:09:52 CST 2022
        long t1 = date.getTime();
        System.out.println(t1);//1646651455831
        boolean b =date.after(new Date());
        System.out.println(b);
        //DateFormat 类,创建子类对象调佣方法, format方法将Date日期转化为String, parse方法将String转化为date类型,这个类就像一个中介
        DateFormat dateFormat =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");//抽象方法,通过子类调用其方法 构造方法要带上时间格式
        String s= dateFormat.format(date);
        System.out.println(s);//2022-03-07 19:20:14 星期一--->2022-03-07 19:22:34 星期一
        Date date1 = dateFormat.parse(s);
        System.out.println(date1);//Mon Mar 07 19:22:34 CST 2022

        //Calender 抽象类,getInstance 是其静态方法,类名直接调用
        //注意: 西方的月是0-11,周日为每周第一天
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);//直接打印老多内容了:java.util.GregorianCalendar[time=1646652871350,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Shanghai",offset=28800000,dstSavings=0,useDaylight=false,transitions=19,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=2,DAY_OF_MONTH=7,DAY_OF_YEAR=66,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=7,HOUR_OF_DAY=19,MINUTE=34,SECOND=31,MILLISECOND=350,ZONE_OFFSET=28800000,DST_OFFSET=0]
        // get方法,获取日历的中想要的信息,返回int类型数字,参数为int类型,传入Calender的静态常量即可
        int year= calendar.get(Calendar.YEAR);
        System.out.println(year);//2022
        //set 方法,设置时间,若满了会自动往上进一位,比如输入1月32号,打印出来是2月1号
        calendar.set(2000,0,1,13,33,54);
        int m = calendar.get(Calendar.MONTH);
        System.out.println(m);//0
        //add 方法,对Calender对象所指定的时间的加减运算,这里不见得是当前系统时间,因为可以用set或add修改
        calendar.add(Calendar.MONTH,-1);
        System.out.println(calendar.get(Calendar.YEAR));//1999
        System.out.println(calendar.get(Calendar.MONTH));//11
        System.out.println(m);//0 这里打印的还是上面的m
        //getTime方法,将日历Calender类型转化为Date类型
        System.out.println(calendar.getTime());
        //获取毫秒数 这里打印的不是当前时间的了,因为上面对calendar做了修改
        System.out.println(calendar.getTimeInMillis());//944026434914
        System.out.println(Calendar.getInstance().getTimeInMillis());//1646653859914

        //System final修饰.直接类名使用
        //currentTimeMillis 返回当前系统时间的毫秒数
        long l = System.currentTimeMillis();
        System.out.println(l);
        //arraycopy:复制数组 数组删除或插入元素小练习
        //向数组中插入一个元素 集合的add操作原理,集合不能存入基本类型数据,因为基本类型没有默认值null,无法向后扩展
        //思路:待插入索引后的元素全部向后移动一位,然后把index处元素修改即可
        int[] list ={12,113,1,4,5,0,0,0,0,0};
        int size =5;
        int a =34;//待插入元素
        int index = 3; //待插入位置
        int move = size-index;
        System.arraycopy(list,index,list,index+1,move);
       /* for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);//这时新数组有两个旧数组的3索引元素
        }*/
        list[index]=a;
        size++;
        for (int i = 0; i < size; i++) {
            System.out.println(list[i]);
        }

    //数组删除一个元素

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        //冒泡排序
/*        int [] list1 = {2,5,6,4,1,4,6,8,42,54,56,112};
        for (int i = 0; i < list1.length-1; i++) {
            for (int j = 0; j <list1.length-1-i ; j++) {
                if (list1[j]>list1[j+1]) {
                    int bmp =list1[j];
                    list1[j]=list1[j+1];
                    list1[j+1]=bmp;
                }
            }
        }
        for (int i = 0; i < list1.length; i++) {
            System.out.println(list1[i]);
        }*/
        //二分法排序

        //Arrays类:所有方法静态
        //sort排序默认从小到大,底层使用的是快速排序法
        int[] list3 = {2,5,6,4,1,4,6,8,42,54,56,112};
        Arrays.sort(list3);
        for (int i = 0; i < list3.length; i++) {
            System.out.println(list3[i]);
        }
        String [] list5 ={"aa", "vv", "ab", "Axz", "gdd", "kjj"};
        //Arrays.sort(list5);
        for (int i = 0; i < list5.length; i++) {
            System.out.println(list5[i]);
        }
        //二分查找必须先排序!!!
        int aa =Arrays.binarySearch(list5,"Axz");
        System.out.println(aa);//1

    }
}
