package curd.controll;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import curd.Model.Product;
import curd.dao.ProductDao;

@Controller
public class Controllerr {
	@Autowired
	private ProductDao productDao;
	
@RequestMapping("/home")
	public String start(Model model) {
	List<Product> allProduct = this.productDao.getAllProduct();
model.addAttribute("products", allProduct);
	return "home";
	}

@RequestMapping("/add")
public String addProductForm() {
	return "addProductForm";
	
}
//add product
@RequestMapping(path = "/productAdded", method = RequestMethod.POST)
public RedirectView addFormHandler(@ModelAttribute Product product, HttpServletRequest request) {
	System.out.println(product);
	productDao.addProduct(product);
	RedirectView redirectView=new RedirectView();
	redirectView.setUrl(request.getContextPath()+"/");
	return redirectView;
}
	@RequestMapping(path = "delete/{pId}", method = RequestMethod.GET)
public RedirectView deleteProduct( HttpServletRequest request, @PathVariable int pId) {
	productDao.deleteproduct(pId);
	RedirectView redirectView = new RedirectView();
	redirectView.setUrl(request.getContextPath()+"/");
	return redirectView;
	}
	
	@RequestMapping(path="update/{pId}")
public String updateProductForm(@PathVariable int pId,Model model) {
		Product singleProduct = productDao.getSingleProduct(pId);
		System.out.println(singleProduct);
model.addAttribute("Product",singleProduct);
	return "updateForm";
	
}
}

