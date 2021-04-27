package com.doosan.test.prac3;

public class BuilderTest {
	/**
	 * ��ũ : https://logical-code.tistory.com/16 �����ڿ� ���� ����
	 */
	public static void main(String[] args) {
		NutritionFact cocaCola = new NutritionFact
				.Builder(240, 8)
				.calories(100)
				.sodium(35)
				.carbohydrate(27)
				.build();
		cocaCola.setVariable(12);
	}
}

@SuppressWarnings("unused")
class NutritionFact {
	private final int SERVING_SIZE;
	private final int SERVINGS;
	private final int CALORIES;
	private final int FAT;
	private final int SODIUM;
	private final int CARBOHYDRATE;
	private int variable;

	public int getVariable() {
		return variable;
	}

	public void setVariable(int variable) {
		this.variable = variable;
	}

	public static class Builder {
		// �ʼ� ����
		private final int SERVING_SIZE;
		private final int SERVINGS;
		// ������ ����
		private int CALORIES = 0;
		private int FAT = 0;
		private int SODIUM = 0;
		private int CARBOHYDRATE = 0;

		// �ʼ� ���ڸ� ���� ������
		public Builder(int servingSize, int servings) {
			this.SERVING_SIZE = servingSize;
			this.SERVINGS = servings;
		}

		public Builder calories(int val) {
			CALORIES = val;
			return this;
		}

		public Builder fat(int val) {
			FAT = val;
			return this;
		}

		public Builder carbohydrate(int val) {
			CARBOHYDRATE = val;
			return this;
		}

		public Builder sodium(int val) {
			SODIUM = val;
			return this;
		}

		public NutritionFact build() {
			return new NutritionFact(this);
		}

	}

	private NutritionFact(Builder builder) {
		SERVING_SIZE = builder.SERVING_SIZE;
		SERVINGS = builder.SERVINGS;
		CALORIES = builder.CALORIES;
		FAT = builder.FAT;
		SODIUM = builder.SODIUM;
		CARBOHYDRATE = builder.CARBOHYDRATE;
	}

}
