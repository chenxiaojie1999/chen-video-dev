//package com.chen.controller;
//
//import com.chen.pojo.Users;
//import com.chen.service.crud.UserCRUDService;
//import com.chen.utils.ChenJSONResult;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/crud")
//public class UserCRUDController {
//
//	@Autowired
//	private UserCRUDService userCRUDService;
//
//	@RequestMapping("/save")
//	public ChenJSONResult save() {
//
//		Users user = new Users("1001", "test-saveuser-1001",
//				"123456", "/path", "慕课网", null, null, null);
//		userCRUDService.saveUser(user);
//
//		return ChenJSONResult.ok();
//	}
//
//	@RequestMapping("/update")
//	public ChenJSONResult update() {
//
//		Users user = new Users("1001", "test-saveuser-1111",
//				"77777", "/path000", "慕课网好牛~", null, null, null);
//		userCRUDService.updateUser(user);
//
//		return ChenJSONResult.ok();
//	}
//
//	@RequestMapping("/update2")
//	public ChenJSONResult update2() {
//
//		Users user = new Users("1001", null,
//				"9999", "/path000999", "慕课网好牛十分牛~", null, null, null);
//		userCRUDService.updateUser(user);
//
//		return ChenJSONResult.ok();
//	}
//
//	@RequestMapping("/delUser")
//	public ChenJSONResult delUser() {
//
//		userCRUDService.delete();
//
//		return ChenJSONResult.ok();
//	}
//}
