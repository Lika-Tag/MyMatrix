public class MyMatrix_Init {
	public static void main(String[] args) {
		int[] iInput1 = {3,4,2,4,1,0,-5,8,1,-3,5,-1,0,2,0,-2};
		int[] iInput2 = {4,2,-2,0,0,-4,-1,4,3,2,-1,1,1,0};
		int[] iInput3 = {3,3, 4,2,-2,0,0,-4,-1,4,3,2,-1,1,1,0};
		int[] iInput4 = {3,4,-3,8,3,-6,4,4,2,-2,-1,6,-4,2,4,-2};
		int[] iInput5 = {4,4, 3,4,-2,7,1,-1,3,-5,-4,9,-3,4,6,-2,-6,2,3,-8,1,-1,-1,1};
		int[] iInput6 = {3,2, 0,0,0,0};

		int i,j,k;
		if (iInput1[1] > iInput2[0] ) iInput1[1] = iInput2[0] ; 
		if (iInput2[0] > iInput1[1] ) iInput2[0] = iInput1[1] ; 
		MyMatrix mymatrix1 = new MyMatrix(iInput1);
		MyMatrix mymatrix2 = new MyMatrix(iInput2);
		MyMatrix mymatrix3 = new MyMatrix(iInput3);
		MyMatrix mymatrix4 = new MyMatrix(iInput4);
		MyMatrix mymatrix5 = new MyMatrix(iInput5);
		MyMatrix mymatrix6 = new MyMatrix(iInput6);
		
		System.out.println("mymatrix1");
		mymatrix1.MyMatrix_Print();
		System.out.println("mymatrix2");
		mymatrix2.MyMatrix_Print();
		System.out.println("mymatrix3");
		mymatrix3.MyMatrix_Print();
		System.out.println("mymatrix4");
		mymatrix4.MyMatrix_Print();
		System.out.println("mymatrix5");
		mymatrix5.MyMatrix_Print();
		System.out.println("");
		System.out.println("Определители матриц");
		System.out.println("матрица1");
		System.out.println("определитель = " + mymatrix1.MyMatrix_Def());
		System.out.println("матрица2");
		System.out.println("определитель = " + mymatrix2.MyMatrix_Def());
		System.out.println("матрица3");
		System.out.println("определитель = " + mymatrix3.MyMatrix_Def());
		System.out.println("матрица4");
		System.out.println("определитель = " + mymatrix4.MyMatrix_Def());
		System.out.println("матрица5");
		System.out.println("определитель = " + mymatrix5.MyMatrix_Def());
		System.out.println("");
		System.out.println("умножаем матрицу");
		mymatrix1.MyMatrix_Print();
		System.out.println("на матрицу");
		mymatrix2.MyMatrix_Print();
		mymatrix1.MyMatrix_Mult(mymatrix2,mymatrix6);
		System.out.println("получаем матрицу");
		mymatrix6.MyMatrix_Print();
		System.out.println("");
		System.out.println("прибавляем к матрице");
		mymatrix1.MyMatrix_Print();
		System.out.println("матрицу");
		mymatrix4.MyMatrix_Print();
		mymatrix1.MyMatrix_Summ(mymatrix4);
		System.out.println("получаем матрицу");
		mymatrix4.MyMatrix_Print();
	}


}
