package library;


public class User {
	public String name;
	public String call;
	public int age;
	public String loginName;
	public String passWord;
	public String school;
	public String sex;

	public User(String name, String call, int age, String sex,
			String loginname, String password, String school) {

		this.name = name;
		this.call = call;
		this.age = age;
		this.loginName = loginname;
		this.passWord = password;
		this.school = school;
		this.sex = sex;
	}

	public String read() {
		return "��ӭ" + call + "��¼ͼ���\n" + "\n" + "������������\n" + "����:" + name
				+ "\n" + "����:"+ "�Ա�:" +sex + age + "\n" + "ѧУ:" + school;
	}

}
