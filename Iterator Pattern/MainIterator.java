package DesignPatterPrakt;

public class MainIterator {
	
	   public static void main(String[] args) {
	      RepositoryNama namaRepo = new RepositoryNama();

	      for(Iterator iter = namaRepo.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      } 	
	   }
	}