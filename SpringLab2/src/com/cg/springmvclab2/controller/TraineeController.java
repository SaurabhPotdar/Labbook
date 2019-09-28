package com.cg.springmvclab2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.springmvclab2.dto.Trainee;
import com.cg.springmvclab2.exception.MyException;
import com.cg.springmvclab2.service.TraineeService;

public class TraineeController {
	
	@Autowired
	TraineeService traineeService;
	
	@GetMapping
	public String home(Model model){
		model.addAttribute("msg","Trainee Details");
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String loggedIn(Model model,@RequestParam("user")String user,@RequestParam("pwd")String pass){
		if(user.equals("admin")&&pass.equals("admin123"))				
		return "operation";
		else
			return "login";
	}
	
	//Adding
		@RequestMapping(value="/addTrainee",method=RequestMethod.GET)
		public String add(){

				return "addTrainee";
		}
		
		@RequestMapping(value="/add",method=RequestMethod.POST)
		public String addtrainee(Model model,@ModelAttribute("trainee") Trainee trainee) {
		    try {     
		    	traineeService.create(trainee);
		         model.addAttribute("msg","Trainee "+trainee.getTraineeName()+" added successfuly!");
		         model.addAttribute("trainee",new Trainee()); //Empty the form fields on success
		    }
		    catch(Exception e) {
		        model.addAttribute("msg","Trainee with "+trainee.getTraineeId()+" already exists!");
		    }
		         return "addTrainee";
		}
		

		
		
		
		
		
		//Delete Trainee........................................
		@RequestMapping(value="/deletetrainee",method=RequestMethod.GET)
		public String delete(Model model) {
			model.addAttribute("msg"," Delete Trainee");
			return "deletetrainee";
		}
		@RequestMapping(value="/delete",method=RequestMethod.POST)
		public String deleteById(Model model,@RequestParam("deleteId") int id) throws MyException {
			model.addAttribute("list",this.traineeService.find(id));
			return "deletetrainee";
		}
		@RequestMapping(value="/deletetrainee/{id}",method=RequestMethod.POST)
		public String delete(Model model,@PathVariable("id") int id) {
			traineeService.delete(id);
			return "deletetrainee";
		}
		
		//modify trainee..........................................
			@RequestMapping(value="/modifytrainee",method=RequestMethod.GET)
			public String modify(Model model) {
			model.addAttribute("msg"," modify Trainee");
				return "modifytrainee";
			}
			@RequestMapping(value="/modify",method=RequestMethod.POST)
			public String modifyById(Model model,@RequestParam("modifyId") int id) throws MyException {
				model.addAttribute("list",this.traineeService.find(id));
				return "modifytrainee";
			}
			@RequestMapping(value="/modifytrainee",method=RequestMethod.POST)
			public String modify(Model model,@ModelAttribute("trainee") Trainee trainee) {
				traineeService.modify(trainee);
				model.addAttribute("msg","Trainee "+trainee.getTraineeId()+" modified");
				return "modifytrainee";
			}

		//retrieve trainee by id............................
		@RequestMapping(value="/retrievetrainee",method=RequestMethod.GET)
		public String retrieve(Model model) {
			model.addAttribute("msg","Retrieve Trainee");
			return "retrievetrainee";
		}
		@RequestMapping(value="/retrieve",method=RequestMethod.POST)
		public String retrievebyid(Model model,@RequestParam("retrieveId") int id ) throws MyException {
			
			model.addAttribute("list",this.traineeService.find(id));
			
			return "retrievetrainee";
		}
		
		//for retrieving all trainee..................
			@RequestMapping(value="/retrievealltrainee",method=RequestMethod.GET)
			public String retrieveall(Model model) {
				
				model.addAttribute("list", this.traineeService.getAll());
				
				return "retrievealltrainee";
			}

}
