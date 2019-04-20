package com.platform.risk.utils;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SignUtils {

	/**
	 * 加签名
	 * 
	 * @param parameters
	 * @param key
	 * @return
	 */
	public static String createSign(Map<String, Object> parameters, String key) {
		StringBuffer sb = new StringBuffer();
		SortedMap<String, Object> sort = new TreeMap<>(parameters);
		Set es = sort.entrySet();
		Iterator it = es.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			String k = (String) entry.getKey();
			Object v = entry.getValue();
			if (null != v && !"".equals(v) && !"sign".equals(k) && !"key".equals(k)) {
				sb.append(k + "=" + v + "&");
			}
		}
		String str = sb.toString().substring(0, sb.toString().length() - 1) + key;
		System.out.println("签名字字符串:str=" + str);
		String sign = null;
		try {
			sign = MD5Utils.md5(str, key);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sign;
	}
}
