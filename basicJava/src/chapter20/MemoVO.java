package chapter20;

import java.sql.Date;
import java.util.Objects;

//Value Object : 값을 가지고 있는 객체
//DTO(Data Transfer Object) : 데이터전달
//비슷한 용어 ~ Bean, Model, Item

// Object가 필요한 3개의 메소드(toString, hashCode, equals)를 재정의 하도록
// Java Object Specification에 정의되어 있음
public class MemoVO {
	private int id;
	private String title;
	private String content;
	private Date registerDate;
	private Date modifyDate;
	
	public MemoVO() {
	}
	// insert용 생성자 (alt shift s)
	public MemoVO(String title, String content) {
		this.title = title;
		this.content = content;
	}
	//select용 생성자
	public MemoVO(int id, String title, String content, Date registerDate, Date modifyDate) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.registerDate = registerDate;
		this.modifyDate = modifyDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MemoVO other = (MemoVO) obj;
		return id == other.id;
	}
	@Override
	public String toString() {
		return String.format("%d\t%s\t%s\t%s\t%s", id, title, content,registerDate, modifyDate);
	}
		
}
