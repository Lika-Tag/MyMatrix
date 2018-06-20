	class MyMatrix	{
		int[][] mymatrix;
		int iRows;
		int iColumns;
		MyMatrix(int[] iNumbers) {
			iRows = iNumbers[0];
			iColumns = iNumbers[1];
			mymatrix = new int[iRows][iColumns];
			int k = 2;
			for (int i= 0; i<iRows; i++) {
				for (int j=0; j<iColumns; j++) {
					if (k >= iNumbers.length) {
						mymatrix[i][j] = 0;
					} 
					else {
						mymatrix[i][j] = iNumbers[k];
					}
					k++;
				}
			}
		}
                void MyMatrix_Print() {
			for(int i=0;i<iRows;i++) {
				for(int j=0;j<iColumns;j++) {
					System.out.print(mymatrix[i][j] + "	");
				}
				System.out.println("");
			}
		}
		void MyMatrix_Mult(MyMatrix multMatrix, MyMatrix multResult) {
			if (iColumns == multMatrix.iRows & multResult.iRows == iRows 
					& multMatrix.iColumns == multResult.iColumns )	{
				for (int i= 0; i<iRows; i++) {
					for (int j=0; j<multMatrix.iColumns; j++) {
						for (int k=0; k<iColumns; k++) {
							multResult.mymatrix[i][j] =
								multResult.mymatrix[i][j] + mymatrix[i][k] * multMatrix.mymatrix[k][j];
						} 
					}
				}
			}
		}
		void MyMatrix_Summ(MyMatrix summMatrix) {
			if (iColumns == summMatrix.iColumns & summMatrix.iRows == iRows) {
				for (int i= 0; i<iRows; i++) {
					for (int j=0; j<iColumns; j++) {
							summMatrix.mymatrix[i][j] =
								summMatrix.mymatrix[i][j] + mymatrix[i][j]; 
					}
				}
			}
		}
		int MyMatrix_Def() {
			//System.out.println("iRows=" + iRows + "; iColumns=" + iColumns);
			if (iRows != iColumns) {return 0;}
			if (iRows == 1) { return mymatrix[0][0];}
			if (iRows == 2) {
				return mymatrix[0][0]*mymatrix[1][1] - mymatrix[1][0]*mymatrix[0][1];
			}
			if (iRows > 2) {
				int iDef = 0;
				int[]  iInput;
				iInput = new int[5];
				iInput[0] = iRows-1;
				iInput[1] = iRows-1;
				MyMatrix lmatrix = new MyMatrix(iInput);
				for (int k=0; k<iRows; k++ ) {
					for(int i=0; i< iRows-1;i++) {
						for(int j=0; j<iRows-1; j++) {
							if (j<k)	{
								lmatrix.mymatrix[i][j] = mymatrix[i+1][j];
							} 
							else {
								lmatrix.mymatrix[i][j] = mymatrix[i+1][j+1];
							}
						}
					}
					if (k % 2 == 0) {
						iDef = iDef + mymatrix[0][k] * lmatrix.MyMatrix_Def();
					}
					else {
						iDef = iDef - mymatrix[0][k] * lmatrix.MyMatrix_Def();
					}
				}
				return iDef;
			}
			return -99;
		}
	}
