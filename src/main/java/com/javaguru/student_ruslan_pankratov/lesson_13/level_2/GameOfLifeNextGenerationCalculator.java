package com.javaguru.student_ruslan_pankratov.lesson_13.level_2;

class GameOfLifeNextGenerationCalculator {

    public boolean[][] calculate(boolean[][] currentGeneration) {
        int[][] arr = new int[currentGeneration.length][currentGeneration.length];

        boolean[][] field = new boolean[currentGeneration.length][currentGeneration.length];

        emptyField(field);
        for (int i = 0; i < currentGeneration.length; i++) {
            for (int j = 0; j < currentGeneration.length; j++) {
                int sum = 0;
                int revitalization = 0;
                if (i != 0 && j != 0 && j != currentGeneration.length - 1 &&
                        i != currentGeneration.length - 1) {
                    if (currentGeneration[i][j]) {
                        sum = average(currentGeneration, sum, i, j);
                    } else {
                        revitalization = average(currentGeneration, sum, i, j);
                    }

                }

                if (i == 0) {
                    if (j != 0 && j != currentGeneration.length - 1) {
                        if (currentGeneration[i][j]) {
                            sum = top(currentGeneration, sum, i, j);
                        } else {
                            revitalization = top(currentGeneration, sum, i, j);
                        }
                    }
                }

                if (j == 0 && i == 0) {
                    if (currentGeneration[i][j]) {
                        sum = cornerOne(currentGeneration, sum);
                    } else {
                        revitalization = cornerOne(currentGeneration, sum);
                    }
                }

                if (i == 0 && j == currentGeneration.length - 1) {//проверка//04 клетка test
                    // 03 14
                    if (currentGeneration[i][j]) {
                        sum = cornerTwo(currentGeneration, sum);
                    } else {
                        revitalization = cornerTwo(currentGeneration, sum);
                    }
                }

                if (i != 0 && i != currentGeneration.length - 1 && j == currentGeneration.length - 1) {
                    if (currentGeneration[i][j]) {
                        sum = right(currentGeneration, sum, i, j);
                    } else {
                        //будь осторожен, чтобы не поместить один неподходящий цикл под другой
                        revitalization = right(currentGeneration, sum, i, j);
                    }
                }


                if (j != currentGeneration.length - 1 && j != 0 && i == currentGeneration.length - 1) {
                    if (currentGeneration[i][j]) {//проверка клетки
                        sum = bottom(currentGeneration, sum, i, j);
                    } else {
                        revitalization = bottom(currentGeneration, sum, i, j);
                    }
                }

                if (j == currentGeneration.length - 1 && i == currentGeneration.length - 1) {
                    if (currentGeneration[currentGeneration.length - 1][currentGeneration.length - 1]) {
                        sum = cornerThree(currentGeneration, sum, i, j);
                    } else {
                        revitalization = cornerThree(currentGeneration, sum, i, j);
                    }

                }

                if (j == 0 && i == currentGeneration.length - 1) {//угол 40 (30 41)
                    if (currentGeneration[i][j]) {//проверка уголка клетки
                        sum = cornerFour(currentGeneration, sum, i, j);
                    } else {
                        revitalization = cornerFour(currentGeneration, sum, i, j);
                    }
                }

                if (j == 0 && i != 0 && i != currentGeneration.length - 1) {// проверка
                    if (currentGeneration[i][j]) { //проверка клетки
                        sum = left(currentGeneration, sum, i, j);
                    } else {
                        revitalization = left(currentGeneration, sum, i, j);
                    }
                }

                if (sum == 2 || sum == 3) {  //при 4 клетках умрёт
                    field[i][j] = true;
                }
                if (revitalization == 3) {
                    field[i][j] = true;
                }
            }
        }
        return field;
    }


    private int average(boolean[][] currentGeneration, int sum, int i, int j) {//int sum не будет меняться, меняются
        // только объекты в методах и массивы
        if (currentGeneration[i - 1][j]) {//(11) 01 12 21 10
            sum += 1;
        }
        if (currentGeneration[i][j + 1]) {
            sum += 1;
        }

        if (currentGeneration[i + 1][j]) {
            sum += 1;
        }

        if (currentGeneration[i][j - 1]) {
            sum += 1;
        }
        return sum;
    }

    private int top(boolean[][] currentGeneration, int sum, int i, int j) {
        if (currentGeneration[i][j - 1]) {// 0 2
            sum += 1;
        }
        if (currentGeneration[i][j + 1]) {//04
            sum += 1;
        }
        if (currentGeneration[i + 1][j]) {
            sum += 1;
        }
        return sum;
    }


    private int cornerOne(boolean[][] currentGeneration, int sum) {
        if (currentGeneration[0][1]) {
            sum += 1;
        }
        if (currentGeneration[1][0]) {
            sum += 1;
        }
        return sum;
    }


    private int cornerTwo(boolean[][] currentGeneration, int sum) {
        if (currentGeneration[0][currentGeneration.length - 2]) {  //(04) 03 14
            sum += 1;
        }
        if (currentGeneration[1][currentGeneration.length - 1]) {
            sum += 1;
        }
        return sum;
    }

    private int right(boolean[][] currentGeneration, int sum, int i, int j) {
        if (currentGeneration[i - 1][j]) {
            sum += 1;
        }
        if (currentGeneration[i][j - 1]) {
            sum += 1;
        }
        if (currentGeneration[i + 1][j]) {
            sum += 1;
        }
        return sum;
    }

    private int bottom(boolean[][] currentGeneration, int sum, int i, int j) {
        if (currentGeneration[i][j - 1]) {
            sum += 1;
        }
        if (currentGeneration[i - 1][j]) {
            sum += 1;
        }
        if (currentGeneration[i][j + 1]) {
            sum += 1;
        }
        return sum;
    }

    private int cornerThree(boolean[][] currentGeneration, int sum, int i, int j) {
        if (currentGeneration[i - 1][j]) {//34
            sum += 1;
        }
        if (currentGeneration[i][j - 1]) {
            sum += 1;
        }
        return sum;
    }

    private int cornerFour(boolean[][] currentGeneration, int sum, int i, int j) {
        if (currentGeneration[i - 1][j]) {
            sum += 1;
        }
        if (currentGeneration[i][j + 1]) {
            sum += 1;
        }
        return sum;

    }

    private int left(boolean[][] currentGeneration, int sum, int i, int j) {
        if (currentGeneration[i - 1][j]) { //(20) 10 21 30
            sum += 1;
        }
        if (currentGeneration[i][j + 1]) {
            sum += 1;
        }
        if (currentGeneration[i + 1][j]) {
            sum += 1;
        }
        return sum;
    }

    void emptyField(boolean[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = false;
            }
        }
    }
}
