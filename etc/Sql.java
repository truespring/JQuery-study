package com.doosan.test;

public class Sql {

	/*
	 * jpa find 작성법
	 * findBy조인테이블조인컬럼And컬럼(조인컬럼, 컬럼)
	 * findBy조인컬럼And컬럼OrderBy컬럼(조인컬럼, 컬럼)
	 * findOne(pk) -> @Id를 달고 있는 컬럼
	 * 
	 * jpql 작성법
	 * @Query("select " +
	 * 			"	a " +
	 * 			" from 엔티티 a " +
	 * 			"	left join fetch a.조인컬럼 b " +
	 * 			"	left join fetch a.조인컬렁 c " +
	 * 			" where a.컬럼 = 조건 " +
	 * 			"	and b.컬럼 IN :param_1")
	 * 엔티티 findBy컬럼(@Param("param_1") 타입 param_1) 
	 * 
	 * jpql은 알리아스를 부여받은 컬럼이라고 생각하고 query문을 작성하면 됨
	 */
}
