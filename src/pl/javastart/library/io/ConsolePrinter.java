package pl.javastart.library.io;

import pl.javastart.library.model.*;

import javax.sql.rowset.Predicate;
import java.util.Collection;

public class ConsolePrinter {
    public void printBooks(Collection<Publication> publications) {
        long count = publications.stream()
                .filter(publication -> publication instanceof Book)
                .map(Publication::toString)
                .peek(this::printLineAsIs)
                .count();
        if (count == 0)
            printLine("Brak książek w bibliotece");
    }

    public void printMagazines(Collection<Publication> publications) {
        long count = publications.stream()
                .filter(publication -> publication instanceof Magazine)
                .map(Publication::toString)
                .peek(this::printLineAsIs)
                .count();
        if (count == 0)
            printLine("Brak magazynów w bibliotece");
    }

    public void printUsers(Collection<LibraryUser> users) {
        users.stream()
                .map(LibraryUser::toString)
                .forEach(this::printLineAsIs);
    }

    public void printLine(String text) {
        System.out.println(text.toUpperCase());
    }

    private void printLineAsIs(String text) {
        System.out.println(text);
    }
}