import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class FileIO {


    public static void main(String[] args) {

    }

    public ArrayList<Media> readMediaData(String path, boolean isMovie) {
        ArrayList<Media> mediaList = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNextLine()) {
                // Scanning next line
                String line = scanner.nextLine();
                // Splitting data when ; occurs
                String[] data = line.split(";");

                // Common attributes
                String title = data[0];
                String release = data[1].trim();
                double rating = Double.parseDouble(data[3].replace(",", ".").trim());

                // Splitting categories when , occurs
                String[] categories;
                categories = data[2].split(",");
                if (isMovie) {

                    // Creating a new arraylist for each movie category
                    ArrayList<String> movieCategories = new ArrayList<>(Arrays.asList(categories));

                    // Creating movie objects
                    Movie movie = new Movie(title, movieCategories, release, rating);

                    // Adding my movie objects to my mediaList
                    mediaList.add(movie);
                } else {
                    // Data[4] is seasons
                    String seasons = data[4].trim();

                    // Creating a new ArrayList for each series category
                    ArrayList<String> seriesSeasons = new ArrayList<>(Arrays.asList(seasons.split(",")));

                    // Creating new series objects
                    Serie serie = new Serie(title, new ArrayList<>(Arrays.asList(categories)), release, rating, seriesSeasons);

                    // Adding Series objects to mediaList
                    mediaList.add(serie);
                }

            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        return mediaList;
    }


    public ArrayList<User> readUsers(String path) {
        ArrayList<User> users = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(";");
                String username = data[0];
                String password = (data[1].trim());
                User user = new User(username, password);
                users.add(user);
            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }

        return users;
    }

}