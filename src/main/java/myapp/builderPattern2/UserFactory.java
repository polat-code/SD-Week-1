package myapp.builderPattern2;

public class UserFactory {

    public User createUser() {
        return User.builder()
                .id(1L)
                .name("User")
                .email("User@gmail.com")
                .build();
    }
}
