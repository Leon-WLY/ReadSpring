package com.leon.read;

import com.leon.read.config.Appconfig;
import com.leon.read.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
		IndexDao dao = annotationConfigApplicationContext.getBean(IndexDao.class);
		dao.query();
	}
}
