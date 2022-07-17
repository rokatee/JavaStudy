///*
//■■■ 클래스와 인스턴스 ■■■
//	- 클래스와 인스턴스 활용
//*/

///*
//Test101.java 와 연계

//[가이드라인]
//프로그램을 구성하는 클래스

//1. Record 클래스
//	- 속성만 존재하는 클래스로 설계할 것 (변수만 있는 클래스)
//*/

//// 학생 1명
public class Record
{
	// 학생 한 명을 표현할 수 있는 속성들로 구성
	//String[] name;
	//int[] kor;
	// → 이렇게 하라는 의미 아님 
	//	  (학생 1명이 여러 개의 이름과 여러 개의 국어점수가 있진 않음)

	String name;				// 이름
	int[] score = new int[3];	// int kor, eng, mat
								// score[0] → 국어점수
								// score[1] → 영어점수
								// score[2] → 수학점수

	int total;					// 총점
	double avg;					// 평균
	
	// 위 속성을 다했다면 rank도 해봅시다
	int rank;					// 석차
}
