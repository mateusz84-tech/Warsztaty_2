package pl.coderslab.models;

import pl.coderslab.dao.UserDao;

public class Aplication {
    public static void main(String[] args) {

        User user1 = new User("Mateusz","mk.gmail.com","haslostulecia",1);
        UserDao userDao1 = new UserDao();
        System.out.println(userDao1.create(user1));

//        User user = new User("Mateusz","mateusz_kocierz@wp.pl","haslo");
//
//        UserDao userDao = new UserDao();
//        // chcemy zapisać nowego użytkownika do bazy danych
//
//        System.out.println("Przed zapisaniem: "+ user);
//        //user = userDao.create(user);
//        System.out.println("Po zapisie: "+user);
//
//        // -----READ ---------
//
//        User user1 = userDao.read(1);
//        System.out.println("Isniejący user w bazie "+ user1);
//        //wersja dla użytkownika kt©óego nie ma w bazie
//        User user2 = userDao.read(45658);
//        System.out.println("Brak usera w bazie "+user2);
//
//        //---------UBDATE-------------
//        //user1.setUserName("Nowy lepszy username");
//        //userDao.update(user1);
//        ///System.out.println("Po update "+user1); // wyświetlamy obiekt po update
//
//        //---------DELETE-------------
//        //userDao.delete(1);
//        //System.out.println("Po usunięciu "+userDao.read(1));
//
//        //---------FIND ALL -------------
//        User newUser1 = new User("Mateusz","mateusz_kocierz@wp.pl","haslo");
//        User newUser2 = new User("Agata","agata_kocierz@wp.pl","test212");
//
//        newUser1 = userDao.create(newUser1);
//        newUser2 = userDao.create(newUser2);
//        System.out.println("Storzenie uzytkownicy przed finall");
//        System.out.println(newUser1);
//        System.out.println(newUser2);
//
//        System.out.println("---------findAll------------");
//        User[] allUsers = userDao.findAll();
//        for(User users : allUsers){
//            System.out.println(users);
//        }
    }
}
