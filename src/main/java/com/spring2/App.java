package com.spring2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	 ApplicationContext context =new ClassPathXmlApplicationContext("spring.config.xml");
    	 BillPayment blp=context.getBean("billpayment",BillPayment.class);
    	 blp.paybill(1000);

    }
}
