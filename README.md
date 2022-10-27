# Домашнее задание (Урок 29)
## Исходные данные
Есть класс List:

	class List {
		private T[] obj;
		private int size = -1;
		private int cur = -1;
		
		public List(int size) {
			cur = 0;
			this.size = size;
			obj = (T[])(new Object[size]);
		}
		
		public void add(T item) {			
			obj[cur++] = item;
		}

		public void removeLast() {			
			obj[--cur] = null;			
		}
		
		
	}

1. Реализовать класс ListException, EmptyListException и FullListException

ListException является наследником класса Exception
EmptyListException наследуюет класс ListException
FullListException также наследуюет класс ListException

2. В классе List добавить исключительные ситуации в методы:

    - removeLast() на тот случай, если производится попытка удаления элемента
      из пустого массива obj (исключение типа EmptyListException)

    - add() на тот случай, если массив obj полностью заполнен данными  (исключение типа FullListException)

3. Привести пример работы с классом List<E>. Воспроизвести исключения EmptyListException и FullListException,
   перехватить эти исключения в блоке try...catch и вывести сообщения на экран
