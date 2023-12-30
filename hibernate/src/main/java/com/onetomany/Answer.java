package com.onetomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(name = "answerOneToMany")
@Table(name = "answer_table_one_to_many")
public class Answer {

	@Id
	@Column(name = "answer_id")
	private int answerID;
	
	@Column(name = "answer")
	private String answer;
	
	@ManyToOne
	@JoinColumn(name = "question_id")
	private Question question;

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answer(int answerID, String answer) {
		super();
		this.answerID = answerID;
		this.answer = answer;
	}

	public Answer(int answerID, String answer, Question question) {
		super();
		this.answerID = answerID;
		this.answer = answer;
		this.question = question;
	}

	public int getAnswerID() {
		return answerID;
	}

	public void setAnswerID(int answerID) {
		this.answerID = answerID;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Answer [answerID=" + answerID + ", answer=" + answer + ", question=" + question + "]";
	}
	
}
