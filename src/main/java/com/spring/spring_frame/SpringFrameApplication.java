package com.spring.spring_frame;
//import com.spring.spring_frame.Doctors.Doctor;
import com.spring.spring_frame.Tightcoupling1.*;
import com.spring.spring_frame.compoauto.Autowiredconfig;
import com.spring.spring_frame.compoauto.Book;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringFrameApplication {

	public static void main(String[] args)
	{
		//t1 tightcoupling = new t1(new Doctor(), new Engineer());
		//tightcoupling.showData();
//		loosecoupling l2 = new loosecoupling(new Photographer());
//		l2.showData();
		ApplicationContext context = new AnnotationConfigApplicationContext(Autowiredconfig.class);
		Book book1 = (Book)context.getBean("book");
		System.out.println(book1.getAuthor().getAuthorName());

	}

}
