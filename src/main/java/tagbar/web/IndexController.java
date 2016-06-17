package tagbar.web;

import tagbar.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class IndexController {

	@ModelAttribute("users")
	public List<User> setupUser() {
		List<User> users = new ArrayList<>();
		Collections.addAll(users, User.WALTER, User.SKYLER, User.JESSE, User.SAUL);
		return users;
	}

    @RequestMapping(value = "/before", method = RequestMethod.GET)
    public String before(Model model) {
        model.addAttribute("recipient", "World");
        return "before.html";
    }

	@RequestMapping(value = "/after", method = RequestMethod.GET)
	public String after(Model model) {
		//model.addAttribute("recipient", "World");
		return "after.html";
	}
}
