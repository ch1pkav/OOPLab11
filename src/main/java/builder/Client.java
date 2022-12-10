package builder;

import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@SuperBuilder
public class Client extends User{
    public static void main(String[] args) {
        Client client = Client.builder()
                .id(1)
                .firstName("John")
                .lastName("Doe")
                .email("client@client.client")
                .birthDate(LocalDate.of(1990, 1, 1))
                .weight(80)
                .height(180)
                .occupation("Developer")
                .build();
        System.out.println(client);
    }
}
