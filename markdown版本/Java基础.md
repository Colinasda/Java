[TOC]

## Java语言概述

### Java语言发展历史

1996年，JDK 1.0

2004年，发布里程碑式版本：JDK 1.5，为突出重要性，更名为**JDK 5.0**

2009年，Oracle公司收购SUN

2011年，JDK 7.0

2014年，**JDK 8.0**，是继JDK 5.0以来变化最大的版本



### Java技术体系平台

Java SE(Java Standard Edition)

标准版，Java核心API

Java EE(Java Enterprise Edition)

企业版，Web应用开发，包含Servlet，Jsp等

Java ME(Java Micro Edition)

小型版，移动终端



### Java语言的特点

1 面向对象

* 两个基本概念：类、对象
* 三大特性：封装、继承、多态

2 健壮性

去掉指针、内存的申请与释放等，提供一个相对安全的内存管理和访问机制

3 跨平台性

在操作系统上安装Java虚拟机(Java Virtual Machine)，由**JVM**来负责Java程序在该系统中的运行



### JDK & JRE & JVM

* JDK = JRE + 开发工具集（eg. Javac编译工具等）
* JRE = JVM + Java SE 标准类库



### Java代码的运行步骤

1 将Java代码编写到拓展名为.java的文件中

2 通过javac命令对该java文件**编译**，得到拓展名为.class的字节码文件

3 通过java命令对class文件运行，得到结果



### 注释（Comment）

```java
//这是单行注释

/*
这是多行注释
这是多行注释
这是多行注释
...
*/

/**
文档注释，可以用javadoc解析，生成一套以网页文件形式的说明文档
命令行：javadoc -d setName -author -version javaFileName
@author arron
@version v1.0
*/
```



## Java基本语法

### 关键字 & 保留字 & 标志符

关键字(Keyword)：class、interface、int、float、if、switch等

保留字(Reserved word)：现有Java版本未使用，以后可能使用，例如goto、const等

标志符(Identifier)：由英文字母，数字，_ ，$ 组成，其中数字不可以作为开头



### 命名规范(Naming Notations)

包名：xxxyyyzzz

类名、接口名：XxxYyyZzz

变量名、方法名：xxxYyyZzz

常量名：XXX_YYY_ZZZ



### 变量的使用

#### 按数据类型分类

> 1 byte = 8 bit，表示数范围 -128～127
>
> 声明long类型整数变量，必须以"l"或"L"结尾
>
> 定义float类型浮点变量，必须以"f"或"F"结尾
>
> 通常，定义整型变量用int，定义浮点型变量用double

1 基本数据类型

* 数值型：byte(1 byte)、short(2)、int(4)、long(8)、float(4)、double(8)

* 字符型：char(2)

* 布尔型：boolean(1 bit)

> char定义必须使用单引号
>
> 换行符：\n
>
> 制表符：\t
>
> 引号：\\"
>
> boolean只能取true、false

2 引用数据类型

*  类（class）
* 接口（interface）
* 数组（array）



#### 基本数据类型之间的运算规则

1 自动类型提升

byte，short，char->int->long->float->double

当byte，short，char三种类型变量运算时，结果为int

整型变量，默认为int

浮点型变量，默认为double

2 强制类型转换

自动类型提升的逆运算（大容量->小容量）

```java
//强转符()
double d = 12.9;
int i = (int)d;//12
```

可能导致精度损失



#### 按声明位置分类

1 成员变量（类内，方法体外）

* 实例变量：不以static修饰
* 类变量：以static修饰

2 局部变量（方法体内）

* 形参（方法，构造器中定义）
* 方法局部变量
* 代码块局部变量

 

#### String类型变量

1 String属于引用数据类型

2 有String类型的'+'代表**连接**

3 没有String类型的'+'代表**加法**

>String定义必须使用双引号
>
>ASCII 码： 
>
>A = 65
>
>a = 97



### 进制

二进制（binary）：以0B或0b开头

八进制（octal）：以0开头

十进制（decimal）

十六进制（hex）：以0X或0x开头



### 原码 & 反码 & 移码

* 对于正数，原码、反码、补码相同

* 对于负数，

-14的原码：10001110

-14的补码：11110001（符号位不变，取反）

-14的移码：11110010（反码+1）

> 计算机底层以补码的方式来存储数据



### 运算符

算术运算符：+  -  *  /  %  ++  --

赋值运算符：=  +=  -=  *=  /=  %=

比较运算符：==  !=  <  >  <=  >=  instanceof

逻辑运算符：&逻辑与  |  !  ^  &&短路与  ||

> 两边均为boolean
>
> 左边为false，&继续执行右边，&&不执行
>
> 左边为true，｜继续执行右边，||不执行
>
> 所以推荐使用&&和||

位运算符：<<  >>  >>>(无符号右移)  &  |  ^  ~

三元运算符：(条件表达式) ? 表达式1 : 表达式2



### 程序流程控制

* 顺序结构
* 分支结构：if-else if-else、switch-case
* 循环结构：while、do-while、for

```java
//输出10000以内的质数
public class PrimeNumber {
    public static void main(String[] args) {
        boolean isFlag = true;

        long startTime = System.currentTimeMillis();

        for(int i = 2;i < 10000;i++){
            for(int j = 2;j <= Math.sqrt(i);j++){
                if(i % j == 0){
                    isFlag = false;
                    break;
                }
            }
            if(isFlag == true){
                System.out.println("The Prime Number is: " + i);
            }else{
                isFlag = true;
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time consuming: " + (endTime - startTime) + "ms");
    }
}
```





### Scanner类的使用

```java
import java.util.Scanner;

class ScannerTest{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int num = scanner.nextInt();
    System.out.println(num);
  }
} 
```



### 数组

#### 一维数组

```java
//一维数组的声明
int[] array1;
//静态初始化
array1 = new int[]{1,2,3,4};
//动态初始化
String[] names = new String[5];
//获取数组的长度
System.out.println（names.length);
//遍历数组
for(int i = 0;i < names.length;i++){
  System.out.println(names[i]);
}
```

默认初始化值：

* 数组元素是整型：0
* 数组元素是浮点型：0.0
* 数组元素是char型：0或'\u0000'
* 数组元素是boolean型：false
* 数组元素是引用数据类型：null



#### 二维数组

```java
//二维数组的声明
int[][] arr1;
//静态初始化
arr1 = new int[][]{{1,2,3},{4},{5,6}};
//动态初始化1
String[][] arr2 = new String[3][2];
//动态初始化2
String[][] arr3 = new String[3][];
//获取数组的长度
System.out.println（arr2.length);//3
System.out.println（arr1[0].length);//3
//遍历数组
for(int i = 0;i < arr2.length;i++){
  for(int j = 0;j < arr2[i].length;j++){
    System.out.print(arr2[i][j]+"\t");
  }
  System.out.println();
}
```

**动态初始化1**的默认初始化值：

* 外层元素arr[0]：地址值
* 内层元素arr[0] [0]：同一维数组

**动态初始化2**的默认初始化值：

* 外层元素arr[0]：null
* 内层元素arr[0] [0]：不能调用，否则报错









