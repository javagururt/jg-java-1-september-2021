package com.javaguru.student_Olga_T.lesson_7.level_1.tasks_1_3;

class WordService {
    public static void main(String[] args) {
        WordService wordService = new WordService();
        String someText = new String("   aaa, ddd, sss, aaa, aaa, ddd, cjj, gh; t: aaa%  . ");
        String victimWord = wordService.findMostFrequentWord(someText);
        System.out.println("Max count word = " + victimWord + " times.");
    }

    public String findMostFrequentWord(String text) {
        String strighWithoutSpacesAfterAndBefore = text.trim();     // убираем лишние пробелы в начале и в конце строки
        String[] strings = strighWithoutSpacesAfterAndBefore.split(" ");    // разбиваем строку на массив
        String countMaxWord = strings[0]; // чаще всего встречающееся слово
        int maxCount = 0;

        System.out.println("Before:");
        System.out.println(text);
        System.out.println("After:");
        System.out.println(strighWithoutSpacesAfterAndBefore);
        System.out.println();

        for (int i = 0; i < strings.length; i++) {
            int count = countWord(strings, strings[i]);     // считаем в конкретном предложении
            if (count > maxCount) {
                maxCount = count;
                countMaxWord = strings[i];
            }
            if(count == 1){
                System.out.println("string [" + i + "] = '" + strings[i] + "' " + count + " time.");
            }else {
                System.out.println("string [" + i + "] = '" + strings[i] + "' " + count + " times.");
            }
        }
        return "'" + countMaxWord + "' " + maxCount;
    }

    public int countWord(String[] textArray, String word) {

        int times = 0;
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i].equals(word)) {
                times++;
            }

        }
        return times;   // кол-во повторов слова в массиве слов
    }

}


