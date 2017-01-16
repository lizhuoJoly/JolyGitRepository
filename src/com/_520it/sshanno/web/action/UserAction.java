package com._520it.sshanno.web.action;



import java.util.List;

import javax.annotation.Resource;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com._520it.sshanno.domain.User;
import com._520it.sshanno.service.IUserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import lombok.Getter;
import lombok.Setter;

@Controller
@Scope("prototype")
public class UserAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	@Resource
	private IUserService userService;
	@Setter@Getter 
	User user;


	@Action(value="list",results={@Result(name="success", location="/WEB-INF/user/list.jsp")})
	public String list() throws Exception {
		
		List<User> list = userService.list();
		ActionContext.getContext().put("list", list);
		return SUCCESS;
	}
	

	@Action(value="save",results={@Result(name="list", location="list", type="redirectAction")})
	public String save() throws Exception{
		userService.save(user);
		return "list";
		
	}

}
