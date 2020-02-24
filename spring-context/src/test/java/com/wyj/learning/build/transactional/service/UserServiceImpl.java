package com.wyj.learning.build.transactional.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author wanyingjing
 * @Create 2020/2/21 2:09 PM
 */
@Service("userService")
public class UserServiceImpl implements UserService {

	private static Map<Integer, String> userMap = null;

	static {
		userMap = new HashMap<>();
		userMap.put(1, "zhangsan");
		userMap.put(2, "lisi");
	}

	@Transactional(propagation = Propagation.REQUIRED)
	@Override
	public void execute(Integer userId, String userName) {
		System.out.println("HashMap中的数据：");
		userMap.keySet().forEach(dbUserId -> {
			System.out.println(dbUserId + "-" + userMap.get(dbUserId));
		});

		System.out.println("==============操作开始");

		try {
			insertData(userId, userName);
			updateData(2, "zhaoli");
			throw new RuntimeException();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("==============操作结束");

			System.out.println("HashMap中的数据：");
			userMap.keySet().forEach(dbUserId -> {
				System.out.println(dbUserId + "-" + userMap.get(dbUserId));
			});
		}
	}

	public void insertData(Integer userId, String userName) {
		userMap.put(userId, userName);
	}

	public void updateData(Integer userId, String userName) {
		userMap.put(userId, userName);
	}
}
