//package com.chen.controller;
//
//import com.chen.pojo.Users;
//import com.chen.pojo.vo.UsersVO;
//import com.chen.utils.HttpClientUtil;
//import com.chen.utils.ChenJSONResult;
//import com.chen.utils.JsonUtils;
//import org.springframework.beans.BeanUtils;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.UUID;
//
//@RestController
//public class WXLoginController extends BasicController {
//
//	public UsersVO setUserRedisSessionToken(Users userModel) {
//		String uniqueToken = UUID.randomUUID().toString();
//		redis.set(USER_REDIS_SESSION + ":" + userModel.getId(), uniqueToken, 1000 * 60 * 30);
//
//		UsersVO userVO = new UsersVO();
//		BeanUtils.copyProperties(userModel, userVO);
//		userVO.setUserToken(uniqueToken);
//		return userVO;
//	}
//
//	@PostMapping("/wxLogin")
//	public ChenJSONResult wxLogin(String code) throws Exception {
//
//		System.out.println(code);
//
////		https://api.weixin.qq.com/sns/jscode2session?appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code
//
//		String url = "https://api.weixin.qq.com/sns/jscode2session";
//		Map<String, String> param = new HashMap<>();
//		param.put("appid", "wxa2049f5aead89372");
//		param.put("secret", "0084de7c6e56170b095b575460641b5c");
//		param.put("js_code", code);
//		param.put("grant_type", "authorization_code");
//
//		String wxResult = HttpClientUtil.doGet(url, param);
//		System.out.println(wxResult);
//
//		WXSessionModel model = JsonUtils.jsonToPojo(wxResult, WXSessionModel.class);
//
//		redis.set(USER_REDIS_SESSION + ":" + model.getOpenid(),
//								model.getSession_key(),
//								1000 * 60 * 30);
//
//		return ChenJSONResult.ok();
//	}
//
//}
