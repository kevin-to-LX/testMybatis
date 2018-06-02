package sy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sy.model.TrafficEconomyAmapSpeedRawHz;
import sy.service.OtherServiceI;

import java.util.List;

@Controller
@RequestMapping(value = "/")
public class TSSController {
	
	@Autowired
	private OtherServiceI otherService;
	
	@RequestMapping(value="/getOtherList")
	@ResponseBody
	private String getOtherList(){
		TrafficEconomyAmapSpeedRawHz result= otherService.getOterList("4");

		return "hello";
	}
	@RequestMapping(value="/showAlldate")
	/*@ResponseBody*/
	public String showAlldate(Model model){
		List<TrafficEconomyAmapSpeedRawHz> list=otherService.getAll();
		model.addAttribute("list",otherService.getAll());
		return "/jsp/showall";
	}



	@RequestMapping("/edit/{linkId}")
	public String editTrafficDate(@PathVariable String linkId,Model model){
		model.addAttribute("trafficEconomyAmapSpeedRawHz",otherService.getOterList(linkId));
		TrafficEconomyAmapSpeedRawHz result=otherService.getOterList(linkId);
		return "/jsp/edit";
	}
	/*@@RequestMapping("/ed")
	@ResponseBody
	public String edit(){

	}*/
	@RequestMapping(value="/edit",method = RequestMethod.POST)
	/*@ResponseBody*/
	public String editTrafficDate(TrafficEconomyAmapSpeedRawHz trafficEconomyAmapSpeedRawHz,Model model){
		otherService.editTrafficDate(trafficEconomyAmapSpeedRawHz);
		model.addAttribute("list",otherService.getAll());
		return "jsp/showall";
	}

	@RequestMapping(value="/add",method = RequestMethod.POST)
	/*@ResponseBody*/
	public String addTrafficDate(TrafficEconomyAmapSpeedRawHz trafficEconomyAmapSpeedRawHz,Model model){
		otherService.editTrafficDate(trafficEconomyAmapSpeedRawHz);
		model.addAttribute("list",otherService.getAll());
		return "jsp/showall";
	}
}
