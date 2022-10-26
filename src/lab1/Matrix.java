package lab1;

import java.util.Random;
import java.util.Scanner;

/*Определить класс Matrix размерности nxm. Класс должен содержать 
* несколько конструкторов. Реализовать методы вывода матрицы на экран, 
* методы определения и получения размерности матрицы и самой матрицы.
*/

public class Matrix {

	private int n;
	private int m;
	private static int[][] arr;
	
	// Конструктор
	public Matrix(int n, int m) {
		this.n = n;
		this.m = m;
		Matrix.arr = new int [this.n][this.m];
	}
	
	// Стартовая точка
	public static void define() {
		int a, b;
		Scanner in = new Scanner(System.in);
		System.out.println("Введите размерность матрицы n: ");
		a = in.nextInt();
		System.out.println("Введите размерность матрицы m: ");
		b = in.nextInt();
		Matrix matrix = new Matrix(a,b);
		set();
		get(matrix);
	}
	
	// Метод заполнение массива
	public static void set() {
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(1000);
			}
		}
	}
	
	// Метод получение массива
	public static void get(Matrix matrix) {
		System.out.println("Матрица разменностью: " + matrix.n + " на " + matrix.m);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
