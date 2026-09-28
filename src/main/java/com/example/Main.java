package com.example;

public class Main {

    public static void main(String[] args) {
        // 步骤6：用全参构造创建 Book 对象并打印
        Book book = new Book("三体", "刘慈欣", 93.0, 302);
        System.out.println(book);

        // 修改对象属性后再次打印
        book.setTitle("三体II：黑暗森林");
        book.setPrice(99.0);
        System.out.println("修改后：" + book);
    }
}