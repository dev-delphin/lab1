package lab1;

import java.util.Random;
import java.util.Scanner;

/*���������� ����� Matrix ����������� nxm. ����� ������ ��������� 
* ��������� �������������. ����������� ������ ������ ������� �� �����, 
* ������ ����������� � ��������� ����������� ������� � ����� �������.
*/

public class Matrix {

	private int n;
	private int m;
	private static int[][] arr;
	
	// �����������
	public Matrix(int n, int m) {
		this.n = n;
		this.m = m;
		Matrix.arr = new int [this.n][this.m];
	}
	
	// ��������� �����
	public static void define() {
		int a, b;
		Scanner in = new Scanner(System.in);
		System.out.println("������� ����������� ������� n: ");
		a = in.nextInt();
		System.out.println("������� ����������� ������� m: ");
		b = in.nextInt();
		Matrix matrix = new Matrix(a,b);
		set();
		get(matrix);
	}
	
	// ����� ���������� �������
	public static void set() {
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(1000);
			}
		}
	}
	
	// ����� ��������� �������
	public static void get(Matrix matrix) {
		System.out.println("������� ������������: " + matrix.n + " �� " + matrix.m);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
