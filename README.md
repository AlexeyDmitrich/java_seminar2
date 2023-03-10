## java_seminar2
### [Задача 1](https://github.com/AlexeyDmitrich/java_seminar2/blob/master/src/HomeTask1.java)
В ней реализована подробно залоггированная в XML формате в [отдельный файл](https://github.com/AlexeyDmitrich/java_seminar2/blob/master/log.xml)
пузыриковая сортировка. С логгированием есть нюансы: мне кажется, оно пишет слишком много.
### [Задача 2](https://github.com/AlexeyDmitrich/java_seminar2/blob/master/src/HomeTask2.java)
Из обычного текстового [файла](https://github.com/AlexeyDmitrich/java_seminar2/blob/master/journal.txt) получаем строку технического формата "":"","":"","":"" и переводим её в приятный для человека формат. 
Дополнительно этот приятный формат будет записан в [файл](https://github.com/AlexeyDmitrich/java_seminar2/blob/master/newJournal.txt) 
### [Задача 3](https://github.com/AlexeyDmitrich/java_seminar2/blob/master/src/HomeTask3.java)
Запрашиваем у пользователя ввод строки, а в ответ возвращаем ему булево значение, является ли его строка палиндромом. С этой задачей тоже есть нюансы. 
В условии сказано принять String, но решить задачу, не применяя встроенных методов. При этом любая операция со ссылочным типом - уже является встроенной.
Реализовал так, как я это понимаю.
### [Задача 4 доп](https://github.com/AlexeyDmitrich/java_seminar2/blob/master/src/HomeTask4.java)
К калькулятору из первого семинара привязали логгер. В отличии от первой задачи - формат не .XML, а .txt. Файл лога _calclog.txt_ перезаписывается при каждом сеансе.
