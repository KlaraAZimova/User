package com.company;

import com.company.dao.UserDao;
import com.company.model.User;
import com.company.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /** 1) Жаны проект тузунуз.
         2) company деген пакеттин ичине 3 жаны пакет тузунуз - model, service, dao.
         3) model пакеттин ичине User деген класс тузунуз, свойствалары - id, name, age, Gender, Genderди enum кылып башка пакетке тузуп койсонуз болот. id бул жон эле userдин уникалдуу свойствасы болот.
         4) dao пакеттин ичине UserDao деген класс тузунуз, ичинде бир эле свойствасы болот - userлер, бул класс биздин база данныхыбыз болот.
         5) service пакеттин ичине UserService деген interface тузунуз жана impl деген пакет тузуп коюнуз.
         6) UserServiceтин ичинде 4 метод болот, userди кошуу, id менен табуу, id менен очуруу жана баардык userлерди алуу.
         7) impl пакеттин ичине UserServiceImpl деген класс тузунуз, бул класс UserService интерфейсин ишке ашырат жана бул класста свойства катары биздин база данныхыбыз болот(UserDao).
         8) UserServiceImpl класста UserService интерфейсинин бардык методдорун ишке ашырыныз.
         9) Main методдо 3 user тузунуз idлери 1,2,3 болсун.
         10) Аларды биздин базага кошунуз.
         11) 1 деген id менен userди таап консольго чыгарыныз.
         12) Эгер ал id жок болсо анда RunTimeException кармасын.
         13) Exception ди озунуздор тузунуздорю
         14) Баардык userлерди консольго чыгарыныз.
         15) 2 деген id менен userди очурунуз.
         16) Баардык userлерди консольго чыгарыныз.
         */

        User user = new User("Klara", 29, 1, Gender.FEMALE);
        User user1 = new User("Maksat", 25, 3, Gender.MALE);
        User user2 = new User("Aziza", 23, 2, Gender.FEMALE);


        List<User> mas = new ArrayList<>(List.of(user, user1, user2));
        UserServiceImpl userService = new UserServiceImpl(user, user1, user2, new UserDao());

        userService.findWithID(mas, 1);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        userService.getAllUsers(mas);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        userService.deleteWithID(mas, 2);
        userService.getAllUsers(mas);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        userService.addUser(mas, new User("Nurtilek", 21, 4, Gender.MALE));
        userService.getAllUsers(mas);

    }
}
