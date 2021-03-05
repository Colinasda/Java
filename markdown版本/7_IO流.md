[TOC]

## IO流

### File类

#### 理解

* File类的一个对象，代表一个文件或者文件目录
* File类声明在java.io包下
* File类中涉及到关于文件或文件目录的创建、删除、重命名、修改时间、文件大小写等写法，并未涉及到写入或读取文件的操作。如果需要写入或读取文件内容，必须使用IO流来完成
* 后续File类的对象常会作为参数传递到流的构造器中，指明读取或写入的“终点”

#### File的实例化

常用的构造器：

File(String filePath)

File(String parentPath,String childPath)

File(File parentFile,String childPath)

路径的分类：

相对路径：相较于某个路径下，指明的路径

绝对路径：包含盘符在内的文件或文件目录的路径



### IO流

#### 流的分类

1. 操作数据单位：字节流，字符流
2. 数据的流向：输入流、输出流
3. 流的角色：节点流、处理流

#### 重要的流结构

| 抽象基类 | InputStream         | OutputStream         | Reader         | Writer         |
| -------- | ------------------- | -------------------- | -------------- | -------------- |
| 节点流   | FileInputStream     | FileOutputStream     | FileReader     | FileWriter     |
| 缓冲流   | BufferedInputStream | BufferedOutputStream | BufferedReader | BufferedWriter |

#### 输入、输出的标准化过程

输入过程：

1. 创建File类的对象，指明读取的数据来源（文件一定要存在）
2. 创建对应的输入流，将File类的对象作为参数，传入流的构造器中
3. 具体的读入过程：创建相应的byte[]或char[]
4. 关闭流资源

说明：程序中出现的异常需要使用try-catch-finally处理

```java
File file1 = new File("input.txt");
File file2 = new File("output.txt");
// 
FileInputStream fis = new FileInputStream(file1);
FileOutputStream fos = new FileOutputStream(file2);
// 缓冲流增加效率
BufferedInputStream bis = new BufferedInputStream(fis);
BufferedOutputStream bos = new BufferedOutputStream(fos);
// 处理
byte[] buffer = new byte[10];
int len;
while((len=bis.read(buffer))!=-1){
  bos.write(buffer,0,len);
}
//try-catch-finally
bis.close();
bos.close();
```

输出过程：

1. 创建File类对象，指明写出数据的位置
2. 创建输出流
3. write(char[]/byte[] buffer,0,len)
4. 关闭

> 1. 对于文本文件（.txt,.java,.c,.cpp)，使用字符流处理
> 2. 对于非文本文件（.jpg,.mp3,.mp4,.doc)，使用字节流处理



#### 缓冲流

作用：提高流的读取，写入的速度

原因：内部提供了一个缓冲区，默认情况是8kb

flush（）：刷新缓冲区，将缓冲区的内容写出



#### 转换流

作用：提供字节流和字符流之间的转换

属于字符流

* InputStreamReader：字节输入流to字符输入流
  * 解码：字节，字节数组to字符数组，字符串
* OutputStreamWriter：字符输出流to字节输出流
  * 编码：字符数组、字符串to字节数组、字节



#### 对象流

* ObjectOutputStream：序列化过程
  * 内存中的对象to存储中的文件、通过网络传输出去
* ObjectInputStream：反序列化过程
  * 存储中的文件、通过网络接收过来to内存中的对象

