package kr.or.tech.board.model.vo;

import java.sql.Date;

public class NComment {
	private int commNo; //댓글번호
	private String commCont; //댓글내용
	private Date commDate; //작성일
	private String boardCode; //게시판코드
	private int boardNo; //게시글번호
	private int memberNo; //작성자번호
	private String memberName; //작성자 이름
	public NComment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NComment(int commNo, String commCont, Date commDate, String boardCode, int boardNo, int memberNo,
			String memberName) {
		super();
		this.commNo = commNo;
		this.commCont = commCont;
		this.commDate = commDate;
		this.boardCode = boardCode;
		this.boardNo = boardNo;
		this.memberNo = memberNo;
		this.memberName = memberName;
	}
	public int getCommNo() {
		return commNo;
	}
	public void setCommNo(int commNo) {
		this.commNo = commNo;
	}
	public String getCommCont() {
		return commCont;
	}
	public void setCommCont(String commCont) {
		this.commCont = commCont;
	}
	public Date getCommDate() {
		return commDate;
	}
	public void setCommDate(Date commDate) {
		this.commDate = commDate;
	}
	public String getBoardCode() {
		return boardCode;
	}
	public void setBoardCode(String boardCode) {
		this.boardCode = boardCode;
	}
	public int getBoardNo() {
		return boardNo;
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}	
}
