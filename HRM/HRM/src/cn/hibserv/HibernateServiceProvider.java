package cn.hibserv;

import org.hibernate.*;
import org.hibernate.cfg.*;

//Hibernate服务提供者
public class HibernateServiceProvider {
	private static SessionFactory sessionFactory = null;	
	private static Configuration configuration = new Configuration();        //用映射文件方式
//	private static Configuration configuration = new AnnotationConfiguration(); //用注释映射方式
	private static  ThreadLocal<Session> oneThreadLocal = new ThreadLocal<Session>();                                //创建ThreadLocal实例，它将要被用来存放Session实例

	
    //构造方法	
	public HibernateServiceProvider()
	{
		initHibernate();
	}    

	//初始化SessionFactory实例：
	public static synchronized void initHibernate() throws HibernateException
	{    
    	if(sessionFactory == null)
    	try {
    			configuration.configure();   //启动hibernate
    			sessionFactory = configuration.buildSessionFactory();   //创建SessionFactory实例

    		} catch (HibernateException he) 
    		{
    			System.err.println(" Error Creating SessionFactory ");
    			he.printStackTrace();
    		}    		
    }	
	
    //重新创建SessionFactory实例
	public static void rebuildSessionFactory() throws HibernateException
	{
		try {
			configuration.configure();
			sessionFactory = configuration.buildSessionFactory();
		} catch (HibernateException he) {
			System.err.println(" Error Creating SessionFactory ");
			throw he;
		}
	}
	
    //获取线程安全的Session实例
	public Session getSession() throws HibernateException {
		if (sessionFactory == null) 
		{
			rebuildSessionFactory();
		}
    	Session session = (Session)oneThreadLocal.get();  //要用Session实例时先从ThreadLocal实例中取
    	if(session == null)
    	{
    		session = sessionFactory.openSession();    //创建一个Session实例
    		oneThreadLocal.set(session);    //放入ThreadLocal实例中
    	}
    	return (Session)oneThreadLocal.get();    //返回一个从ThreadLocal实例中取出的线程安全的Session实例        
        
    }
	
	//关闭Session实例
	public void closeSession()     
	{
		Session session = (Session)oneThreadLocal.get();  //从中取出session
		if (session != null) 
		{
			session.close();    //关闭当前Session实例
			oneThreadLocal.set(null);  //清空threadLocal
		}
	}
	
	//关闭SessionFactory实例
	public void closeSessionFactory() throws HibernateException
	{
		sessionFactory.close();
	}
}
