package com.spring.spring_frame.Tightcoupling1;
interface job
{
    public void display();
}
public class t1
{
    Doctor doctor1;
    Engineer  engineer1;
    public t1(Doctor doctor2,Engineer engineer2) {
        super();
        this.doctor1   = doctor2;
        this.engineer1 = engineer2;
    }

    public void showData()
    {
        doctor1.display();
        engineer1.display();
    }
}
