package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// Book 实体类：使用 Lombok 注解自动生成 Getter/Setter、无参/全参构造、toString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {

    private String title;   // 书名
    private String author;  // 作者
    private double price;   // 价格
    private int pages;      // 页数
}