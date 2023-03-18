package Bankomat;

import java.util.ArrayList;
import java.util.List;

public class Database {

        public static List<Account> database = new ArrayList<>();




        static  {
            database.add(new Account("user1", 1, 1001, 4321));
            database.add(new Account("user2", 2, 1002, 4321));
            database.add(new Account("user3", 3, 1003, 4321));
            database.add(new Account("user4", 4, 1004, 4321));
            database.add(new Account("user5", 5, 1005, 4321));
            database.add(new Account("user6", 6, 1006, 4321));
            database.add(new Account("user7", 7, 1007, 4321));
            database.add(new Account("user8", 8, 1008, 4321));
            database.add(new Account("user9", 9, 1009, 4321));
            database.add(new Account("user10", 10, 1010, 4321));
        }


    }

