package com.example;

import org.springframework.beans.BeanUtils;

public class Main {

    public static void main(String[] args) {
        // 步骤6：用全参构造创建 Book 对象并打印
        Book book = new Book("三体", "刘慈欣", 93.0, 302);
        System.out.println(book);

        // 修改对象属性后再次打印
        book.setTitle("三体II：黑暗森林");
        book.setPrice(99.0);
        System.out.println("修改后：" + book);

        // 步骤9：用无参构造创建第二个对象，用 BeanUtils 拷贝全部属性
        Book book2 = new Book();
        BeanUtils.copyProperties(book, book2);

        // 步骤11：打印两个对象——属性相同，但哈希码不同
        System.out.println("book : " + book);
        System.out.println("book2: " + book2);
    }
}