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

    public ArrayList<Media> readMovieData(String path) {
        ArrayList<Media> movieList = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNextLine()) {
                //Scanning next line
                String line = scanner.nextLine();
                //splitting data when ; occurs
                String[] data = line.split(";");
                //finding title
                String title = data[0];
                //finding release date
                String release = data[1].trim();
                String[] categories = data[2].split(","); // Split categories directly
                //finding rating by replacing , with . since rating is a double in the txt sheet
                double rating = Double.parseDouble(data[3].replace(",", ".").trim());

                // Create a new ArrayList for each movie
                ArrayList<String> movieCategories = new ArrayList<>(Arrays.asList(categories));

                //Making movie object with the parameters
                Movie movie = new Movie(title, movieCategories, release, rating);
                //adding movie to my movieList
                movieList.add(movie);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        return movieList;
    }

    public ArrayList<Media> readSeriesData(String path) {
        ArrayList<Media> seriesList = new ArrayList<>();

        try (Scanner scanner = new Scanner(new File(path))) {
            while (scanner.hasNextLine()) {
                //Scanning next line
                String line = scanner.nextLine();
                //splitting data when ; occurs
                String[] data = line.split(";");
                if (data.length >= 5) {
                    //Finding title
                    String title = data[0];
                    //Finding Release date
                    String release = data[1].trim();
                    //Finding genre
                    String genre = data[2];
                    //replacing , with . since its a double and double's are determened with .
                    double rating = Double.parseDouble(data[3].replace(",", ".").trim());
                    //Finding seasons
                    String seasons = data[4].trim();
                    String[] categoriesArray = genre.split(","); // Split categories directly

                    // Create a new ArrayList for each series
                    ArrayList<String> seriesGenre = new ArrayList<>(Arrays.asList(categoriesArray));

                    // Create a new ArrayList for each series
                    ArrayList<String> seriesSeasons = new ArrayList<>(Arrays.asList(seasons.split(",")));

                    //Adding elements to Serie object
                    Serie serie = new Serie(title, seriesGenre, release, rating, seriesSeasons);

                    //Adding serie objects to seriesList
                    seriesList.add(serie);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        return seriesList;
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