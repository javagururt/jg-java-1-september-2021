package com.javaguru.student_ruslan_pankratov.lesson_15.level_6;

import java.util.ArrayList;
import java.util.List;

class Shop {
    List<Film> allFilms = new ArrayList<>();//не забывай это писать = new ArrayList<>();,
    // потому что нельзя иницилизировать без этого
   void existingFilms(){
       allFilms.add(new Film("Mount", 2, 120 ));
       allFilms.add(new Film("Mount2", 3, 120 ));
       allFilms.add(new Film("Mount3", 2, 120 ));
       allFilms.add(new Film("Mount4", 2, 120 ));
       allFilms.add(new Film("Red", 2, 120 ));
       allFilms.add(new Film("Jeki", 2, 120 ));
       allFilms.add(new Film("Jeki2", 2, 120 ));
       allFilms.add(new Film("Kill Bill", 2, 120 ));
       allFilms.add(new Film("Kill Bill2", 2, 120 ));
       allFilms.add(new Film("Kill Bill3", 2, 120 ));

   }

    public void addLike(String name, double likeFilm, Customer customer) throws Exception {//добавить оценку

           Film film2 = allFilms.stream()
                   .filter(film -> film.getNameFilm().equalsIgnoreCase(name))
                   .findAny()
                   .orElseThrow(Exception::new);//Exception::new чтобы не было ошибки надо так писать вместо new Exeption
           // и в аргументы надо вывести
                            if (film2 != null){
                                boolean result = film2.getListOfPeopleWhoLiked().stream()
                                        .allMatch(list -> !list.getLogin().equals(customer.getLogin()));

                                if ( film2.getListOfPeopleWhoLiked().size() == 0 ) {

                                    film2.setLikeSum(film2.getLikeSum() + likeFilm);
                                    film2.setLike(film2.getLike() + 1);
                                    film2.setMiddleLike(film2.getLikeSum() / film2.getLike());
                                    film2.getListOfPeopleWhoLiked().add(customer);
                                    System.out.println("средняя оценка = " + film2.getMiddleLike());
                                } else if(result){

                                    film2.setLikeSum(film2.getLikeSum() + likeFilm);
                                    film2.setLike(film2.getLike() + 1);
                                    film2.setMiddleLike(film2.getLikeSum() / film2.getLike());
                                    film2.getListOfPeopleWhoLiked().add(customer);
                                    System.out.println("средняя оценка = " + film2.getMiddleLike());
                                } else {
                                    System.out.println("Вы уже ставили оценку");
                                }
                            } else {
                                System.out.println("Фильм не найден");
                            }


    }

    private boolean checkingVisitors(Customer customer, List<Customer> customersList) {
        if (customersList != null) {
            return customersList.stream()
                    .anyMatch(customer1 -> customer1.getLogin().equals(customer.getLogin()));
         } else {
            return true;
        }
    }

    public void movieRating(String nameFilm) { //вывести рейтинг
        allFilms.stream()
                .filter(film -> film.getNameFilm().equals(nameFilm))
                .map(film -> film.getMiddleLike())
                .forEach(System.out::println);

    }







}
