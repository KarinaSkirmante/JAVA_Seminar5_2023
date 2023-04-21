package lv.venta.controllers;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lv.venta.model.Product;

@Controller
public class FirstController {
	
	
	private ArrayList<Product> allProducts = new ArrayList<>(Arrays.asList(
			new Product("Watermelon", "Pink", 1.23f, 4),
			new Product("Tomato", "Red", 0.99f, 3),
			new Product("Grapes", "Purple", 12.3f, 4)
			));
	
	
	@GetMapping("/hello") //localhost:8080/hello
	public String getHelloFunc() {
		System.out.println("Sveiki!");
		return "hello-page";//there will be hello-page.html
	}
	
	//TODO create controller with model and add String in the model
	@GetMapping("/msg") //localhost:8080/msg
	public String getMsgFunc(Model model) {
		model.addAttribute("packet", "Message from Karina");
		return "msg-page";//will show msg-page.html
	}
	
	//TODO controller function which will send new product to frontend
	@GetMapping("/one-product")//localhost:8080/one-product
	public String getOneProductFunc(Model model) {
		Product prod = new Product("Apple", "Tasty", 1.2f, 9);
		model.addAttribute("packet", prod);
		return "one-product-page";//will show one-product-page.html
	}

	@GetMapping("/all-products")//localhost:8080/all-products
	public String getAllproductsFunc(Model model)
	{
		model.addAttribute("packet", allProducts);
		return "all-products-page";// will show all-products-page.html
	}
	//TODO create a html page which will show all products
	
	
}
