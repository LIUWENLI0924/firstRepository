package com.cssl.dao;

import com.cssl.pojo.Users;

/**
 * 
 * @author tym
 *
 */
public interface UsersDao {
	
	
	public int insert(Users user);
	
	public Users selectByName(String username);
	
	public int delete(int id);
	

}
