package jdbc2;

public class MemberVO {

	private String id;
	private String pw;
	private String nickName;

	public MemberVO(String id, String pw, String nickName) {
		this.id = id;
		this.pw = pw;
		this.nickName = nickName;
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getNickName() {
		return nickName;
	}

}
