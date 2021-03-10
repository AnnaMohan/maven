package ourapp.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class SubtractionContoller {

		@RequestMapping(value="/sub")
		//if you forget to mention ModelAndView in method declaration
		//then 500-internal server raises
		public ModelAndView sub(HttpServletRequest request,HttpServletResponse response) {
			ModelAndView mv =new ModelAndView();

			int a=Integer.parseInt(request.getParameter("t1"));
			int b=Integer.parseInt(request.getParameter("t2"));
			int c=a-b;
			mv.setViewName("sub-result");
			mv.addObject("result",c);
			return mv;
		}
	
}
