package lv.javaguru.courses.ingenico.lecture4.common;

import lv.javaguru.courses.ingenico.utils.Assert;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * UserRepository class stores all users
 * and provides methods to search them
 */
public class UserRepository {

    private final Set<User> users;

    //for singleton in must be private!
    public UserRepository(Set<User> users) {
        this.users = users;
    }

    public static UserRepository getInstance() {
        return Singleton.INSTANCE.userRepository;
    }

    public List<User> getAll() {
        return Collections.unmodifiableList(new ArrayList<>(users));
    }

    public User findByNickname(String nickname) {
        Assert.notEmpty(nickname, "nickname");
        return users.stream()
                .filter(user -> nickname.equals(user.getNickname()))
                .findFirst()
                .orElse(null);
    }

    public User findByFacebookId(String facebookId) {
        Assert.notEmpty(facebookId, "facebookId");
        return users.stream()
                .filter(user -> facebookId.equals(user.getFacebookId()))
                .findFirst()
                .orElse(null);
    }

    public User findByTwitterId(String twitterId) {
        Assert.notEmpty(twitterId, "twitterId");
        return users.stream()
                .filter(user -> twitterId.equals(user.getTwitterId()))
                .findFirst()
                .orElse(null);
    }

    public void save(User user) {
        users.add(user);
    }

    // one of options how to make singleton in java.
    // this approach is based on enum

    private enum Singleton {
        INSTANCE(new UserRepository(
                new HashSet<User>() {
                    {
                        add(new User("john89", LocalDateTime.now().minusDays(1), true));
                        add(new User("jose", LocalDateTime.now().minusDays(4), true, "jose-facebook", null));
                        add(new User("toe", LocalDateTime.now().minusDays(4), true, null, "toe-twitter"));
                        add(new User("digger", LocalDateTime.now().minusDays(10), true));
                        add(new User("nessie", LocalDateTime.now().minusDays(2), true, "nessie-facebook", "nessie-twitter"));
                        add(new User("freak", LocalDateTime.now().minusDays(3), false));
                        add(new User("odmen", LocalDateTime.now().minusDays(3), true));
                    }
                }));

        private UserRepository userRepository;

        Singleton(UserRepository userRepository) {
            this.userRepository = userRepository;
        }
    }
}
