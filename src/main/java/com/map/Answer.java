package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

    @Entity
    public class Answer
  {
	@Id
	@Column(name="question_Id")
    private int answerId;
    private String answer;
	private Answer answer1;
	
	public Answer() {
		// TODO Auto-generated constructor stub
	}
	
	public Answer(int answerId, String answer, Answer answer1) {
		this.answerId = answerId;
		this.answer = answer;
		this.answer1 = answer1;
	}

	public int getAnswerId()  
	{
		return answerId;
	}

	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Answer getAnswer1() {
		return answer1;
	}

	public void setAnswer1(Answer answer1) {
		this.answer1 = answer1;
	}
	
}
