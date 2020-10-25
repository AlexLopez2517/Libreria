/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingmatriz;


import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class Eficiencia12 {
    
 int matriz[][], matriz2[][], nFilas, nCol, sumaFilas, sumaCol;
 boolean simetrica = true;
 int restaFila, restaCol;
 int matrizOne [][] = new int[3][3];
 
 
  public int[][] crearMatriz(){
        
        Scanner entrada = new Scanner(System.in);
        //Para que escriba la matriz
 
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Por favor, coloque el número de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Por favor, coloque el número de columnas: "));
        
        matriz = new int [nFilas] [nCol];//define el tamaño de matriz
        
        System.out.println("Sea tan amable de llenar la matriz");//Rellenar jeje
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nCol;j++){
                System.out.println("Matriz ["+i+"]["+j+"]");
                matriz[i][j] = entrada.nextInt();//Para que los guarde
               
            }
        }
     return null;
     
   }
  
  public int[][] crearMatriz2(){
        
        Scanner entrada = new Scanner(System.in);
        //Para que escriba la matriz
 
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Por favor, coloque el número de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Por favor, coloque el número de columnas: "));
        
        matriz2 = new int [nFilas] [nCol];//define el tamaño de matriz
        
        System.out.println("Sea tan amable de llenar la matriz");//Rellenar jeje
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nCol;j++){
                System.out.println("Matriz2 ["+i+"]["+j+"]");
                matriz2[i][j] = entrada.nextInt();//Para que los guarde
               
            }
        }
     return null;
     
   }
   
  public boolean SimetricaNo(){
         
          
       if(nFilas == nCol){//si es cuadrada o no
        int i,j;
          i=0;
           while(i<nFilas && simetrica==true){//Un while para el boolean, aqui hace su comprobación.
              j=0;
           while(j<i && simetrica==true){
             if(matriz[i][j]!= matriz [j][i]){ //Aqui se comprueba si las filas y las columnas siguen siendo las mismas
             simetrica = false;
                   }
                   j++;
               }
               i++;
              }
          
}
     
                
     if(simetrica==true){
            JOptionPane.showMessageDialog(null, "Correccto, la matriz es simétrica");
                    }
            else{
            JOptionPane.showMessageDialog(null, "Lo siento, la matriz no es simétrica");
            }
       
     return false;
}
  
  public void imprimirMatriz(){
    System.out.println("LA PRIMER MATRIZ ES: ");
     System.out.println(""); 
    for (int i=0; i<matriz.length; i++){
        for(int j=0; j<matriz[i].length; j++)
            System.out.print(matriz[i][j]+ " ");
             System.out.println(""); 
    }
    
}
  
   public void imprimirMatriz2(){
    System.out.println("LA SEGUNDA MATRIZ ES: ");
     System.out.println(""); 
    for (int i=0; i<matriz2.length; i++){
        for(int j=0; j<matriz2[i].length; j++)
            System.out.print(matriz2[i][j]+ " ");
             System.out.println(" "); 
    }
    
}
 
  public int transpuesta(){
int aux;
for(int i=0; i<nFilas; i++){
            for(int j=0; j<nCol;j++){
               aux = matriz[i][j];
               matriz[i][j] = matriz [j][i];
               matriz [j][i] = aux;
            }
}

    System.out.println("LA MATRIZ TRANSPUESTA ES: ");
    for(int i=0; i<nFilas; i++){
            for(int j=0; j<nCol;j++){ 
                System.out.println(matriz[i][j]+" ");
               
            }
}
     
     return 0;

}

  public int sumaMFila(){
    for(int i=0; i<nFilas; i++){
            for(int j=0; j<nCol;j++){
            }
    System.out.println("");
}
  for(int i=0;i<nFilas;i++){
  sumaFilas = 0;
  for(int j=0;j<nCol;j++){
  sumaFilas+= matriz[i][j];
  }
      System.out.println("LA SUMA DE LA FILA["+i+"] ES: "+sumaFilas);
  }
    System.out.println("");
   return 0; 
}

  public int sumaMCol(){
    for(int j=0; j<nCol; j++){
    sumaCol=0;
    for(int i=0; i<nFilas; i++){
    sumaCol += matriz[i][j];
    }
        System.out.println("LA SUMA DE COLUMNA["+j+"] ES: "+sumaCol);
    }
    System.out.println("");
     return 0;
}
 
  public int restaFila(){
    for(int i=0; i<nFilas; i++){
            for(int j=0; j<nCol;j++){
            }
    System.out.println("");
}
  for(int i=0;i<nFilas;i++){
  restaFila = 0;
  for(int j=0;j<nCol;j++){
  restaFila -= matriz[i][j];
  }
      System.out.println("LA RESTA DE LA FILA["+i+"] ES: "+restaFila);
  }
    System.out.println("");
   return 0; 
}
  
  public int restaCol(){
    for(int i=0; i<nFilas; i++){
            for(int j=0; j<nCol;j++){
            }
    System.out.println("");
}
  for(int i=0;i<nFilas;i++){
  restaCol = 0;
  for(int j=0;j<nCol;j++){
  restaCol -= matriz[i][j];
  }
      System.out.println("LA RESTA DE LA COLUMNA["+i+"] ES: "+restaCol);
  }
    System.out.println("");
   return 0; 
}

 public int[][] mulM () {
      int[][] matrizRes = new int[matriz.length][matriz2[0].length];
      
      for (int i= 0; i<matrizRes.length; i++)
          for (int j=0; j<matrizRes[0].length; j++)
              for (int k=0; k<matriz2.length; k++)
                  matrizRes[i][j] = matrizRes[i][j] + matriz[i][k] * matriz2[k][j];
                  System.out.println("LA RESPUESTA ES: " + Arrays.deepToString(matrizRes));
                  System.out.println(" ");
      
      return matrizRes;
   }
 
public int[][] crearAle(){
     
           
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
        matrizOne[i][j] = (int)(Math.random()*5);
        }
        }
        return null;
}

 public void impMatAle(){
    System.out.println("LA MATRIZ ES: ");
     System.out.println(""); 
    for (int i=0; i<matrizOne.length; i++){
        for(int j=0; j<matrizOne[i].length; j++)
            System.out.print(matrizOne[i][j]+ " ");
             System.out.println(" "); 
    }
    
}

  
}
              
        
              
