
package examen4tobaco;


public class Examen4tobaco {

    
    public static void main(String[] args) {
        int matriz [][] = { { 10,20,30, 40},{1,2,3,4},{20,21,22,23}};
        int matriz2 [][] = new int [3][4];
        int nume = 2;
        int nume2 = 3;
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz2[nume][nume2] = matriz[i][j];
                nume2--;
                
            }
            nume--;
            nume2 = 3;
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println(matriz2[i][j] + "|");
                
            }
            System.out.println("");
        }
    }
    
}
