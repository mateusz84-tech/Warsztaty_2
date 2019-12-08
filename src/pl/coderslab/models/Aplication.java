package pl.coderslab.models;

import pl.coderslab.dao.UserDao;

public class Aplication {
    public static void main(String[] args) {
        User user = new User("Mateusz","mateusz_kocierz@wp.pl","haslo");

        UserDao userDao = new UserDao();
        // chcemy zapisać nowego użytkownika do bazy danych

        System.out.println("Przed zapisaniem: "+ user);
        //user = userDao.create(user);
        System.out.println("Po zapisie: "+user);

        // -----READ ---------

        User user1 = userDao.read(1);
        System.out.println("Isniejący user w bazie "+ user1);
        //wersja dla użytkownika kt©óego nie ma w bazie
        User user2 = userDao.read(45658);
        System.out.println("Brak usera w bazie "+user2);

        //---------UBDATE-------------
        user1.setUserName("Nowy lepszy username");
        userDao.update(user1);
        System.out.println("Po update "+user1); // wyświetlamy obiekt po update

        //---------DELETE-------------
        userDao.delete(1);
        System.out.println("Po usunięciu "+userDao.read(1));

    }
}
