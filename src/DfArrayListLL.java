import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class DfArrayListLL {

	/**
	 * @param args
	 */
	public static void main(String... args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> al= new ArrayList<Integer>();
		List<Integer> ll= new LinkedList<Integer>();
		
		
		//intialization of the two list
		int numberRecords=100000;
		System.out.println("insertioin time for "+numberRecords+" records with \narraylist is "+addinList(al,numberRecords)+"\nlinked list is "+addinList(ll,numberRecords));
		System.out.println("you will notice that insertion time is higher in case of linked list becuase it has mantain two ends of the entry, while in arraylist for entry it has to maintain the index of the array only");
		
		// removal from the two list
		int removeRecords=100;
		System.out.println("deletion time for "+removeRecords+" records with \narraylist is "+removefromList(al,removeRecords)+"\nlinked list is "+removefromList(ll,removeRecords));
		System.out.println("you will notice that deletion time is higher in case of Arraly list becuase it has to rearrange the whole array, while in linkedList, there is no rearranging of array");
		
		
		//random access of the two list
		int randomAccessRecords=100;
		System.out.println("random access time for "+randomAccessRecords+" records with \narraylist is "+randomAccessfromList(al,randomAccessRecords)+"\nlinked list is "+randomAccessfromList(ll,randomAccessRecords));
		System.out.println("you will notice that random access time is less in case of Arraly list becuase it is using the array and storing the objects with the index in the array");
		
		
		int updateIndex=100;
		System.out.println("update access time for "+updateIndex+" records with \narraylist is "+updateIndex(al,updateIndex)+"\nlinked list is "+updateIndex(ll,updateIndex));
		System.out.println("you will notice that random access time is less in case of Arraly list becuase it is using the array and storing the objects with the index in the array");

		int search=100;
		System.out.println("search time for "+search+" records with \narraylist is "+contains(al,search)+"\nlinked list is "+contains(ll,search));
		
		//System.out.println(al.get(numberRecords-1));
	}
	
	public static long addinList(List l, int count){
		long start=System.currentTimeMillis();
		for(int i=0;i<count;i++){
			l.add(i);
		}
		return (System.currentTimeMillis()-start);
	}
	public static long removefromList(List l, int count){
		long start=System.currentTimeMillis();
		for(int i=0;i<count;i++){
			l.remove(i);
		}
		return (System.currentTimeMillis()-start);
	}
	public static long randomAccessfromList(List l, int count){
		long start=System.currentTimeMillis();
		int i =l.size()-count-1;
		int m =l.size()-1;
		for(;i<m;i++){
			
			System.out.print(l.get(i)+", ");
			
				l.get(i);
		}
		return (System.currentTimeMillis()-start);
		
	}
	
	public static long updateIndex(List l, int count){
		long start=System.currentTimeMillis();
		for(int i=0;i<count;i++){
			l.set(i,i+100);
		}
		return (System.currentTimeMillis()-start);
	}
	
	public static long contains(List l, int count){
		long start=System.currentTimeMillis();
		for(int i=0;i<count;i++){
			System.out.print(l.contains(i+4000));
		}
		return (System.currentTimeMillis()-start);
	}


}

