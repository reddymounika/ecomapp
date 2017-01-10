package com.backend.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.backend.configuration.ApplicationConfig;
import com.backend.dao.CategoryDao;
import com.backend.dao.ProductDao;
import com.backend.dao.SupplierDao;
import com.backend.dao.UserDaoImpl;
import com.backend.dao.UsersDao;
import com.backend.model.Category;
import com.backend.model.Product;
import com.backend.model.Supplier;
import com.backend.model.Users;

public class App 
{
    public static void main( String[] args )
    {
       
AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(ApplicationConfig.class);
//annotationConfigApplicationContext.refresh();
UsersDao userDao=(UsersDao)annotationConfigApplicationContext.getBean("userDaoImpl");
Users user=new Users(); 
user.setUsername("test");
user.setPassword("test");
userDao.registerUser(user); 
          
/*ProductDao p=(ProductDao)annotationConfigApplicationContext.getBean("productDaoImpl");
Product product=new Product();
product.setPname("pppp");
product.setPrice(007.7f);
p.addProduct(product); */

/*SupplierDao supplierDao=(SupplierDao)annotationConfigApplicationContext.getBean("supplierDaoImpl");
Supplier supplier=new Supplier();
supplier.setSname("ravi");
supplier.setSaddress("hyd");
supplierDao.addSupplier(supplier); */

/*CategoryDao categoryDao=(CategoryDao)annotationConfigApplicationContext.getBean("categoryDaoImpl");
Category category=new Category();
category.setCname("jjjj");
categoryDao.addCategory(category);*/

}

}
