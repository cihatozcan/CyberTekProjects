package arrayListCh7;

public class randomlist {
    public static void main(String[] args) {
        int[] sampleArray= new int[10];
        for(int i=0;i<sampleArray.length;i++){
            sampleArray[i]=(int) (Math.random()*100);
        }
        for(int i=0;i<sampleArray.length;i++){
            System.out.print("cCc"+sampleArray[i]+"cCc");
        }
        System.out.println();
    }
}
