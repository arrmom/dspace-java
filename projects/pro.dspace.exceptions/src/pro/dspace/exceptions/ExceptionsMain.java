package pro.dspace.exceptions;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * Исключения.
 * 
 * @author mom
 *
 */
public class ExceptionsMain {

	public static void main(String[] args) {
		System.out.println("---- Exceptions ---");
		// try catch throw throws finally
		try {
//			method();
//			method2();
//			method3();
			method4();
			System.out.println("Не выведется");
			throw new IOException("File open error");
		} catch (ArithmeticException e) {
			System.out.println("Возникло исключение арифметики: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("Исключение ввода/вывода: " + e);
		} catch (RuntimeException e) {
			System.out.println("Неизвестное непроверяемое исключение: " + e);
		} catch (MyException e) {
			System.out.println("Наше исключение: name = " + e.getName() + ", val = " + e.getValue());
		} catch (Exception e) {
			System.out.println("Неизвестное исключение: " + e);
		} finally {
			System.out.println("Выполняется всегда !!!");
		}
	}

	private static void method() {
		int a = 0;
		int b = 10;
		int c = b / a;
	}
	
	private static void method2() {
		// asdasd
		if (true) {
			throw new RuntimeException("Some message");
		} else {
			if (false) {
				return;
			}
		}
		int x;
	}
	
	private static void method3() throws InterruptedException {
		throw new InterruptedException("Thread has been interrupted");
	}
	
	private static void method4() throws MyException {
		throw new MyException(10, "Bill");
	}

	private static List<Integer> method5() throws MyException {
		if (true) {
			return new LinkedList<>();
		} else {
			throw new MyException(10, "Bill"); // ????? нужно избегать как замену для return
		}
	}
	
}
