package com.edu.training.jc.time;

public class Main {

	public static void main(String[] args) {
		
		Time t1 = new Time();				//пустое время
		
		System.out.println(t1.toString());
		
		Time t2 = new Time(3,5,405);		//время с некорректными секундами
		System.out.println(t2.toString());
		t2.hourAdd(2);						//добавили 2 часа
		System.out.println(t2.toString());
		t2.hourAdd(30);						//добавили часы с выходом за 24
		System.out.println(t2.toString());
		t2.minutAdd(100);					//добавили минуты с выходом за 60, автоматически добавляются часы
		System.out.println(t2.toString());
		t2.secondAdd(5000);					//добавили секунды (5000 сек == 1 час, 23 мин, 20 сек)
		System.out.println(t2.toString());
		t2.secondSubtract(5000);			//отняли секунда и вернулись к предыдущему
		System.out.println(t2.toString());
		t2.setMinut(100);					//сохраняем некорректные минуты
		System.out.println(t2.toString());

	}

}
