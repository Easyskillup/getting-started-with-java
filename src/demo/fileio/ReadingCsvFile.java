package demo.fileio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadingCsvFile {
    public static void main(String[] args) throws IOException {
//        List<String> contacts = Files.readAllLines(Path.of("contacts.csv"));
//        List<Contact> contactList = contacts.stream()
//                                    .skip(1)
//                                    .map(line -> {
//                                        String[] split = line.split(",");
//                                        return new Contact(split[0], split[1], split[2]);
//                                    })
//                                    .toList();
//        contactList.stream().forEach(contact -> System.out.println(contact));
        Files.readAllLines(Path.of("contacts.csv"))
                .stream()
                .skip(1)
                .map(line -> {
                    String[] split = line.split(",");
                    return new Contact(split[0], split[1], split[2]);
                })
                .forEach(System.out::println);
    }
}

class Contact {
    private String name;
    private String email;
    private String phone;

    public Contact(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
