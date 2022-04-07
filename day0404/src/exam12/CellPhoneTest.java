package exam12;

public class CellPhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CellPhone phone = new CellPhone("∞∂∑∞Ω√ ≥Î∆Æ 10+","ªÔº∫","Black");
		
		phone.turnPower();
		System.out.println(phone.isPower());
		System.out.println(phone.getModelName());
		System.out.println(phone.getCompany());
		System.out.println(phone.getColor());
	}

}
