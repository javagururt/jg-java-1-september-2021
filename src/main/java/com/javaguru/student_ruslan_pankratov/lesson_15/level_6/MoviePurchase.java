package com.javaguru.student_ruslan_pankratov.lesson_15.level_6;

class MoviePurchase {
    public static void main(String[] args) throws Exception {
        Shop shop = new Shop();
        shop.existingFilms();
        Customer customer = new Customer("Ferged","127g43");
        customer.toDeposit("Ferged", "127g43", 123);
        Customer customer2 = new Customer("Lukas","sdfs3s");
        customer2.toDeposit("Lukas", "sdfs3s", 123);
        Customer customer3 = new Customer("Jim","g43ds");
        customer3.toDeposit("Jim", "g43ds", 123);
        Customer customer4 = new Customer("Mer","12ss43");
        customer4.toDeposit("Mer", "12ss43", 123);
        Customer customer5 = new Customer("Jhon","1s2sd7gsds43");
        customer5.toDeposit("Jhon", "1s2sd7gsds43", 123);


        customer.buyAMovie(shop.allFilms, "Mount4");
        customer.signInToAccount("Ferged","127g43");
        customer.buyAMovie(shop.allFilms, "Mount4");

        customer2.signInToAccount("Lukas", "sdfs3s");
        customer.buyAMovie(shop.allFilms, "Mount4");

        shop.addLike("Mount4",4,customer);
        shop.addLike("Mount4",3,customer2);
        shop.addLike("Mount4",2,customer3);
        shop.addLike("Mount4",10,customer4);
        shop.addLike("Mount4",2,customer5);
        shop.movieRating("Mount4");//средний рейтинг
        shop.addLike("Mount4",100,customer);
    }
}
