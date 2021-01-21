package kr.ac.study.mvxexam.dto;

public class PlusResult {
	 private int value1;
	 private int value2;
	 private int result;
	 
	public int getValue1() {
		return value1;
	}
	public void setValue1(int value1) {
		this.value1 = value1;
	}
	public int getValue2() {
		return value2;
	}
	public void setValue2(int value2) {
		this.value2 = value2;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	
	@Override
	public String toString() {
		return "PlusResult [value1=" + value1 + ", value2=" + value2 + ", result=" + result + "]";
	}
}
