
public class UniqueArray {

	public static void main(String[] args) {
		int [] num= {5,10,5,6,1};
		for(int i=0;i<num.length;i++) {
			int temp=num[i];
			int counter=0;
			for(int j=0;j<num.length;j++) {
				if(num[j]==temp && i!=j) {
					counter++;
					break;
				}
			}
			if(counter==0) {
				System.out.println(temp);
			}
		}
	}

}
