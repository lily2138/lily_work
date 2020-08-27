package curriculum.vo;

public class Curriculum {
	private int currId;
	private String currName;
	private String currTeacher;
	private int testScore;
	private int totalScore;
	
	public Curriculum(int currId, String currName, String currTeacher, int testScore, int totalScore) {
		super();
		this.currId = currId;
		this.currName = currName;
		this.currTeacher = currTeacher;
		this.testScore = testScore;
		this.totalScore = totalScore;
	}
	
	public int getCurrId() {
		return currId;
	}
	public void setCurrId(int currId) {
		this.currId = currId;
	}
	public String getCurrName() {
		return currName;
	}
	public void setCurrName(String currName) {
		this.currName = currName;
	}
	public String getCurrTeacher() {
		return currTeacher;
	}
	public void setCurrTeacher(String currTeacher) {
		this.currTeacher = currTeacher;
	}
	public int getTestScore() {
		return testScore;
	}
	public void setTestScore(int testScore) {
		this.testScore = testScore;
	}
	public int getTotalScore() {
		return totalScore;
	}
	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}
	
	public String toString() {
		return "\n-----���� ����-----\n����ID: "+currId+"\t\t������: "+currName+"\t\t�����: "+currTeacher+"\n��������: "+testScore;//**********************
	}
	
}
