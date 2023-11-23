import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {

    FileIO io = new FileIO();
    TextUI ui = new TextUI();
    static Login login = new Login();

    Streamingservice s1;
    Scanner scanner = new Scanner(System.in);
    ArrayList<User> users = new ArrayList<>();
    public ArrayList<String> watchedMovies = new ArrayList<>();
    public  ArrayList<String> watchedseries = new ArrayList<>();

    public ArrayList<String> savedmovies = new ArrayList<>();
    public  ArrayList<String> savedseries = new ArrayList<>();

    private static final String userfile = "C:\\Users\\chris\\IdeaProjects\\SP3-newnew\\Users.txt";
    private static final String seriesfile = "C:\\Users\\chris\\IdeaProjects\\SP3-newnew\\100bedsteserier.txt";
    private static final String moviefile = "C:\\Users\\chris\\IdeaProjects\\SP3-newnew\\100bedstefilm.txt";



    public void startmenu() {
        System.out.println("Welcome to betflmix");
        System.out.println("1) Create an account");
        System.out.println("2) login");
        try {
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    login();
                    break;
                default:
                    System.out.println("Invalid choice please try again");
                    startmenu();
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please type a number");
            startmenu();
        }
    }


    public boolean login() {
        String username = getUserInput("Enter your username: ");
        String password = getUserInput("Enter your password: ");
        if (isValidAccount(username, password)) {
            System.out.println("login successful!");
            s1= new Streamingservice(this);
            s1.displayStartMenu();

            return true;
        } else {
            System.out.println("Wrong login try again");
            login();

        }
        return false;
    }



    public void searchForSeries(){
        System.out.println("Enter the name of the series you're looking for: ");
        List<Media> allseries = new ArrayList<>();
        allseries =   io.readMediaData(seriesfile,false);
        String search = scanner.nextLine();
        boolean seriesfound = false;
        for(Media series: allseries){
            if (search.equalsIgnoreCase(series.getTitle())) {
                System.out.println("Do you want to 1) watch the series or 2) save the series");
                int choise = Integer.parseInt(scanner.nextLine());
                switch(choise){
                    case 1:
                        ui.watchedSerie(this, series);
                        seriesfound = true;
                        displayChoice();
                        break;
                    case 2:
                        ui.saveSerie(this, series);
                        seriesfound = true;
                        displayChoice();
                }
            }
        }
        if (!seriesfound) {
            ui.mediaNotFound();
            searchForSeries();
        }
    }

    public void searchForMovie() {
        System.out.println("Enter the name of the movie you're looking for: ");
        List<Media> allMovies = io.readMediaData(moviefile,true);
        String search = scanner.nextLine().trim();
        boolean movieFound = false;
        for (Media movie : allMovies) {
            if (search.equalsIgnoreCase(movie.getTitle())) {
                System.out.println("Do you want to 1) watch the movie or 2) save the movie");
                int choise = Integer.parseInt(scanner.nextLine());
                switch(choise){
                    case 1:
                        ui.watchedMovie(this, movie);
                        movieFound = true;
                        displayChoice();
                        break;
                    case 2:
                        ui.saveMovie(this, movie);
                        movieFound = true;
                        displayChoice();
                }

            }
        }

        if (!movieFound) {
            System.out.println("Movie not found. Please try again.");
            searchForMovie();
        }
    }


    public void SearchMovieGenre() {
        System.out.println("Enter the name of the genre you're looking for: ");
        ArrayList<Media> Movies = io.readMediaData(moviefile,true);
        String search = scanner.nextLine().trim();
        boolean movieFound = false;
        for (Media movie : Movies) {
            for (String category : movie.getCategory()) {
                if (search.equalsIgnoreCase(category.trim())) {
                    System.out.println(movie.getTitle());
                    movieFound = true;
                    break;
                }
            }
        }
        if (!movieFound) {
            ui.mediaNotFound();
            SearchMovieGenre();
        }
        System.out.println("Enter the title of the movie you want to see");
        String chosenmovie = scanner.nextLine().trim();
        boolean chosenmoviefound = false;
        for (Media movie : Movies) {
            if (chosenmovie.equalsIgnoreCase(movie.getTitle())) {
                System.out.println("Do you want to 1) watch the movie or 2) save the movie");
                int choice = Integer.parseInt(scanner.nextLine());
                switch(choice){
                    case 1:
                        ui.watchedMovie(this, movie);
                        chosenmoviefound = true;
                        displayChoice();
                        break;
                    case 2:
                        ui.saveMovie(this, movie);
                        chosenmoviefound = true;
                        displayChoice();
                }
            }
        }
        displayChoice();

        if (!chosenmoviefound) {
            ui.mediaNotFound();
            SearchMovieGenre();
        }
    }


    public void SearchSerieGenre() {
        System.out.println("Enter the name of the genre you're looking for: ");
        ArrayList<Media> Series = io.readMediaData(seriesfile,false);
        String search = scanner.nextLine().trim();
        boolean movieFound = false;
        for (Media series : Series) {
            for (String category : series.getCategory()) {
                if (search.equalsIgnoreCase(category.trim())) {
                    System.out.println(series.getTitle());
                    movieFound = true;
                    break;
                }
            }
        }
        if (!movieFound) {
            ui.mediaNotFound();
            SearchSerieGenre();
        }
        System.out.println("Enter the title of the movie you want to see");
        String chosenSeries = scanner.nextLine().trim();
        boolean chosenseriesfound = false;
        for (Media series : Series) {
            if (chosenSeries.equalsIgnoreCase(series.getTitle())) {
                System.out.println("Do you want to 1) watch the series or 2) save the series");
                int choise = Integer.parseInt(scanner.nextLine());
                switch(choise){
                    case 1:
                        ui.watchedSerie(this, series);
                        chosenseriesfound = true;
                        displayChoice();
                        break;
                    case 2:
                        System.out.println("You have now saved " + series.getTitle());
                        savedseries.add(series.getTitle());
                        chosenseriesfound = true;
                        displayChoice();
                }
            }
        }
        displayChoice();

        if (!chosenseriesfound) {
            ui.mediaNotFound();
            SearchMovieGenre();
        }
    }

    public void createAccount() {
        String username = getUserInput("Enter a username: ");
        String password = getUserInput("Enter a password: ");

        if (isValidAccount(username, password)) {
            System.out.println("You already have a valid account. Try again");
            createAccount();
        } else {
            saveAccount(username, password);
            System.out.println("Account created successfully.");
            users.add(new User(username, password));
            startmenu();
        }
    }

    private static String getUserInput(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(msg);
        return scanner.nextLine();
    }

    private static boolean isValidAccount(String username, String password) {
        try (Scanner scanner = new Scanner(new FileReader(userfile))) {
            while (scanner.hasNextLine()) {
                if (scanner.nextLine().equals(username + " ; " + password)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("invalid account");
        }
        return false;
    }

    private static void saveAccount(String username, String password) {
        try (FileWriter writer = new FileWriter(userfile, true)) {
            writer.write(username + " ; " + password + "\n");
        } catch (IOException e) {
            System.out.println("couldn't save account");
        }
    }


    void displayChoice(){
        System.out.println("Do you 1) Want to shut down the program or 2) return to startpage");
        int menuChoice = Integer.parseInt(scanner.nextLine());
        switch (menuChoice){
            case 1:
                break;
            case 2:
                s1.displayStartMenu();
        }
    }


}