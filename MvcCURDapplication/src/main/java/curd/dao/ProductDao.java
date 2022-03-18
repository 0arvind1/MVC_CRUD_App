package curd.dao;

import java.util.List;

import javax.servlet.jsp.tagext.JspIdConsumer;

import org.eclipse.jdt.internal.compiler.ast.Annotation.AnnotationTargetAllowed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.view.RedirectView;

import curd.Model.Product;

@Component
public class ProductDao {
	@Autowired
private HibernateTemplate hibernateTemplate;
	@Transactional
	public void addProduct(Product product) {
		 
		this.hibernateTemplate.saveOrUpdate(product);
	}
	@Transactional
	public void deleteproduct(int pid) {
		Product p = this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(p);
	}
	
	public List<Product> getAllProduct(){
		List<Product> products=this.hibernateTemplate.loadAll(Product.class );
		return products;
	}
	
	public Product getSingleProduct(int pid) {
		Product product=this.hibernateTemplate.get(Product.class, pid);
		return product;
		
	}

	
}
