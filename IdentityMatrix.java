// prints the identity matrix of given order 
import java.util.Scanner;
class IdentityMatrix {
    public static void main(String[] arguments){
         Scanner input = new Scanner(System.in);
         System.out.print("Enter the order of the identity matrix: ");
         int order = input.nextInt();
         int[][] iden = new int[order][order];
         for(int i=0; i<order; i++){
             for(int j=0; j<order; j++){
                 if(i==j){
                     iden[i][j]=1;
                 }
             }
         }
         System.out.println("The identity matrix of order "+order+" is:\n");
         for(int i=0; i<order;i++){
             for(int j=0;j<order;j++){
                 System.out.print(iden[i][j]+" ");
             }
             System.out.println("");
         }
         input.close();
    }
