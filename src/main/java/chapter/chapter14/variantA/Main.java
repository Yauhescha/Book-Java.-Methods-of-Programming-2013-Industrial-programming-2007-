package main.java.chapter.chapter14.variantA;

public class Main {

	public static void main(String[] args) {
		System.out.println("1. Cоздать апплет с использованием потоков: строка движется горизонтально, отражаясь от границ апплета и меняя при этом случайным об-разом свой цвет.");
		System.out.println("2. Cоздать апплет с использованием потоков: строка движется по диагонали. При достижении границ апплета все символы строки случайным образом меняют регистр.");
		System.out.println("3. Организовать сортировку массива методами Шелла, Хоара, пузырька, на основе бинарного дерева в разных потоках.");
		System.out.println("4. Реализовать сортировку графических объектов, используя алгоритмы из задания 3.");
		System.out.println("5. Создать апплет с точкой, движущейся по окружности с постоянной угловой скоростью. Сворачивание браузера должно приводить к из-менению угловой скорости движения точки для следующего запуска потока.");
		System.out.println("6. Изобразить точку, пересекающую с постоянной скоростью окно слева направо (справа налево) параллельно горизонтальной оси. Как только точка доходит до границы окна, в этот момент от левого (правого) края с вертикальной координатной y, выбранной с помощью датчика слу-чайных чисел, начинает свое движение другая точка и т.д. Цвет точки также можно выбирать с помощью датчика случайных чисел. Для каж-дой точки создается собственный поток.");
		System.out.println("7. Изобразить в приложении правильные треугольники, вращающиеся в плоскости экрана вокруг своего центра. Каждому объекту соответ-ствует поток с заданным приоритетом.");
		System.out.println("8. Условие предыдущей задачи изменяется таким образом, что центр вращения перемещается от одного края окна до другого с постоянной скоростью параллельно горизонтальной оси.");
		System.out.println("9. Cоздать фрейм с тремя шариками, одновременно летающими в окне. С каждым шариком связан свой поток со своим приоритетом.");
		System.out.println("10. Два изображения выводятся в окно. Затем они постепенно исчезают с различной скоростью в различных потоках (случайным образом выбираются точки изображения, и их цвет устанавливается в цвет фона).");
		System.out.println("11. Условие предыдущей задачи изменить на применение эффекта посте-пенного “проявления” двух изображений.");
		}

}
