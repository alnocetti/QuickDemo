package com.quick.demo.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.quick.demo.db.entity.User;

/**
 * 
 * @author huicha
 */
@Repository
@Transactional
public interface UserRepository  extends JpaRepository<User, Long>{

	/**
	 * Gets the availability of an user alias.
	 * @param userAlias
	 * @param aliasType
	 * @param accId
	 * @return Integer 0 is available - 1 is not available.
	 */
	@Query("SELECT count(*) FROM Accounts A "
			+ " JOIN A.accountAliaseses AA"
			+ " JOIN AA.userAliasTypes UAT"
			+ " WHERE (UAT.code) = (:typeCode) "
			+ " AND (AA.userAlias) = (:userAlias)")
	public Integer countUserAliasAliasType(@Param("userAlias")String userAlias, @Param("typeCode")String typeCode);
	
	/**
	 * return value:
	 * <br> &#62; 0 when exist the userAlias.
	 * <br> = 0 when not exist the userAlias.
	 * <br> allways shoulds return 1 as max value.
	 * @param userAlias
	 * @return
	 */
	@Query(value = "SELECT COUNT(*) FROM account_aliases WHERE (user_alias)= (?1)", nativeQuery = true)
	public Long existUser(String userAlias);
	
	
	@Query("DELETE FROM AccountAliases A "
			+ " WHERE (A.accounts.id) = (:accountId) ")
	public void deleteByAccountId(@Param("accountId") Integer accountId);
	
	
	@Query(value="DELETE FROM AccountAliases A "
			+ " WHERE (A.accounts.id) = ?1 ", nativeQuery = true)
	public void nativeDeleteByAccountId(Integer accountId);
	
	
	/**
	 * Gets an accountId from the User Alias. 
	 * @param userAlias
	 * @return
	 */
	@Query(value = "SELECT AA.account_id "
			+ " FROM account_aliases AA"
			+ " WHERE (user_alias)= (?1)", nativeQuery = true)
	public Integer getAccountIdByUserAlias(String userAlias);
	
}
