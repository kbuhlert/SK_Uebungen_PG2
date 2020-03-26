package UebVonFolien_Array;

public class IdentityMatrix2D {
    public static void main(String[] args) {
        double[][] result = generateIdentityMatrix(8);
        printMatrix(result);
    }

    public static double[][] generateIdentityMatrix(int size){
        double[][] matrix = new double[size][size];
        for(int i=0;i<matrix.length;i++){
            matrix[i][i]=1.0;
        }
        return matrix;
    }

    public static void printMatrix (double[][]arr){
        for(int x=0; x<arr.length;x++){
            for(int y=0; y<arr[x].length;y++){
                System.out.print(arr[x][y] + "\t"); //  "/t" ist ein Tabulator, bewirkt, dass zwischen Werten etwas Abstand ist
            }
            System.out.println();
        }
    }
}
