///*
//���� Ŭ������ �ν��Ͻ� ����
//	- Ŭ������ �ν��Ͻ� Ȱ��
//*/

///*
//Test101.java �� ����

//[���̵����]
//���α׷��� �����ϴ� Ŭ����

//1. Record Ŭ����
//	- �Ӽ��� �����ϴ� Ŭ������ ������ �� (������ �ִ� Ŭ����)
//*/

//// �л� 1��
public class Record
{
	// �л� �� ���� ǥ���� �� �ִ� �Ӽ���� ����
	//String[] name;
	//int[] kor;
	// �� �̷��� �϶�� �ǹ� �ƴ� 
	//	  (�л� 1���� ���� ���� �̸��� ���� ���� ���������� ���� ����)

	String name;				// �̸�
	int[] score = new int[3];	// int kor, eng, mat
								// score[0] �� ��������
								// score[1] �� ��������
								// score[2] �� ��������

	int total;					// ����
	double avg;					// ���
	
	// �� �Ӽ��� ���ߴٸ� rank�� �غ��ô�
	int rank;					// ����
}