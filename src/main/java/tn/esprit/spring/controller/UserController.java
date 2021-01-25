package tn.esprit.spring.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entity.User;
import tn.esprit.spring.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;

	@RequestMapping("/sayHello")
	public String welcome(Map<String, Object> model, @RequestParam("myName") String name) {
		model.put("receivedName", name);
		return "helloPage";
	}
	// http://localhost:8081/SpringMVC/servlet/
	@RequestMapping(value = "/", method = RequestMethod.GET)
	 public String users(User user, Model model) {
	 model.addAttribute("user", new User());
	 model.addAttribute("users", userService.retrieveAllUsers());
	 return "users";
	 }
	 @RequestMapping(value="/saveUser")
	 public String saveProduit(User user, Model model){
	
	 model.addAttribute("user", userService.addUser(user));
	 model.addAttribute("users", userService.retrieveAllUsers());
	 return "users";
	 }

	 @RequestMapping(value="/deleteUser")
	  public String delete(String id, Model model){
	  userService.deleteUser(id);
	  model.addAttribute("user", new User());
	  model.addAttribute("users", userService.retrieveAllUsers());
	 return "users";
	  }
	 
	  @RequestMapping(value="/editUser")
	  public String edit(String id, Model model){
	  User p = userService.retrieveUser(id);
	  model.addAttribute("user", p);
	  model.addAttribute("users", userService.retrieveAllUsers());
	  return "users";
	  } 
}
