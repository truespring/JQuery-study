package com.doosan.test;

public class Sql {

	/*
	 * jpa find �ۼ���
	 * findBy�������̺������÷�And�÷�(�����÷�, �÷�)
	 * findBy�����÷�And�÷�OrderBy�÷�(�����÷�, �÷�)
	 * findOne(pk) -> @Id�� �ް� �ִ� �÷�
	 * 
	 * jpql �ۼ���
	 * @Query("select " +
	 * 			"	a " +
	 * 			" from ��ƼƼ a " +
	 * 			"	left join fetch a.�����÷� b " +
	 * 			"	left join fetch a.�����÷� c " +
	 * 			" where a.�÷� = ���� " +
	 * 			"	and b.�÷� IN :param_1")
	 * ��ƼƼ findBy�÷�(@Param("param_1") Ÿ�� param_1) 
	 * 
	 * jpql�� �˸��ƽ��� �ο����� �÷��̶�� �����ϰ� query���� �ۼ��ϸ� ��
	 */
}
