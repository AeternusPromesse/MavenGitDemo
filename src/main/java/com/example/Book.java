package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Book 实体类：使用 Lombok 注解自动生成 Getter/Setter、无参/全参构造
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {

    private String title;   // 书名
    private String author;  // 作者
    private double price;   // 价格
    private int pages;      // 页数

    // 步骤10：重写 toString，返回对象特征，并用 super 调用父类(Object)的 toString 获得哈希码
    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author +
                "', price=" + price + ", pages=" + pages + "} " + super.toString();
    }
}