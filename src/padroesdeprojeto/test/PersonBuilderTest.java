package padroesdeprojeto.test;

import padroesdeprojeto.builder.Person;

public class PersonBuilderTest {
    public static void main(String[] args) {
        Person build = Person.PersonBuilder.builder()
                .firstName("Guilherme")
                .lastName("Santos")
                .userName("guisantos")
                .email("gui@test.com")
                .build();
        System.out.println(build);
    }
}
