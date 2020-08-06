package TesTing;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class June13thTasks {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence=scan.nextLine();

		int countJava=0;
		int countPhyton=0;
		boolean result=false;
		for (int i = 0; i <sentence.length()-4; i++) {
			if(sentence.substring(i,i+4).equalsIgnoreCase("java")){
				countJava++;
			}
		}
		for (int i = 0; i <sentence.length()-6 ; i++) {
			if(sentence.substring(i,i+6).equalsIgnoreCase("python")){
				countPhyton++;
			}
		}
		if(countJava==countPhyton){
			result=true;
		}
		System.out.println(result);

    	/*
		int count=0;
        String[] s = {"Java","C#","Phyton","Java"};

		System.out.println("What is the word?");
		String word=scan.nextLine();
		word=word.toLowerCase();
        for(String each:s){
        	if(each.toLowerCase().contains(word)){
        		count++;
			}
		}


		System.out.println("Sentence have "+count+" word");








    	/*
     int [] data= {3,8,10,1,9,14,-3,0,14,207,56,98,12};
     int [] data1={42,37,1,97,1,2,7,42,3,25,89,15,10,29,27};
		System.out.println(longestSortedSequence(data));


	}
	public static int longestSortedSequence(int[]data){
    	int maxcount=0;


			for (int i = 0; i <data.length-1; i++) {
				int count=0;
				if(data[i]<=data[i+1]){
					count++;
				}
				else{
					break;
				}
				if(maxcount<count){
					maxcount=count;
				}
			}


    	return maxcount;
	}


















	public static int priceIsRight(int[]data,int guessed){// write a method called priceIsRight that mimics the guessing
    	                                                  //rules from the game show The price is right.
		                                                  //returns -1 if the bids larger than all if not returns to
		                                                 //closest lower number
    	int temp = Math.abs(guessed-data[0]);
    	int count=0;
        Arrays.sort(data);
        if(guessed>data[data.length-1]){
        	return -1;
		}
		for (int i = 1; i < data.length-1 ; i++) {
			if(temp>Math.abs(guessed-data[i])){
				count=data[i-1];
			}
		}
		return count;
	}









	public static boolean isUnique(int[]data){// question 11 pg 512 write a method that returns boolean if every character is unique

    	for(int each:data){
			int count=0;
    		for(int each1:data){
    			if(each1==each){
    				count++;
				}
			}
    		if(count>1){
    			return false;
			}
		}
    	return true;
	}










	public static double percentageEven(int[]data){ //question 10 pg 512
    	                                            //write a method that returns the percentage of even numbers
    	int count=0;
    	for(int each:data){
    		if(each%2==0){
    			count++;
    		}
		}
    	return (double)((count*100)/data.length);
	}







	public static int minGap(int[]data){//question 10
    	                                //write a method that returns mingap between elements

    	Arrays.sort(data);
		int mingap=data[1]-data[0];
    	if(data.length-1<2){
    		return 0;
		}
		for (int i = 1; i < data.length-2 ; i++) {

			if(mingap>=data[i+1]-data[i]){
				mingap=data[i+1]-data[i];
			}
		}
		return mingap;
	}

	public static int median(int[]data){// question 9
		// write a method that returns the median of the array
		Arrays.sort(data);

		return data[(data.length-1)/2];
	}
	public static int klargerst(int[]data,int k){//Arrays Exercises --page 512 Arrays question 8
    	                                          // Write a program that returns the kth largest element.
    	Arrays.sort(data);                       //sort the array so it is easy to find the max
    	return data[data.length-1-k];            //return the max array -k;
	}
















    	/*
    	Scanner scan = new Scanner(System.in);


     int[][]arr=new int[4][5];
     int sum=1;
		for (int i = 0; i <arr.length ; i++) {

			for (int j = 0; j <arr[i].length ; j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(arr));
		for (int i = 0; i <arr[0].length ; i++) {
			System.out.println(arr[0][i]);
		}
		for (int i = 0; i <arr.length-2 ; i++) {
			System.out.println(arr[i+1][arr.length]);
		}
		for(int i=arr.length;i>=0;i--){
			System.out.println(arr[arr.length-1][i]);
		}
		for (int i = 0; i <arr.length-2 ; i++) {
			System.out.println(arr[arr.length-2-i][0]);
		}
		for (int i = 1; i <arr[1].length-1; i++) {
			System.out.println(arr[1][i]);
		}
		for (int i = arr[2].length-2; i >=1; i--) {
			System.out.println(arr[2][i]);
		}
















 /*

    	String word="";
    	int i=0;
    	int k=0;
    	int count=0;
		System.out.println("How many sentence do you want to enter?");
		i=scan.nextInt();
		String[] arr=new String[i];

		for (int j = 0; j <=arr.length-1; j++) {
			System.out.println("What is the "+(j+1)+". sentence");
			scan.next();
			arr[j]=scan.nextLine();
		}

		System.out.println("What is the word I am looking for?");
    	word=scan.nextLine();


		for (int j = 0; j <arr.length; j++) {
			for (int l = 0; l <arr[j].length()-word.length()+1; l++) {
				if(arr[j].substring(l,l+word.length()).equalsIgnoreCase(word)){
					count++;
				}
			}

		}
		System.out.println(count);






















    	/*
    	int x=10,y=20;
    	int temp=y;
    	y=x;
    	x=y;


    	Scanner scan = new Scanner(System.in);
    	String Sentence=scan.nextLine();
    	String word=scan.nextLine();
    	int count=0;

		for (int i = 0; i <Sentence.length()-word.length()+1 ; i++) {
			if(Sentence.substring(i,word.length()+i).equalsIgnoreCase(word)){
				count++;
			}

		}
		System.out.println(count);


    	/*
		System.out.println(x);
		System.out.println(y);

    	Scanner scan = new Scanner(System.in);
    	int [][] scores=new int[3][];


		for(int i=0;i<scores.length;i++){
			for (int j = 0; j< scores[i].length ; j++) {
				System.out.println("Enter "+(i+1)+". Class "+(j+1)+". Note");
				scores[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<scores.length;i++){
			for (int j = 0; j< scores[i].length ; j++) {
				if(scores[i][j]%5==0||scores[i][j]%3==0){
					System.out.println(scores[i][j]);
				}
			}
		}



*/



    	/*
    	String p=scan.nextLine();
    	int countofPyhton=0;
    	int countofJava=0;

		for (int i = 0; i <=p.length()-4; i++) {
			if(p.substring(i,i+4).equalsIgnoreCase("java")){
				countofJava++;
			}
		}
		for (int i = 0; i <= p.length()-6 ; i++) {
			if(p.substring(i,i+6).equalsIgnoreCase("phyton")){
				countofPyhton++;
			}
		}

		System.out.println(countofJava+" Java");
		System.out.println(countofPyhton+" Pyhton");



*/


	}}
    	/*

		Scanner input = new Scanner(System.in);
		int[] data = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
		int max = data[0];
		int min = data[0];
		System.out.println(standartDe(data));

		for (int each : data) {
			if (each > max) {
				max = each;
			}
			if (each < min) {
				min = each;
			}
		}
		System.out.println("range =" + (max - min + 1));
	}
		public class practice {
			public static int mostOccured(int[] arr) {
				int most = 0;
				int max = 0;

				for (int each : arr) {
					int count = 0;
					for (int i : arr) {
						if (each == i) {
							count++;
						}
					}
					if (count > max) {
						max = count;
						most = each;
					}
				}
				return most;
			}
			public static void main(String[] args) {

				Scanner scan = new Scanner(System.in);
				System.out.println("How many numbers would you like to enter");
				int n = scan.nextInt();
				int[] arr1 = new int[n];
				for (int i = 0; i< arr1.length; i++){
					arr1[i] = scan.nextInt();
				}
				// int[] arr1 = {1, 1, 1, 2, 2, 3, 4, 4, 5, 6, 9, 9, 9, 9, 9};
				System.out.println(mostOccured(arr1));
			}
		}

















        /*
		//Write your code below
		int x=email.indexOf('@');
		if(!(email.contains("@"))||email.indexOf('@')!=email.lastIndexOf('@')){
			System.out.println("Invalid email");
		}
		else {

			System.out.println("Email id:" + email.substring(0, x));
			System.out.println("Email domain:" + email.substring(x, email.length()));
		}
*/















    	/*


		Scanner scan = new Scanner(System.in);
		char start = scan.next().charAt(0);
		char end = scan.next().charAt(0);
		for(char start;start<=end;start++){
			System.out.print(start);
		} */
    	/*
		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;

		System.out.println("Enter Item"+count+" and its price:");
		item=scan.nextLine();
		shoppingListReport+="Item"+count+": "+item;
		price=scan.nextDouble();
		shoppingListReport+=" Price: "+price;
		totalPrice+=price;

		while(10>=count){
			count++;
			System.out.println("Enter Item"+count+" and its price:");
			item=scan.nextLine();
			price=scan.nextDouble();
			shoppingListReport+=", Item"+count+": "+item;
			shoppingListReport+=" Price: "+price;
			totalPrice+=price;
			System.out.println("Add one more item?");
			scan.next();
			countinue=scan.nextLine();
			if(countinue.equalsIgnoreCase("no")){
				break;
			}
			else if(countinue.equalsIgnoreCase("yes")){

				continue;
			}


		}
		System.out.println(shoppingListReport);
		System.out.println("Total price: "+totalPrice);

                   */ /*
            1. Write a program that can return the longest string of text from a String array
            2. Write a program that can return the shortest string of text from a String array


        String [] data = {"Ankara", "Adana","Gaziayintap","Tokaasdasdasdat","Urfa"};
        int max=data[0].length();
        String maxW="";
        String minW="";



        for (int i = 0; i < data.length; i++) {
            if(data[i].length()>max){
                maxW=data[i];
            }
            else   {
                minW=data[i];
            }
           
        }
        System.out.println(maxW);
        System.out.println(minW);

          */


























        /*
         7. write a program that can sort the array in descending order
        ex:
            arr1: { 10, 11, 8, 9, 12, 5, 15};
            output:
                arr2: {15, 12, 11, 10, 9, 8, 5}
            NOTE: at the end, you must have have an array that contains the desending order of the original array

        Scanner scan = new Scanner(System.in);
        int[] data= new int[8];
        int temp=0;
        for (int i = 0; i <data.length ; i++) {
            data[i]=scan.nextInt();
        }
        Arrays.sort(data);
        for (int i = 0; i <data.length/2 ; i++) {
            temp=data[i];
            data[i]=data[data.length-1-i];
            data[data.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(data));
     */
















        /*
         Write a program that will take five Strings and save them into an array called arr. and  Use for loop to print out
         the first three letter of each element of arr, one per line.
         You can assume that every element of arr is at least 3 letters long.
                Example: arr -> ["apple", "banana"]
                        prints:  appban
                        */


































        /*
            4. Write a program that can count the even and odd number from an array of integers


        Scanner scan = new Scanner(System.in);
        int[] data = new int[10];
        int countodds=0,countevens=0;

        for (int i = 0; i < data.length ; i++) {
            data[i]=scan.nextInt();
            if(data[i]%2==0||data[i]==0){
                countevens++;
            }
            else{
                countodds++;
            }
        }
        System.out.println("Given array has "+countevens+" even numbers \n and "+countodds+" odd numbers");
*/




















         /*
         Create an int array called numbers that has length of 100 and Assign 1-100 to each index of the array.
          then print out all the even numbers. MUST use continue statement



        int[] data = new int[100];
        for (int i = 0; i < data.length; i++) {

            data[i]+=i+1;
            if(data[i]%2!=0) {
                continue;
            }
            else{
                System.out.print(data[i]+" ");
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(data));





            */

















        /*
        Write a program that can return the longest and shortest String of text from a String array

        String [] data ={"Cybertek","New York","Chicago","Istanbul","Dubai"};
        int longest=data[0].length();
        int shortest=data[0].length();
        int k=0,j=0;
        int count=0;
        for(String i:data){
            if(i.length()>longest){
                k=count;
            }
            if(i.length()<shortest){
                j=count;
            }

            count++;
        }
        System.out.println(data[k]+" is the longest");
        System.out.println(data[j]+" is the shortest");
        */
		/*
    }
    public static int countInrange(int[]data,int max,int min){
    	int count=0;
		for (int i = 0; i <data.length ; i++) {
			if(data[i]>min&&data[i]<max){
				count++;
			}
		}
		return count;
	}
	public static boolean isSorted(int[]data){
    	boolean result=false;
		for (int i = 0; i < data.length-1; i++){
			if (data[i] <= data[i + 1]) {
				result = true;
			}
			else{
				result=false;
				break;
			}
		}
    	return result;
	}
	/*
	Write a method called mostRepeated that returns the most frequently occurring element of an array of integers.
	 */
		/*
	public static int mostRepeated(int[]data){
    	int result=0;
    	int count=1;
    	int temp=0;
    	int maxRepeated=0;
		for (int i = 0; i < data.length ; i++) {
			count=1;
			for (int j = 0; j < data.length; j++) {
				if (data[i]==data[j]&&j!=i){
					count++;
				}
			}
			if(count>temp){
				result=count;
				temp=count;
			}
		}
		for(int each:data){
			for(int each2:data){
				if(each==each2){
					count++;
				}

			}
			if(count==result){
				maxRepeated=each;
			}
		}
		return maxRepeated;

	}

	public static double standartDe(int[]data){
		double sum=0;
		double result=0;
		for (int i = 0; i < data.length; i++) {
			sum+=data[i];

		}
		sum/=data.length;
		for (int i = 0; i <data.length; i++) {
			result+=Math.pow(data[i]-sum,2);
		}
		result/=data.length-1;
		result=Math.sqrt(result);
		return result;
	}
}*/

