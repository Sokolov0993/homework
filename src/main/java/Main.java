import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        ArrayList<Books> books = new ArrayList<>();
        Books[] mass = new Books[4];

        Books book1 = new Books("История пожилого Гибона", "Жмышенко В.А", Establishment.LENIZDAT, LocalDate.of(2000, 01, 01));
        Books book2 = new Books("Жизнь под столиком", "Петров Д.А", Establishment.LENIZDAT, LocalDate.of(2001, 01, 01));
        Books book3 = new Books("Я хочу питсы", "Петров Д. А", Establishment.ZALUPA, LocalDate.of(2002, 01, 01));
        Books book4 = new Books("Разведение пожилых енотов", "Жмышенко В.А", Establishment.ZALUPA, LocalDate.of(2003, 01, 01));

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        System.out.println();

        List<Books> names = books.stream().filter(book -> book.getAuthor().equalsIgnoreCase("Жмышенко В.А")).collect(Collectors.toList());
        System.out.println("Книги за авторством Жмышенко:");
        System.out.println(names);
        System.out.println();
        List<Books> establishment = books.stream().filter(book -> book.getEstablishment().equalsIgnoreCase("lenizdat")).collect(Collectors.toList());
        System.out.println("Издательство 'Lenizdat':");
        System.out.println(establishment);
        List<Books> date = books.stream()
                .filter(book -> book.getDate().isAfter(LocalDate.of(2001, 02, 02)))
                .collect(Collectors.toList());
        System.out.println();
        System.out.println("Изданные после 02.02.2001");
        System.out.println(date);

    }
}

