> 个人整理的Java学习笔记

- [Java语言概述](#java语言概述)
  - [Java语言发展历史](#java语言发展历史)
  - [Java技术体系平台](#java技术体系平台)
  - [Java语言的特点](#java语言的特点)
  - [JDK & JRE & JVM](#jdk--jre--jvm)
  - [Java代码的运行步骤](#java代码的运行步骤)
  - [注释（Comment）](#注释comment)
- [Java基本语法](#java基本语法)
  - [关键字 & 保留字 & 标志符](#关键字--保留字--标志符)
  - [命名规范(Naming Notations)](#命名规范naming-notations)
  - [变量的使用](#变量的使用)
    - [按数据类型分类](#按数据类型分类)
    - [基本数据类型之间的运算规则](#基本数据类型之间的运算规则)
    - [按声明位置分类](#按声明位置分类)
    - [String类型变量](#string类型变量)
  - [进制](#进制)
  - [原码 & 反码 & 移码](#原码--反码--移码)
  - [运算符](#运算符)
  - [程序流程控制](#程序流程控制)
  - [Scanner类的使用](#scanner类的使用)
  - [数组](#数组)
    - [一维数组](#一维数组)
    - [二维数组](#二维数组)
- [面向对象](#面向对象)
  - [基本概念](#基本概念)
    - [面向对象&面向过程](#面向对象面向过程)
    - [类&对象](#类对象)
    - [形参&实参](#形参实参)
    - [方法的重载（overload）& 方法的重写（override）](#方法的重载overload-方法的重写override)
      - [方法的重载](#方法的重载)
      - [方法的重写](#方法的重写)
    - [构造器（constructor）](#构造器constructor)
  - [封装（Encapsulation）](#封装encapsulation)
    - [高内聚低耦合](#高内聚低耦合)
    - [设计思想](#设计思想)
    - [权限修饰符](#权限修饰符)
  - [继承（Inheritance）](#继承inheritance)
    - [优点](#优点)
    - [说明](#说明)
  - [多态（Polymorphism）](#多态polymorphism)
    - [使用](#使用)
    - [体现](#体现)
  - [部分关键字和其他](#部分关键字和其他)
    - [this](#this)
    - [super](#super)
    - [instanceof](#instanceof)
    - [static](#static)
    - [final](#final)
    - [包装类（wrapper）](#包装类wrapper)
    - [== & equals()](#--equals)
    - [toString()](#tostring)
    - [abstract](#abstract)
    - [接口（interface）](#接口interface)
      - [说明](#说明-1)
      - [抽象类&接口](#抽象类接口)
- [异常处理](#异常处理)
  - [Error](#error)
  - [Exception](#exception)
  - [抓抛模型](#抓抛模型)
  - [try-catch-finally](#try-catch-finally)
  - [throw&throws](#throwthrows)

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



## 面向对象

### 基本概念

#### 面向对象&面向过程

* 面向对象OOP（Object Oriented Programming）：强调具备了功能的对象，以类/对象为最小单位
* 面向过程POP（Process Oriented Programming）：强调功能行为，以函数为最小单位



#### 类&对象

* 类（class）：是对一类事物的描述，是抽象的定义
* 对象（Object）：是实际存在的该类事物的每个个体，也称为实例（instance），类的实例化也就是创建类的对象
* 匿名对象（anonymous object）：创建对象时没有显式地赋给该对象一个变量名，只能调用一次，e.g. new Person()



#### 形参&实参

* 形参：方法声明时的参数
* 实参：方法调用时的实际传给形参的参数值

> Java的实参值如何传入方法：
>
> > 1.形参是基本数据类型，将实参类型的**数据值**传给形参
> >
> > 2.形参是引用数据类型，将实参类型的**地址值**传给形参



#### 方法的重载（overload）& 方法的重写（override）

##### 方法的重载

两同一不同：同一个类下、相同方法名；参数列表不同（个数或类型不同）

e.g. print(boolean)，print(char)，print(int)...

##### 方法的重写

定义：在子类中可以根据需要对从父类中继承来的方法进行改造。程序执行时，子类的方法将覆盖父类的方法

方法的声明格式：

权限修饰符	返回值类型	方法名(形参){

​		//方法体

}

说明：

* 子类重写方法的权限修饰符**大于等于**父类
* 返回值类型：父类为void，子类为void；父类为基本数据类型，子类为相同的基本数据类型；父类为引用数据类型A类，子类为A类或A类的子类
* 方法名和形参列表相同
* 子类重写的方法抛出的异常**小于等于**父类
* 方法体不一致

**区分方法的重载和重写**

1. 二者的概念
2. 重载和重写的规则
3. 重载不表现为多态性，重写表现为多态性



#### 构造器（constructor）

作用：创建对象，给对象初始化

格式：权限修饰符	类名(形参){	};

说明：

* 如果没有显式的定义类的构造器，则系统默认提供一个空参的构造器
* 一个类中如果有多个构造器，彼此构成重载
* 一旦显式定义类的构造器，系统将不再提供默认的空参构造器
* 一个类中，至少有一个构造器



### 封装（Encapsulation）

#### 高内聚低耦合

* 高内聚：类的内部数据操作细节自己完成，不允许外部干涉
* 低耦合：仅对外暴露少量的方法用于使用

#### 设计思想

隐藏对象内部的复杂性，只对外公开简单的接口

比如，将类的属性私有化(private)，提供公共的(public)方法来获取(getXxx)和设置(setXxx)此属性的值

```java
class Person{
  private int age;
  public int getAge(){
    return age;
  }
  public void setAge(int age){
    this.age = age;
  }
}
```

#### 权限修饰符

| 权限修饰符      | 类内部 | 同一个包 | 不同包子类 | 同一个工程 |
| --------------- | ------ | -------- | ---------- | ---------- |
| private         | ✅      |          |            |            |
| default（缺省） | ✅      | ✅        |            |            |
| protected       | ✅      | ✅        | ✅          |            |
| public          | ✅      | ✅        | ✅          | ✅          |



### 继承（Inheritance）

#### 优点

* 减少代码的冗余，提高代码的复用性
* 便于功能的拓展
* 为之后多态性的使用，提供了前提



格式：class A extends B{  }

#### 说明

* 当子类A继承父类B以后，子类A就获取了B中的结构（属性，方法）。特殊地，父类中private的属性、方法，子类也获取了，只是因为封装性的影响，使得子类不能直接调用父类的结构
* 子类继承父类以后，还可以声明自己特有的属性，方法，实现功能的拓展
* Java中的类只支持**单继承**，接口可以多继承



### 多态（Polymorphism）

理解为：一个事物的多种形态，实现代码的通用性

对象的多态性：父类的引用指向子类的对象。e.g. Person p = new Man();

#### 使用

前提：类的继承关系；方法的重写

当调用子类、父类同名同参数的方法时，实际执行子类中重写父类的方法

#### 体现

* Object类中定义的public boolean equals(Object obj)
* JDBC：使用Java程序操作（获取数据库连接，CRUD）数据库（MySQL，SQLServer，Oracle）
* 抽象类、接口的使用（抽象类、接口不可以实例化）



### 部分关键字和其他

#### this

* 理解为：当前对象的
* 用来修饰：属性、方法、构造器

#### super

* 理解为：父类的
* 用来修饰：属性、方法、构造器

#### instanceof

* 作用：a instanceof A：判断a是否是A的实例，返回true/false
* 使用场景：为避免向下转型时出现ClassCastException的异常，一般先判断
* 例子：class A extends B，如果a instanceof A是true，则a instanceof B也是true

#### static

用来修饰属性、方法、代码块、内部类。**随着类的加载而加载**

* static 属性：静态属性。当创建了类的多个对象，多个对象共享同一个静态变量。当通过某一个对象修改静态变量时，会导致其他对象调用此静态变量是已经修改过了的
* static 方法：静态方法。随着类的加载而加载，可以通过“类.静态方法“调用，不需要new对象。静态方法中，只能调用静态的方法或属性，不能使用this，super

>  1.开发中，如何确定一个**属性**是否声明为static？
>
>  属性是可以被多个对象所共享的，不会随着对象的不同而不同的，例如：银行利率，最低存款金额
>
>  2.开发中，如何确定一个**方法**是否声明为static？
>
>  操作静态属性的方法，通常设置为static

* static 代码块：静态代码块。随着类的加载而加载，只执行一次



#### final

用来修饰类、方法、属性

* 修饰类：该类不可以被其他类继承
* 修饰方法：该方法不可以被重写
* 修饰属性：该变量为常量
* static final 属性：全局常量



#### 包装类（wrapper）

作用：使基本数据类型有了类的特点

| 基本数据类型 | 包装类        |
| ------------ | ------------- |
| byte         | Byte          |
| short        | Short         |
| int          | **Integer**   |
| long         | Long          |
| float        | Float         |
| double       | Double        |
| boolean      | Boolean       |
| char         | **Character** |

相互转换关系：

基本数据类型to包装类：自动装箱

包装类to基本数据类型：自动拆箱

```java
//自动装箱
Integer total = 99;
//自动拆箱
int totalCount = total;
```

基本数据类型toString类：'+'

String类to基本数据类型：例子：Integer.parseInt()

包装类toString类：toString()



#### == & equals()

* ==既可以比较基本数据类型（比较值），也可以比较引用数据类型（比较内存地址）
* equals()只能比较引用数据类型
* 像String，Date，File，Wrapper等都重写了Object类中的equals()方法，重写以后，比较的不是两个引用地址，而是“实体内容”



#### toString()

* 当我们输出一个对象的引用时，实际上是当前对象.toString()
* 像String，Date，File，Wrapper等都重写了Object类中的toString()方法，重写以后，使得返回实体内容



#### abstract

用来修饰类、方法

* abstract 类：抽象类。该类不可以实例化。一定有构造器，便于子类实例化时调用

* abstract 方法：抽象方法。

  只有方法的声明，没有方法体。e.g. public abstract void eat();

  包含抽象方法的类，一定是抽象类；抽象类中可以没有抽象方法

  若子类重写了父类中所有的抽象方法，可实例化；如果没有，子类需要用abstract修饰



#### 接口（interface）

##### 说明

* Java中，接口和类是并列关系
* 定义接口中的成员：JDK7之前，只能定义全局常量和抽象方法；JDK8之后，还可以定义静态方法，默认方法
* 接口中不能定义构造器，意味着接口不可以实例化
* Java开发中，接口通过让类去实现（implement）。如果实现类覆盖了接口中所有的抽象方法，则可以实例化；如果没有，则仍为一个抽象类
* Java可以实现多个接口。e.g. class A extends B implement C,D,E{ }
* 接口与接口之间可以继承，而且可以多继承
* 接口的具体使用，体现多态性

```java
interface A{
  int x = 0;
}
class B{
  int x = 1;
}
class C extends B implements A{
  public void printX(){
    System.out.println(super.X);//1
    System.out.println(A.x);//0
  }
  //...other methods
}
```

##### 抽象类&接口

* 相同点：不能实例化，都可以被继承
* 不同点

|        | 抽象类 | 接口     |
| ------ | ------ | -------- |
| 构造器 | 有     | 不能声明 |
| 继承性 | 单继承 | 多继承   |




## 异常处理

### Error

定义：JVM无法解决的严重问题

如：JVM系统内部错误，资源耗尽

* 栈溢出：java.lang.StackOverFlowError
* 堆溢出：java.lang.OutOfMemeryError



### Exception

定义：其他因编程错误或偶然的外在因素导致的

编译时异常：

* IOException
  * FileNotFoundException

运行时异常：

* AtithmeticException
* InputMismatchException
* NumberFormatException
* ClassCastException
* ArrayIndexOutOfBoundsException
* NullPointerException



### 抓抛模型

1.“抛”过程

两种方式：系统生成；手动生成throw new Exception( )

程序一旦出现异常，会在异常代码处生成一个异常类的对象，并将此对象抛出。一旦抛出对象后，其后的代码就不再执行

2.“抓”过程

异常的两种处理方式：

* try-catch-finally（处理）
* throws 异常类型（甩给上一级）



### try-catch-finally

```java
public class ExceptionTest{
  public void test(){
    String str = "abc";
    try{
      //可能出现异常的语句
      int num = Integer.parseInt(str);
    }catch(NumberFormatException e){
      //处理方式1
      e.printStackTrace();
    }catch(Exception e){
      //处理方式2，不处理，已执行上述异常处理语句，已跳出try-catch
      e.printStackTrace();
    }
    
    finally{
      //必须执行的语句
    }
  }
}
```

说明：

* catch中的类型如果存在子父类关系，则需要子类一定声明在父类上面，否则会报错
* 常用的异常对象处理方式：e.getMessage() 以及 e.printStackTrace()
* finally的使用场景：数据库连接，输入输出流，网络编程等



### throw&throws

* throw：表示抛出一个异常类的对象，**生成异常对象**的过程，声明在方法体内
* throws：属于**异常处理**的一种方式，声明在方法的声明处

```java
class Student{
	private int id;
  //异常处理的方式之一：throws
	public void regist(int id) throws Exception {
		if(id>0) {
			this.id = id;
		}else {
      //手动抛出异常
			throw new Exception("invalid input");
		}
	}
}
```




