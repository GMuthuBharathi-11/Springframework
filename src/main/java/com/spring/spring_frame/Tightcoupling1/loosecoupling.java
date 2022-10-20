package com.spring.spring_frame.Tightcoupling1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class loosecoupling

{
   job Job;

   @Autowired
    public loosecoupling(job Job)
    {
        super();
        this.Job=  Job;
    }
    public  void showData()
    {
     Job.display();
    }
}
