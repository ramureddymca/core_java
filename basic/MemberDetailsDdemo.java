package basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MemberDetailsDdemo {
	public static void main(String[] args) {

		List<MemberDeatils> mList = Arrays.asList(new MemberDeatils(101, "rak", "SELF", false),
				new MemberDeatils(102, "ram", null, true), 
				new MemberDeatils(103, "rao", null, false));
		
		List<MemberDeatils> mList2 = mList.stream()
				.filter(p -> mList.stream().anyMatch(MemberDeatils::isSpf) && "SELF".equals(p.getMyType()))
				.collect(Collectors.toList());
				
			System.out.println(mList2);
	}
}

class MemberDeatils {
	int id;
	String name;
	String myType;
	boolean isSpf;

	@Override
	public String toString() {
		return "MemberDeatils [id=" + id + ", name=" + name + ", myType=" + myType + ", isSpf=" + isSpf + "]";
	}

	public MemberDeatils(int id, String name, String myType, boolean isSpf) {
		super();
		this.id = id;
		this.name = name;
		this.myType = myType;
		this.isSpf = isSpf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMyType() {
		return myType;
	}

	public void setMyType(String myType) {
		this.myType = myType;
	}

	public boolean isSpf() {
		return isSpf;
	}

	public void setSpf(boolean isSpf) {
		this.isSpf = isSpf;
	}

}