package com.doosan.test.prac;

public class JPQL {

	/**
	 * JPQL 작성법
	 * JPQL의 특징은 테이블을 기반한 컬럼명을 쓰는 것이 아니라 entity 클래스에서 작성된 명칭을 기반으로 한다.
	 * 특히 조인을 걸어 데이터에 접근할 때 편리하다
	 * @Query( " select a.column " +
	 * 				" , a.column " +
	 * 			" from entity a " +
	 * 			" where a.column = :column "
	 * List<Object[]> findselectcolumnBywherecolumn(@Param("wherecolumn") type wherecolumn);
	 * 
	 */
}
