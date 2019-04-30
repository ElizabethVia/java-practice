import java.util.Arrays;

public class PrintNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]= {"anna","jhon","katy","johann","Angie","Andrey","Karina","Giovanny","Loren","James"};
		//print number of names in the array
		System.out.println(names.length);
		System.out.println(Arrays.toString(names));//[anna, jhon, katy, johann, Angie, Andrey, Karina, Giovanny, Loren, James]
		for(int i =0; i<names.length;i+=2) {
			System.out.println(names[i]+", "+names[i+1]);
		}
			//anna, jhon
			/*katy, johann
			Angie, Andrey
			Karina, Giovanny
			Loren, James

		}*/
		System.out.println("########females names#########");
		for(int i =0;i<names.length;i+=2) {
			System.out.println(names[i]+", ");
		}
		System.out.println("######## male names ###############");
		for(int i=0;i<names.length;i++) {
			if(i%2!=0) {
				if(i==names.length-1) {
					System.out.println(names[i]);
				}else {
					System.out.println(names[i]+", ");
				}
			}
		}
		//swap seats
		System.out.println(Arrays.toString(names));
		for(int i=0;i<names.length;i+=2) {
			String temp=names[i];
			names[i]=names [i+1];
			names[i+1]=temp;
		}
		System.out.println(Arrays.toString(names));
		}

	}


