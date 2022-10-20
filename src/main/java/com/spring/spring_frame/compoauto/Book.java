package com.spring.spring_frame.compoauto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Book
{
    private String bookName;
    private int bookPrice;
    @Autowired
    private Author author1;
    public Author getAuthor()
    {
        return author1;
    }
    public void ssetAuthor(Author author1)
    {
        this.author1=author1;
    }
    public String getBookName()
    {
        return bookName;
    }
    public void setBookName(String bookName)
    {
        this.bookName=bookName;
    }
    public void setBookPrice(int bookprice)
    {
        this.bookPrice=bookPrice;
    }
}
