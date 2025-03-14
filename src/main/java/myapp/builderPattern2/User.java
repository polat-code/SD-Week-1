package myapp.builderPattern2;

public class User {
    private Long id;
    private String name;
    private String email;


    private User(UserBuilder userBuilder) {

    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder {
        private Long id;
        private String name;
        private String email;

        public UserBuilder() {}

        public UserBuilder id(Long id) {
            this.id = id;
            return this;
        }
        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }
        public UserBuilder email(String email) {
            this.email = email;
            return this;
        }
        public User build() {
            return new User(this);
        }
    }
}
