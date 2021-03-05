[TOC]

## 常用类

### 枚举类

说明：

1. 类的对象有限个，确定的，我们称之为枚举类
2. 当需要定义一组常量时，建议使用枚举类

使用enum关键字定义枚举类

```java
enum Season{
  SPRING("spring","spring season");
  SUMMER("summer","summer season");
  
  // 声明season对象的属性：private final修饰
  private final String SeasonName;
  private final String SeasonDesc;
  
  // 私有化类的构造器，并给对象属性赋值
  private Season(String seasonName,String seasonDesc){
    this.seasonName = seasonName;
    this.seasonDesc = seasonDesc;
  }
  
  // ...一些public的方法
}
```



### Date类

#### 基本概念

两个构造器：

Date():创建当前时间的Date对象

Date(long time):创建指定毫秒数的Date对象

>  System.currentTimeMills():返回当前时间（毫秒数）

两个方法：

toString():显示当前的年月日时分秒

getTime():获取当前Date对象的毫秒数（时间戳）

#### 相关的API

* SimpleDateFormat类
* Calendar抽象类
* LocalDate类
* LocalTime类
* LocalDateTime类
* DataTimeFormatter类



### BigInteger类&BigDecimal类

BigInteger可以表示不可变的任意精度的整数

要求数字精度比较高，用到java.math.BigDecimal类



### String类

#### 说明

* String声明为final的，不可被继承
* String实现了Serializable接口：表示支持序列化；实现了Comparable接口：表示String可以比较大小
* String内部定义了final char[] value用于存储字符串数据
* String代表**不可变**的字符序列。体现：对当前字符串重新赋值时，需要重新指定内存区域
* 通过字面量的方式（区别于new）给一个字符串赋值，此时的字符串值声明在字符串常量池中
* 字符串常量池中是不会存储相同内容的字符串的

#### String & StringBuffer & StringBuilder

相同点：底层使用char[]存储

不同点：

String：不可变的字符序列

StringBuffer：可变的字符序列，线程安全的，效率低(synchronized)

StringBuilder：可变的字符序列，线程不安全的，效率高

效率：StringBuilder>StringBuffer>String

#### StringBuffer & StringBuilder的方法

增：append(***)

删：delete(int start,int end)

改：setCharAt(int n, char ch) / replace(int,int,String)

查：charAt(int n)

长度：length()

遍历：for + charAt()



## Java 比较器

### 使用背景

Java中的对象，正常情况下，只能进行等于/不等于比较，不能使用大于/小于。但在开发中，经常需要比较对象的大小。

### 实现

* 实现Comparable接口
* 实现Comparator接口

#### 自然排序：使用Comparable接口

1. 像String，Wrapper等实现了Comparable接口，重写了compareTo（obj）方法，进行了**从小到大**的排序
2. 重写compareTo（obj）的规则：

如果当前对象this大于形参对象obj，则返回正整数

如果当前对象this小于形参对象obj，则返回负整数

如果当前对象this等于形参对象obj，则返回0

e.g. S1.compareTo(S2); //1,则S1>S2

3. 对于自定义类，如果需要排序，我们可以自定义类实现Comparable接口，重写compareTo（obj）方法

```java
@override
public int compareTo(obj o){
  if(o instanceof Goods){
    Goods goods = (Goods)o;
    if(this.price > goods.price){
      return 1;
    }else if(this.price < goods.price){
      return -1;
    }else{
      return 0;
    }
  }
  throw new RuntimeException("Invalid!");
}
```



#### 定制排序：实现Comparator接口

1. 背景：当实现了Comparable接口，但排序规则不适合当前的操作
2. 重写compare(Object o1,Object o2)方法：

如果方法返回正整数，则表示o1>o2;

如果方法返回负整数，则表示o1<o2;

如果方法返回0，则表示o1==o2.



#### 两种排序方式的比较

1. Comparable接口的方式一旦确定，保证Comparable接口实现类的对象在任何位置都可以比较大小
2. Comparator接口属于临时性的比较

 