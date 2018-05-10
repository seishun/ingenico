package lv.javaguru.courses.ingenico.lecture1.inheritance.anonymous;

import java.util.Arrays;
import java.util.Comparator;

public class UserSortingExample {

    public static void main(String[] args) {
        User[] users = new User[2];
        users[0] = new User(5, "peter@gmail.com");
        users[1] = new User(2, "bob@gmail.com");
        Comparator<User> byIdComparator = new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                if (o1.getId() > o2.getId()){
                    return 1;
                }
                return o1.getId() == o2.getId() ? 0 : -1;
            }
        };
        Arrays.sort(users, byIdComparator);
        System.out.println(Arrays.toString(users));
    }

}
