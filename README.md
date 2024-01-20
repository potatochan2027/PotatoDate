# PotatoDate文档
[TOC]

PotatoDate库可对日期的常规操作，提供了构造、增减、起始、对比、取值等方法，并通过支持`链式调用` 进行代码的精简。

如：

```
 new PotatoDate().add('day',1).startOfYear().format();
```

将原本的几十行代码，精简为上述代码，同时提高了可读性。

对于Date、Calander一些不友好的东西也进行重新的定义，如一周的开始为周一，而非周日。

PotatoDate——更适合国人体质。

作者：PotatoChan

## 构造方法

### 无参数
无参数构造方法


```
public PotatoDate()
```

### 字符串构造

支持 `yyyy-MM-dd HH:mm:ss` 和 `yyyy-MM-dd` 两种字符串格式，同时支持使用自定义格式构造

```
public PotatoDate(String dateStr)
public PotatoDate(String dateStr, String patten)
```

### 时间戳构造
支持使用时间戳构造
```
public PotatoDate(long timeStamp)
```

### Date对象构造
```
public PotatoDate(Date date)
```

## 格式化输出

### 默认
格式化输出，默认输出格式为 `yyyy-MM-dd HH:mm:ss`
```
public String format()
```

### 年月日格式
输出格式为：`yyyy-MM-dd`
```
public String formatDate()
```

### 年月日时分秒格式
输出格式为 `yyyy-MM-dd HH:mm:ss`
```
public String formatDateTime()
```

### 自定义格式
```
public String format(String patten)
```

## 日期增减

### 增加

对某个字段进行增加操作，如 日期增加1天，示例：
```
new PotatoDate().add('day',1); //当前日期增加1天
new PotatoDate().add('day',-1); //当前日期减少1天
```

方法如下：

```
public PotatoDate add(String field, int amount)
```

field 表示具体操作的字段，amount表示增加/减少的数值

字段| 含义
:---:|:---:
year|年
month|月
week|周
day|日
hour|时
minute|分
second|秒
millisecond|毫秒


为了代码的可读性，同时冗余了以下方法

````
public PotatoDate addYear(int amount) //增加年
public PotatoDate addMonth(int amount) //增加月
public PotatoDate addWeek(int amount) //增加周
public PotatoDate addDay(int amount) //增加日
public PotatoDate addHour(int amount)  //增加小时
public PotatoDate addMinute(int amount) //增加分钟
public PotatoDate addSecond(int amount) //增加秒
public PotatoDate addMillisecond(int amount) //增加毫秒
````

### 减少

对某个字段进行减少操作，类比增加

```
public PotatoDate substract(String field, int amount)
```

为了代码的可读性，同时冗余了以下方法

```
public PotatoDate substractYear(int amount)
public PotatoDate substractMonth(int amount)
public PotatoDate substractWeek(int amount)
public PotatoDate substractDay(int amount)
public PotatoDate substractHour(int amount)
public PotatoDate substractMinute(int amount)
public PotatoDate substractSecond(int amount)
public PotatoDate substractMillisecond(int amount)
```

## 开始&结尾

实际开发中，经常需要使用到某个时间的开头及结尾，如今天的开始时间，及结束时间，本周的开始及结束时间，可通过这个系列的方法，进行简单的获取。

本系列方法的精确度到毫秒

### 年-开始&结尾

```
public PotatoDate startOfYear()
```

使用方式如下：

```
public PotatoDate startOfYear() //年的开始
public PotatoDate endOfYear() //年的结尾
```

示例如下：
```
System.out.println(new PotatoDate().startOfYear().format());
System.out.println(new PotatoDate().endOfYear().format());

//输出结果：
2024-01-01 00:00:00
2024-12-31 23:59:59

System.out.println(new PotatoDate("2022-07-07").startOfYear().format());
System.out.println(new PotatoDate("2022-07-07").endOfYear().format());

//输出结果：
2022-01-01 00:00:00
2022-12-31 23:59:59
```

### 月-开始&结尾
使用方式如下：

```
public PotatoDate startOfMonth() //月的开始
public PotatoDate endOfMonth() //月的结尾
```

示例如下：
```
System.out.println(new PotatoDate().startOfMonth().format());
System.out.println(new PotatoDate().endOfMonth().format());

//输出结果：
2024-01-01 00:00:00
2024-01-31 23:59:59
```

### 周-开始&结尾

使用方式如下：

```
public PotatoDate startOfWeek() //周的开始
public PotatoDate endOfWeek() //周的结尾
```

示例如下：
```
System.out.println(new PotatoDate().startOfWeek().format());
System.out.println(new PotatoDate().endOfWeek().format());

//输出结果：
2024-01-15 00:00:00
2024-01-21 23:59:59
```

### 日-开始&结尾

使用方式如下：

```
public PotatoDate startOfDay() //日的开始
public PotatoDate endOfDay() //日的结尾
```

示例如下：
```
System.out.println(new PotatoDate().startOfDay().format());
System.out.println(new PotatoDate().endOfDay().format());

//输出结果：
2024-01-20 00:00:00
2024-01-20 23:59:59
```

### 小时-开始&结尾

使用方式如下：

```
public PotatoDate startOfHour() //小时的开始
public PotatoDate endOfHour() //小时的结尾
```

示例如下：
```
System.out.println(new PotatoDate().startOfHour().format());
System.out.println(new PotatoDate().endOfHour().format());

//输出结果：
2024-01-20 19:00:00
2024-01-20 19:59:59
```

### 分钟-开始&结尾

使用方式如下：

```
public PotatoDate startOfMinute() //分钟的开始
public PotatoDate endOfMinute() //分钟的结尾
```

示例如下：
```
System.out.println(new PotatoDate().startOfMinute().format());
System.out.println(new PotatoDate().endOfMinute().format());

//输出结果：
2024-01-20 19:52:00
2024-01-20 19:52:59
```

### 秒-开始&结尾

使用方式如下：

```
public PotatoDate startOfSecond() //秒的开始
public PotatoDate endOfSecond() //秒的结尾
```

示例如下：
```
System.out.println(new PotatoDate().startOfSecond().format("yyyy-MM-dd HH:mm:ss.SSS"));
System.out.println(new PotatoDate().endOfSecond().format("yyyy-MM-dd HH:mm:ss.SSS"));

//输出结果：
2024-01-20 19:55:16.000
2024-01-20 19:55:16.999
```

### 通用方法

```
public PotatoDate startOf(String filed);
public PotatoDate endOf(String filed);
```
field 表示具体操作的字段

字段| 含义
:---:|:---:
year|年
month|月
week|周
day|日
hour|时
minute|分
second|秒




## 取值 & 赋值

同时提供了各种方法，用于取值，如获取日期中的年、月、日、时分秒、毫秒、时间戳

取值操作为：

```
public int year();
public int month();
public int week();
public int day();
public int hour();
public int minute();
public int second();
public int millisecond();
public long getTimeStamp(); //获取时间戳
```

赋值操作为：
```
public PotatoDate year(int year);
public PotatoDate month(int month);
public PotatoDate week(int week);
public PotatoDate day(int day);
public PotatoDate hour(int hour);
public PotatoDate minute(int minute);
public PotatoDate second(int second);
public PotatoDate millisecond(int millisecond);
```


## 其它

```
public String toString(); //同Date的toString方法
public Date toDate(); // 转化为普通Date对象
```

