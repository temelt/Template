package com.ttemplate.views;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="index")
@ViewScoped
public class Index extends BaseView{
	
	private static final long serialVersionUID = -7360095586931514238L;

	private String name;
		
	@PostConstruct
	private void init(){
		System.out.println("Index Managed Bean Created..");
	}
	
	public void helloWorld(){
		System.out.println("Hello World");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
