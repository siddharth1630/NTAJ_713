package com.nt.beans;

public class TestBean {
	private int x,y;

	private TestBean(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "TestBean [x=" + x + ", y=" + y + "]";
	}
	
	private static class InnerBean{
		private int x;

		public void setX(int x) {
			this.x = x;
		}

		@Override
		public String toString() {
			return "InnerBean [x=" + x + "]";
		}
		
		
		
	}

}
