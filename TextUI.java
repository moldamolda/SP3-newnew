public class TextUI extends FileIO{

    public void saveMedia(Login login, Media media) {
        if (media instanceof Movie) {
            login.savedmovies.add(media.getTitle());
            System.out.println("Movie saved successfully!");
        } else if (media instanceof Serie) {
            login.savedseries.add(media.getTitle());
            System.out.println("Series saved successfully!");
        }
    }

    //metode til at adde et medie til watchedList
    public void watchedMovie(Login login, Media movie){
        System.out.println("You have watched " + movie.getTitle());
        login.watchedMovies.add(movie.getTitle());

    }

    //metode til at adde et medie til watchedList
    public void watchedSerie(Login login, Media series){
        System.out.println("You are now watching " + series.getTitle());
        login.watchedseries.add(series.getTitle());
    }


    public void mediaNotFound(){
        System.out.println("Tittle not found try again");

    }


}