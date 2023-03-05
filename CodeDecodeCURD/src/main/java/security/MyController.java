package security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/myuser")
public class MyController {
	
	@Autowired
	private IUserService userService;
	
	@GetMapping("/register")
	public String loadUserRegisterPage(Model model) {
		model.addAttribute("myuser",new MyUser());
		return "myuserRegister";
	}
	
	
	
	@PostMapping
	public String createUser(@ModelAttribute("myuser") MyUser user,Model model)
	{
		Integer saved = userService.createUser(user);
		model.addAttribute("succMsg","User"+saved+"is creat !");
		
		return  "myuserRegister";
		
	}
	
}
