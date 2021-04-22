package com.doosan.test.prac2;

public class CreateEntity {

	/**
	 * @Entity
	 * @Table(name = "model_master")
	 * public class ModelMaster
	 * 
	 * @Id
	 * @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_model_master")
	 * @SequenceGenerator(name = "seq_model_master", sequenceName="seq_model_master", allocationSize=1)
	 * @Column(name = "model_seq")
	 * private Long modelSeq;
	 * 
	 * @ManyToOne
	 * @JoinColumn(name = "asset_seq")
	 * private AssetMaster assetMaster
	 */
}
