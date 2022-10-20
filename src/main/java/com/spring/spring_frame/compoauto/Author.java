package com.spring.spring_frame.compoauto;
import java.lang.*;
import org.springframework.stereotype.Component;

@Component
public class Author
{
    private String authorName;
    Author()
    {
        this.authorName ="Martin Powler";
        System.out.println("Constructor  : I am called");
    }
    public String getAuthorName()
    {
        return authorName;
    }
    public void setAuthorName(String authorName)
    {
        this.authorName=authorName;
    }
}
