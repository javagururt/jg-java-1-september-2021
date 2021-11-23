package com.javaguru.student_ruslan_pankratov.lesson_9.level_7;

public class WinningPositions {


    boolean winPosition(int[][] arr, int numberPlayer) {
        if (winPositionHorizontal(arr, numberPlayer)) {
            return true;
        } else if (winPositionVertical(arr, numberPlayer)) {
            return true;
        } else if (winPositionLeftDiagonal(arr, numberPlayer)) {
            return true;
        } else if (winPositionRightDiagonal(arr, numberPlayer)) {
            return true;
        }
        return false;
    }

    private boolean winPositionVertical(int[][] arr, int numberPlayer) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i] == numberPlayer) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }
        return false;
    }

    private boolean winPositionHorizontal(int[][] arr, int numberPlayer) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length + 1; j++) {
                if (arr[i][j] == numberPlayer) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 0;
                }
            }
        }
        return false;
    }

    private boolean winPositionLeftDiagonal(int[][] arr, int numberPlayer) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][i] == numberPlayer) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][i + 1] == numberPlayer) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i][i + 2] == numberPlayer) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i][i + 3] == numberPlayer) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1][i] == numberPlayer) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i + 2][i] == numberPlayer) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }

    private boolean winPositionRightDiagonal(int[][] arr, int numberPlayer) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][arr.length - i] == numberPlayer) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1][arr.length - i] == numberPlayer) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }

        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i + 2][arr.length - i] == numberPlayer) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }


        for (int i = 0; i < arr.length; i++) {
            if (arr[i][arr.length - i - 1] == numberPlayer) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i][arr.length - i - 2] == numberPlayer) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i][arr.length - i - 3] == numberPlayer) {
                count++;
                if (count == 4) {
                    return true;
                }
            } else {
                count = 0;
            }
        }
        return false;
    }

}


