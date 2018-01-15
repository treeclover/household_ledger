package com.house.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ResourceBundle;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import com.house.controller.Action;

/**
 * Application Lifecycle Listener implementation class ActionServletContextListener
 *
 */
@WebListener
public class ActionServletContextListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent arg0)  { }

    public void contextInitialized(ServletContextEvent sce) {
    	//1. web.xml 문서에 설정되어 있는 파일이름 가져오기
    	ServletContext application = sce.getServletContext();
    	String fileName = application.getInitParameter("fileName");
    	
    	Map<String, Action> map = new HashMap<>();
    	
    	//2. 해당 파일이름으로 로딩
    	ResourceBundle rb = ResourceBundle.getBundle(fileName);
    	
    	
    	//3. 파일에 있는 key와 value를 분리해서 value를 객체로 변환하고
    	//	Map에 저장한다.
    	Iterator<String> it = rb.keySet().iterator();
    	while(it.hasNext()) {
    		String key = it.next();
    		String value = rb.getString(key);
//    		System.out.println(key + "=" + value);
    		try {
				Action di = (Action)Class.forName(value).newInstance();
				map.put(key, di);
				System.out.println(key + "=" + value + "-->" + di);
			} catch (Exception e) {
				e.printStackTrace();
			}
    	}
    	
    	//4. 저장된 Map을 웹App영역 어디에서도 사용할 수 있도록 application에 저장한다.
    	
    	application.setAttribute("path", sce.getServletContext().getContextPath());
    	application.setAttribute("map", map);
    }
	
}
