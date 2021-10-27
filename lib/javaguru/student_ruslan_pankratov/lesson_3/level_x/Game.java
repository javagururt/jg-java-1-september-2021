package com.javaguru.student_ruslan_pankratov.lesson_3.level_x;

import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReview;
import com.javaguru.student_maksims_jagelavics.student_vadim_babchenok.teacher.codereview.CodeReviewComment;

//super_task_2
@CodeReview(approved = true)
@CodeReviewComment(teacher = "чтобы было более читабельно лучше разбить на маленькие методы, а так же для мейн метода" +
        "создать отдельный класс")
class Game {

    public static void main(String[] args) {
        Game game = new Game();
        game.roll(10);
        game.roll(3);
        game.roll(3);
        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(5);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(10);
        game.roll(3);
        game.roll(3);

    }

    @CodeReviewComment(teacher =
    "bonus == true - можно упростить до просто bonus")
    void roll(int pinsKnockedDown) {
        System.out.println("-------------");
        if (frame != 0) {
            if (bonus) {
                bonus = false;
                System.out.println("Бонусные очки = " + pinsKnockedDown);
                spare = spare + pinsKnockedDown;
            }
            if (move == 0) {
                move = 2;
                frame = frame - 1;
                skittles = 10;
            }
            if (move == 2 || move == 1) {
                if (pinsKnockedDown <= skittles) {

                    score(pinsKnockedDown);
                    System.out.println("количество очков = " + spare);
                    skittles = skittles - pinsKnockedDown;
                    System.out.println("Осталось кеглей: " + skittles);
                    System.out.println("бросок " + move);
                    System.out.println("рама " + frame);
                    move = move - 1;
                    if (skittles == 0) {
                        bonus = true;
                        skittles = 10;
                        move = 2;
                        frame = frame - 1;
                    }
                } else {
                    System.out.println("Это не возможно, у вас только " + skittles + " кеглей");
                }
            }
        } else {
            System.out.println("Игра окончена");
            System.out.println("количество очков = " + spare);
        }
    }

    boolean bonus = false;
    int move = 2;
    int frame = 10;
    int skittles = 10;
    int spare;

    int score(int pinsKnockedDown) {
        spare = spare + pinsKnockedDown;
        return spare;
    }
}
