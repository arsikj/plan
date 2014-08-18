package mk.ukim.finki.mp.plan.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import mk.ukim.finki.mp.plan.model.User;
import mk.ukim.finki.mp.plan.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
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
		// ModelAndView result = initView(session, "login");
		ModelAndView result = new ModelAndView("login");
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
						// return initView(session, "index");
						return new ModelAndView("home");
					}
				}
			}
		}
		User user = userService.getUserByUsername(username);
		ModelAndView result;
		if (user != null) {
			// ModelAndView result = initView(session, "index");
			result = new ModelAndView("home");
			result.addObject("username", username);
			result.addObject("password", password);
		} else {
			String message = "Sorry, the username and password you entered do not match. Please try again.";
			result = new ModelAndView("login");
			result.addObject("message", message);
		}
		return result;
	}

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView index(HttpSession session, HttpServletRequest request) {

		ModelAndView result = new ModelAndView("index");
		return result;
	}

	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public ModelAndView logout(HttpSession session, HttpServletRequest request) {

		request.getSession().invalidate();
		ModelAndView result = new ModelAndView("login");
		return result;
	}

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public ModelAndView signup(HttpSession session, HttpServletRequest request) {
		ModelAndView result = new ModelAndView("signup");
		result.addObject("user", new User());
		return result;
	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public ModelAndView signupPost(@ModelAttribute User user,
			HttpSession session, HttpServletRequest request) {

		User u = userService.getUserByUsername(user.username);
		ModelAndView result;
		if (u != null) {
			// ModelAndView result = initView(session, "index");
			result = new ModelAndView("signup");
			String message = "Sorry, the username already exists. Please try again.";
			result.addObject("message", message);
		} else {
			userService.addUser(user);
			result = new ModelAndView("login");
			String message = "New user successfully created. Please login";
			result.addObject("message", message);
		}
		return result;
	}

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public ModelAndView contact(HttpSession session, HttpServletRequest request) {

		ModelAndView result = new ModelAndView("contact");
		return result;
	}

	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	public ModelAndView sendEmail(HttpSession session,
			HttpServletRequest request) {

		ModelAndView result = new ModelAndView("home");
		return result;
	}

	private ModelAndView initView(HttpSession session, String view) {
		ModelAndView v = new ModelAndView("main");
		if (session.getAttribute("username") == null) {
			v.addObject("login");
		} else {
			v.addObject("include_view", view);
		}
		return v;
	}
}
