class Calculator{
    public int add(int a, int b){
        return a+b;
    }
}   
class Arrays{
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Print the elements of the array
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // 2D Array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("2D Array elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // 3D Array
        int[][][] cube = {
            {
                {1, 2}, 
                {3, 4}
            },
            {
                {5, 6}, 
                {7, 8}
            }
        };  
        System.out.println("3D Array elements:");
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    System.out.print(cube[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        int nums[][]= new int [3][3];

        // Advanced for loop to populate and print the 2D array

        for(int row[]: nums){
            for(int col: row){

                System.out.print((int)(Math.random()*100)+" ");
            }
            System.out.println();
        }

        // Jagged Array
        int jaggedArray[][]= new int[3][];  
        jaggedArray[0]= new int[2];
        jaggedArray[1]= new int[3];     
        jaggedArray[2]= new int[4];
        System.out.println("Jagged Array elements:");
        for(int i=0;i<jaggedArray.length;i++){
            for(int j=0;j<jaggedArray[i].length;j++){
                jaggedArray[i][j]=(int)(Math.random()*50);
                System.out.print(jaggedArray[i][j]+" ");
            }
            System.out.println();
        }

        // Array of Objects
        Calculator calc1 = new Calculator();
        Calculator calc2 = new Calculator();
        Calculator calc3 = new Calculator();
        Calculator calculators[] = new Calculator[3];
        calculators[0]= calc1;
        calculators[1]= calc2;
        calculators[2]= calc3;
        System.out.println("Array of Objects:");
        for(Calculator c: calculators){
            int res= c.add(10, 20);
            System.out.println(res);
        }
        
        // String Array
        String fruits[]= {"Apple", "Banana", "Cherry", "Date"};
        System.out.println("String Array elements:");
        for(String fruit: fruits){
            System.out.println(fruit);
        }
    }
}