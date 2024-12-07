package pl.javastart.library.io;

import pl.javastart.library.model.Book;
import pl.javastart.library.model.LibraryUser;
import pl.javastart.library.model.Magazine;
import pl.javastart.library.model.Publication;

import java.util.Collection;

public class ConsolePrinter {
    public void printBooks(Collection<Publication> publications) {
        int counter = 0;
        for (Publication publication : publications) {
            if (publication instanceof Book) {
                printLineAsIs(publication.toString());
                counter++;
            }
        }
        if (counter == 0)
            printLine("Brak książek w bibliotece");
    }

    public void printMagazines(Collection<Publication> publications) {
        int counter = 0;
        for (Publication publication : publications) {
            if (publication instanceof Magazine) {
                printLineAsIs(publication.toString());
                counter++;
            }
        }
        if (counter == 0)
            printLine("Brak magazynów w bibliotece");
    }

    public void printUsers(Collection<LibraryUser> users) {
        int counter = 0;
        for (LibraryUser user : users) {
            printLineAsIs(user.toString());
            counter++;
        }
        if (counter == 0)
            printLine("Brak użytkowników");
    }

    public void printLine(String text) {
        System.out.println(text.toUpperCase());
    }

    private void printLineAsIs(String text) {
        System.out.println(text);
    }
}