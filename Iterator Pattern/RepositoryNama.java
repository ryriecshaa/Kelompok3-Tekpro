package DesignPatterPrakt;

public class RepositoryNama implements Container {
	   public String names[] = {"Taufiqurrahman" , "Ihsan" ,"Hasanah" , "Ryrie", "Zahwa"};

	   @Override
	   public Iterator getIterator() {
	      return new NameIterator();
	   }

	   private class NameIterator implements Iterator {

	      int index;

	      @Override
	      public boolean hasNext() {
	      
	         if(index < names.length){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	      
	         if(this.hasNext()){
	            return names[index++];
	         }
	         return null;
	      }		
	   }
	}