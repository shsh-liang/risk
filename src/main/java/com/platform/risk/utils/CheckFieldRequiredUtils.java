package com.platform.risk.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import com.platform.risk.annotation.FieldRequired;
import com.platform.risk.dto.req.BaseReq;

public class CheckFieldRequiredUtils {

	public static String checkRequestParamRequired(BaseReq req) {
		StringBuilder sb = new StringBuilder();
		Object obj = req.getData();
		Method[] methods = obj.getClass().getDeclaredMethods();
		List<Method> getterMethods = new ArrayList<Method>();
		for (Method method : methods) {
			if (method.getName().contains("get") && method.isAnnotationPresent(FieldRequired.class)) { // 过滤方法，只获取FieldRequired注解的get方法
				getterMethods.add(method);
			}
		}
		if (getterMethods.size() > 0) {
			Object objValue = null;
			for (Method method : getterMethods) {
				try {
					objValue = method.invoke(obj);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (null == objValue) {
					sb.append(method.getAnnotation(FieldRequired.class).value());
				}
			}
		}
		return sb.toString();
	}
}
