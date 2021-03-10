package ourapp.controller;

import javax.annotation.processing.SupportedAnnotationTypes;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.View;
import javax.xml.ws.spi.WebServiceFeatureAnnotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdditonController {

	@RequestMapping(value="/add") //here this add is dispalyed on the url
	//to get the data from the UI.
	public ModelAndView getAdditionResult(HttpServletRequest request,HttpServletResponse response){
		ModelAndView mv =new ModelAndView();
		
		int a=Integer.parseInt(request.getParameter("t1"));
		int b=Integer.parseInt(request.getParameter("t2"));
		int c=a+b;
		//try to ship the result 'c' from here to dispatcher servlet class
		// using model and view class
		//this attribute name in mv.addobject method should be same as in add-result.jsp 
		//get attribute method.
		mv.addObject("result", c);
		//passing ViewName as a parameter
		mv.setViewName("add-result");
		//add-result.jsp in webapp folder not in web-inf.
		return mv; //sending computed data to nextUI i.e addresultwebpage
	
	}
	

	

}
