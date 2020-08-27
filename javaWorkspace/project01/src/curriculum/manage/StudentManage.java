package curriculum.manage;

import java.util.ArrayList;
import java.util.Map;

import curriculum.vo.Curriculum;
import curriculum.vo.Student;

public interface StudentManage {
	void addStudent(int stdid,String name, int age); //�л����
	void addSubjectOfStudent(int stdid,Curriculum curriculum);
	//void registerScore(int stdid,double testScore);	//�������� ���
	
	void registerBigdataScore(int stdid,int testScore,int ptScore); //���� ���(Big data)
	void registerAIScore(int stdid,int testScore,int quizScore,int teamScore); //���� ���(AI)
	//void registerTeamProjectScore(int stdid,double teamScore); //��������Ʈ ���� ���
		
	void StudentTotalScore(/*int stdid*/); //�л��� ���������
	
	Map<Integer, Student> getAllStudent(); //��� �л� ���� ��ȸ
	Map<Integer, Student> getStudentOfClass(int classNumber);//�ݺ� �л� ���� ��ȸ
	
	Student getFirstStudent(int classNumber); //�ݺ� ����
	Student getFirstStudent(); //��ü����
	
	void deleteStudent(int stdId);//�л� ����
	
	void updateStudentScore(int stdId, int testScore); //�������� ����
	void updatePtScore(int stdid,int ptScore); //��ǥ���� ����
	void updateTeamProjectScore(int stdid,int teamScore); //��������Ʈ ���� ����
	void updateQuizScore(int stdid,int quizScore); //�������� ����
	
	Map<Integer, Student> findStudentByScore(int score); //�������� �л�����ȸ
	
	int getAvgScoreOfClass(int classNumber);//�ݺ� ��� ���� ���� ��ȸ
	
	Curriculum getCurriculum(int stdId);
	
}
