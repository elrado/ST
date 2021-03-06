/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.comtrade.st;

import java.security.MessageDigest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 *
 * @author radoo
 */
@Configuration
public class Config {
	private PropertyEditorBean propertyEditorBean;

	@Bean
	public MessageDigestFactoryBean digestFactory(){
		MessageDigestFactoryBean d1 = new MessageDigestFactoryBean();
		d1.setAlghoritmName("SHA1");
		return d1;
	}

	@Bean
	public MessageDigest digest1 () throws Exception {
		return digestFactory().getObject();
	}

	@Bean
	public PropertyEditorBean builtInSample (){
		return propertyEditorBean;
	}

	@Autowired
	public void setPropertyEditorBean(PropertyEditorBean propertyEditorBean) {
		this.propertyEditorBean = propertyEditorBean;
	}
}
