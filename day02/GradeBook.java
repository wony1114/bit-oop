package day02;

public class GradeBook {
	int id;
	String name;
	int korean;
	int english;
	int math;
	int sum;
	double average;
	
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	
	int getKorean() {
		return korean;
	}
	void setKorean(int korean) {
		this.korean = korean;
	}
	
	int getEnglish() {
		return english;
	}
	void setEnglish(int english) {
		this.english = english;
	}
	
	int getMath() {
		return math;
	}
	void setMath(int math) {
		this.math = math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAverage() {
		return average;
	}
	public void setAverage(double average) {
		this.average = average;
	}
	
}
