import java.util.List;
import java.util.Scanner;

public class Streamingservice {
    Login log;

    Scanner scanner = new Scanner(System.in);


    public Streamingservice(Login log){
        this.log= log;
    }

    public void displayStartMenu() {
        System.out.println("1) Søg efter en bestemt film");
        System.out.println("2) Søg efter en bestemt Serie");
        System.out.println("3) Søg efter en bestemt film kategori");
        System.out.println("4) Søg efter en bestemt serie kategori");
        System.out.println("5) Se din liste over sete film");
        System.out.println("6) Se din liste over gemte film");
        System.out.println("7) Se din liste over sete serier");
        System.out.println("8) Se din liste over gemte serier");
        System.out.println("9) Luk programmet");

        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                log.searchformovie();
                break;
            case 2:
                log.searchforseries();
                break;
            case 3:
                log.Searchmoviegenre();
                break;
            case 4:
                log.Searchseriegenre();
                break;
            case 5:
                for (String watchedmovie : log.watchedmovies) {
                    System.out.println(watchedmovie);
                }
                log.displaychoise();
                break;
            case 6:
                for (String savedmovies : log.savedmovies) {
                    System.out.println(savedmovies);
                }
                log.displaychoise();
                break;
            case 7:
                for (String watchedseries : log.watchedseries) {
                    System.out.println(watchedseries);
                }
                log.displaychoise();
                break;
            case 8:
                for (String savedseries : log.savedseries) {
                    System.out.println(savedseries);
                }
                log.displaychoise();
                break;
            case 9:
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                displayStartMenu();
        }
    }

    public void displayMainMenu(User user)
    {

    }

    public Movie searchMovie(String title)
    {
        return null;
    }

    public Movie searchMovieFromCategory(String category)
    {
        return null;
    }

    public void playMovie(String movie)
    {

    }
    public void removeMovie(User user, Movie movie)
    {

    }

    public void saveLoginInfo(User user)
    {

    }

}