package com.co.auction.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.co.auction.entity.GoodsInfoEntity;
import com.co.auction.service.TestService;

@Controller
@RequestMapping("/test")  
public class TestController {
	@RequestMapping("/show")  
	public ModelAndView show(){
		
		TestService service = new TestService();
		List<GoodsInfoEntity> list = service.getAll();
		
		ModelAndView view = new ModelAndView();
		view.addObject("result", list);
		view.setViewName("/test");
		
		return view;
	}
	
	/**
	 * 倒计时
	 * @return countdown.jsp
	 */
	@RequestMapping("/time")  
	public ModelAndView time(){
	
		
		ModelAndView view = new ModelAndView();
		view.addObject("initValue", "50");
		view.setViewName("/countdown");
		
		return view;
	}
	
	/**
	 * 生成随机数
	 * @return 随机数
	 */
	@RequestMapping("/random")  
	public ModelAndView random(@RequestParam Map<String,Object> param){
		TestService service = new TestService();
		//生成随机数
		int random = service.getRandom();
		//画面上的拍卖价格
		int randomParam = Integer.parseInt(param.get("random").toString());
		//画面的拍卖价格减随机数
		int initValue = randomParam-random;
		
		ModelAndView view = new ModelAndView();
		view.addObject("initValue",initValue);
		view.setViewName("/countdown");
		
		return view;
	}
}
