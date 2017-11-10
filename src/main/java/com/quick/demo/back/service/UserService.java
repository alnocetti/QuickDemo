package com.quick.demo.back.service;

import com.quick.demo.db.entity.User;

public interface UserService {

	/**
	 * Gets an id by the nickname
	 * @param userAlias
	 * @param aliasType
	 * @return Integer
	 */
	public Integer getAccountIdByAliasUserAliasType(String userAlias, String aliasType);
	
	/**
	 * search an user by id.
	 * @param id
	 * @return User
	 */
	public User findOne(Long id);
	
	/**
	 * Gets an Accounts by its userAlias and aliasType.
	 * @param userAlias
	 * @param aliasType
	 * @return Integer
	 */
	public User getAccountByAliasUserAliasType(String userAlias, String aliasType);
	
	/**
	 * Gets an Accounts by its userAlias.
	 * @param userAlias
	 * @param aliasType
	 * @return Integer
	 */
	public User getAccountByUserAlias(String userAlias);
	
	/**
	 * Gets availability of user name account.
	 * @param kcUserName
	 * @return Integer 0 is available - 1 is not available.
	 */
	public Integer existNicknameAccount(String kcUserName);
	
	/**
	 * Delete an account by your id.
	 * @param id
	 */
	public void deleteById(Long id);
	
	
	/**
	 * Gets an Accounts Id by its userAlias.
	 * @param userAlias
	 * @param aliasType
	 * @return Integer
	 */
	public Integer getUserIdByNickname(String userAlias);
	
}
