package com.doosan.test.prac4;

public class TablePartition {

	public void createHistoryModelingDataPartition(String modelingKey) throws Exception {
		Connection conn = null;
		CallableStatement upperFunc = null;
		try {
			conn = datasource.getConnection();
			conn.setAutoCommit(false);
			upperFunc = conn.prepareCall("{? = call sp_create_history_modeling_data_partition_table( ? ) }");
			upperFunc.registerOutParameter(1, Types.OTHER);
			upperFunc.setString(2, modelingKey);
			upperFunc.execute();
			upperFunc.close();
			conn.commit();
			conn.close();
		} catch (Exception e) {
			logger.error("sp_create_history_modeling_data_partition_table 프로시저 호출 오류");
			e.printStackTrace();
			conn.rollback();
		} finally {
			if (upperFunc != null)
				upperFunc.close();
			if (conn != null)
				conn.close();
		}
	}
	/*
	 * PostgreSQL
	 * CREATE OR REPLACE FUNCTION
	 * public.sp_create_history_modeling_data_partition_table(_modeling_key
	 * character varying) RETURNS void LANGUAGE plpgsql AS $function$
	 * 
	 * declare rtnCnt integer; backup_ts integer; a_modeling_key text;
	 * 
	 * begin
	 * 
	 * a_modeling_key := quote_literal(_modeling_key); select count('a') into rtnCnt
	 * from information_schema.tables a where table_name in
	 * ('history_modeling_data_' || _modeling_key);
	 * 
	 * if rtnCnt = 0 then execute 'create table if not exists
	 * history_modeling_data_' || _modeling_key || ' partition of
	 * history_modeling_data FOR VALUES IN (' || a_modeling_key || ' )'; --execute
	 * 'alter table history_modeling_data_' || _modeling_key || ' add primary key
	 * (pam_mapping_seq, modeling_key, raw_reg_num, pam_tag_mapping_seq)'; execute
	 * 'create table if not exists history_modeling_data_summary_' || _modeling_key
	 * || ' partition of history_modeling_data_summary FOR VALUES IN (' ||
	 * a_modeling_key || ' )'; end if; end; $function$ ;
	 * 
	 */
}
