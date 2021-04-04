package com.siri.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Scope("request")
@Controller
public class RequestScopeBean {
	private String name = "request scope'";


 
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@RequestMapping("/rs")
	 @ResponseBody
	 public String sendName() {
		this.setName("set by Me Request scope");
		return this.getName();
	}
	@RequestMapping("/rsc")
	 @ResponseBody
	 public String check() {
		
		return this.getName();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RequestScopeBean other = (RequestScopeBean) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	

}

