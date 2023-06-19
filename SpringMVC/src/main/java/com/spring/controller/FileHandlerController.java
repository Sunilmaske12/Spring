package com.spring.controller;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileHandlerController {
	
	@RequestMapping("/file")
	public String showForm() {
		return "fileHandling";
	}

	@RequestMapping(path="/uploadImage",    method = RequestMethod.POST)
	public String uploadImage(@RequestParam("image") CommonsMultipartFile file, HttpSession session, Model model) {
		System.out.println(file);
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		byte[] data = file.getBytes();
		//save file on server: WEBINF/resources/images folder
		String path = session.getServletContext().getRealPath("/WEB-INF/resources/images/")+file.getOriginalFilename();
		try {
		FileOutputStream fos = new FileOutputStream(path);
		fos.write(data);
		fos.close();
		System.out.println("file uploaded");
		System.out.println(path);
		model.addAttribute("image", file.getOriginalFilename());
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		return "showFile";
	}
}
