/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        // Your Code Goes here!
        int [] arr = {5, 7, 8, 3, 2, 8, 4, 9};
        
        for(int i = 1; i < arr.length-1; i=i+1){
            System.out.print(arr[i]+" "+arr[i+1]);
        }
        
        for(int i = 0; i < arr.length-1; i=i+1){
            if(arr[i] == arr[i+1]){
                System.out.println("Consct at "+i+"and"+(i+1));
            }
        }
	}
}