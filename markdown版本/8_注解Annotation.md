[TOC]

## 注解Annotation

### 理解

代码里的特殊标记，这些标记可以在编译，类加载，运行时被读取，并执行相应的处理

框架 = 注解 + 反射机制 + 设计模式

### 使用案例

* 自动生成的文档注释
* JDK内置的基本注解
  * @Override
  * @Deprecated表示所修饰的元素（类，方法等）已过时
  * @SuppressWarnings抑制编译器警告
* 调用框架，配置文件



### 元注解

对现有的注解进行解释说明的注解

jdk提供的4种元注解：

@Retention：指定修饰的Annotation的生命周期：SOURSE/CLASS（默认）/RUNTIME（只有RUNTIME，才能通过反射获取）

@Target：用于修饰哪些程序元素

@Documented：表示被修饰的Annotation在被javadoc解析时保留

@Inherited：具有继承性



如何获取注解信息：通过反射来进行获取调用

前提：元注解Retention声明的生命周期为RUNTIME