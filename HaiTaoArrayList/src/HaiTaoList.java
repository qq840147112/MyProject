
public class HaiTaoList {
	Object [] ob = new Object[0];
	int size =0;
	
	public void add(Object ele){
		
		if(size==ob.length){
			Object[] newArray = new Object[size+1];
			System.arraycopy(ob, 0, newArray, 0, ob.length);
			ob = newArray;
		}	
		ob[size++]=ele;
	}
	
	
	public Object get(int index){
		if(index<0 || index>=ob.length){
			return "get方法给值有问题 ,可能是越界或者是下标小于0!";
		}else{
			return ob[index];
		}
	}
	
	public void remove(int index){
		int sm = size-index-1;
		if(index >= 0){
			System.arraycopy(ob,0,ob,0,sm);
			ob[--size]=null;
		}
		else{
			System.out.println("remove方法给值有问题 ,可能是越界或者是下标小于0!");
		}
	}
	
	public void set(int index,Object ele){
		if(index > 0 && index < size){
			ob[index] = ele;
		}else{
			System.out.println("set方法给值有问题 ,可能是越界或者是下标小于0!");
		}
	}
}
