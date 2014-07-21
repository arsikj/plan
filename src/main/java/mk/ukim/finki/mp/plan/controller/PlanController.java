package mk.ukim.finki.mp.plan.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import mk.ukim.finki.mp.plan.model.User;
import mk.ukim.finki.mp.plan.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PlanController {

	@Autowired
	UserService userService;

	@RequestMapping(value = "/*")
	public String invalid() {
		return "redirect:login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView pocetna(HttpSession session, HttpServletRequest request) {
		// Cookie[] cookies = request.getCookies();
		// if (cookies != null) {
		// for (int i = 0; i < cookies.length; i++) {
		// Cookie c = cookies[i];
		// if (c.getName().equals("broj")) {
		// session.setAttribute("broj", c.getValue());
		// return new ModelAndView("index");
		// }
		// }
		// }
		ModelAndView result = new ModelAndView("home");
		return result;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView pocetnaPost(@RequestParam String username,
			@RequestParam String password,
			@RequestParam(required = false) boolean remember,
			HttpSession session, HttpServletRequest request) {
		if (remember) {
			Cookie[] cookies = request.getCookies();
			if (cookies != null) {
				for (int i = 0; i < cookies.length; i++) {
					Cookie c = cookies[i];
					if (c.getName().equals("username")) {
						session.setAttribute("username", c.getValue());
						return new ModelAndView("index");
					}
				}
			}
		}
		User user = userService.getUserByUsername(username);
		ModelAndView result = new ModelAndView("index");
		result.addObject("username", username);
		result.addObject("password", password);
		return result;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView index(HttpSession session, HttpServletRequest request) {

		ModelAndView result = new ModelAndView("index");
		return result;
	}

}
