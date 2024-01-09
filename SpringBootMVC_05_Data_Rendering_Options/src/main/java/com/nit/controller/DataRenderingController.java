package com.nit.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DataRenderingController {
	
	//http://localhost:2525/SpringBootMVC_05_Data_Rendering_Options/process
	//Best way represent shared Memory becoz it makes the code non-invasive
	
	/*@RequestMapping("/process")
	public String showHome(Map<String, Object> map) {
		System.out.println("DataRenderingController.showHome()"+map.getClass());
		// add model attribute to shared memory
		map.put("attr1", "val1");
		map.put("sysdt", LocalDateTime.now());
		//return LVN
		return "show_data";
	}*/
	/*@RequestMapping("/process")
	public String showHome(Model model) {
		System.out.println("DataRenderingController.showHome()"+model.getClass());
		// add model attribute to shared memory
		model.addAttribute("atr1","val1");
		model.addAttribute("sysdt",LocalDateTime.now());
		
		return "show_data";
	}*/
	/*@RequestMapping("/process")
	public String showHome(ModelMap mmap) {
		System.out.println("DataRenderingController.showHome()"+mmap.getClass());
		// add model attribute to shared memory
		mmap.addAttribute("attr1", "val1");
		mmap.addAttribute("sysdt",LocalDateTime.now());
		return "show_data";
	}*/
	/*@RequestMapping("/process")
	public Model showHome() {
		Model mod=new BindingAwareModelMap();
		System.out.println("DataRenderingController.showHome()"+mod.getClass());
		// add model attribute to shared memory
		mod.addAttribute("attr1", "val1");
		mod.addAttribute("sysdt",LocalDateTime.now());
		return mod;
	}*/
	/*@RequestMapping("/process")
	public Map<String,Object> showHome() {
		Map<String,Object>  map=new HashMap();
		System.out.println("DataRenderingController.showHome()"+map.getClass());
		// add model attribute to shared memory
		map.put("attr1", "val1");
		map.put("sysdt",LocalDateTime.now());
		return map;
	}*/
	
	/*@RequestMapping("/process")
	public ModelAndView process() {
		//create shared memory
		ModelAndView mav= new ModelAndView();
		//add model attribut to shared memory
		mav.addObject("attr1","val1");
		mav.addObject("sysdt",LocalDateTime.now());
		mav.setViewName("show_data");
		return mav; 
	}*/
	
	//What happens if return type is handler method is void
	//it takes  "process" (request path is logical view name
	/*@RequestMapping("/process")
	public void process(Map<String,Object> map) {
		//add model attribut to shared memory
		map.put("attr1","val1");
		map.put("sysdt",LocalDateTime.now());
	}*/
	
	//What happens handler method return null
	//it takes  "process" (request path is logical view name
	/*@RequestMapping("/process")
	public String process(Map<String,Object> map) {
		//add model attribut to shared memory
		map.put("attr1","val1");
		map.put("sysdt",LocalDateTime.now());
		return null;
	}*/
	//How can we forwoard the request from one handler method to another handler method
	//This called handler method chaining i.e the request given to one handler methos will communicate another handler method
	/*@RequestMapping("/process")
	public String process() {
		System.out.println("DataRenderingController.process()");
		return "forward:report";
	}*/
	//Redirect
	@RequestMapping("/process")
	public String process() {
		System.out.println("DataRenderingController.process()");
		return "redirect:report";
	}
	@RequestMapping("/report")
	public String showReport() {
		System.out.println("DataRenderingController.process()");
		return "show_data";
	}
	
}

