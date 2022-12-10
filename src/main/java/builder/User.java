package builder;

import lombok.AllArgsConstructor;
import lombok.Singular;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

@SuperBuilder
@AllArgsConstructor
public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate birthDate;
    private double weight;
    private double height;
    @Singular
    private List<String> occupations;

    public static void main(String[] args) {
       User user = User.builder()
               .id(1)
               .firstName("John")
               .lastName("Doe")
               .email("johndoe@example.com")
                .birthDate(LocalDate.of(1990, 1, 1))
                .weight(80)
                .height(180)
                .occupation("Developer")
                .build();
        System.out.println(user);
    }
}
