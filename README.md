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

开发中，经常遇到需要


## 取值


## 其它

### 是否闰年

