import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("Pavadinimas");
        book.setPages(100);
        book.setReleaseYear(2023);

        Book book1 = new Book("Pavadinimas2", 200, 2022);
        Book book2 = new Book("Pavadinimas3", 300, 2023);
        Book book3= new Book("Pavadinimas4", 400, 2024);
        System.out.println(book);
        ArrayList<Book> library = new ArrayList<>();
        library.add(book1);
        library.add(book2);
        library.add(book3);

        for (int i = 0; i < library.size(); i++) {
            System.out.println(library.get(i));
        }

        Plant plant = new Plant();
        plant.setName("Sausutis");
        plant.setLatName("Helipterum");
        plant.setPerennial(false);
        plant.setContinent("Australia");
        plant.setMaxHeight(30);
        plant.setIsEdible(true);

        Plant plant0 = new Plant();

        plant0.setName("Placvarpis");
        plant0.setLatName("Platycodon");
        plant0.setPerennial(true);
        plant0.setContinent("Asia");
        plant0.setMaxHeight(60);
        plant0.setIsEdible(false);

        Plant plant1 = new Plant("Oleandras", "Nerium oleander", true, "Europe", 6, true);
        Plant plant2 = new Plant("Morazole", "Tunica", false, "North America", 10, false);
        ArrayList<Plant> plantLibrary = new ArrayList<>();
        plantLibrary.add(plant);
        plantLibrary.add(plant0);
        plantLibrary.add(plant1);
        plantLibrary.add(plant2);

        for (int i = 0; i < plantLibrary.size(); i++) {
            System.out.println(plantLibrary.get(i));
        }

    }
}