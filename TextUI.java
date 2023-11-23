public class TextUI extends FileIO{

   /* public void displayMessage(String msg){
        System.out.println(msg);
    }


    public void displayMovies() {
        for (String[] s : movieList) {
            System.out.println(s);
        }
    }

    public void displaySeries() {
        for (String[] s : SeriesList) {
            System.out.println(s);
        }
    }

    public void displayWatchedMovie(User user){


        System.out.println(name.getUserName() + "," + " These are the movies that you have watched:");

        for(Movie s : user.getWatchMovieLaterList()){
            System.out.println(s);
        }

        System.out.println("Would you like to watch a movie from the list? \n ** Y/N **");

    }

    public void displaySavedMovie(User user){


        System.out.println(name.getUserName()+ "," + " These are the movies you have saved for later viewing:");

        for(Movie s : user.getWatchedMovieList()){
            System.out.println(s);
        }

        System.out.println("Would you like to watch a movie from the list? \n ** Y/N **");

    }

    public void displayWatchedSeries(User user){


        System.out.println(name.getUserName()+ "," + " This is a list of shows that you have watched:");

        for(Serie s : user.getWatchSerieList()){
            System.out.println(s);
        }

        System.out.println("Would you like to watch a show from the list? \n ** Y/N **");

    }

    public void displaySavedSeries(User user){


        System.out.println(name.getUserName()+ "," + " This is a list of shows you have saved for later viewing:");

        for(Serie s : user.getWatchSerieLaterList()){
            System.out.println(s);
        }

        System.out.println("Would you like to watch a show from the list? \n ** Y/N **");

    }*/

   public void saveMovie(Login login, Media movie){
       System.out.println("You have now saved " + movie.getTitle());
       login.savedmovies.add(movie.getTitle());
        //watchMovieLaterList.add(movie);
        //System.out.println("Media has been added to your watch later list");
    }

    //metode til at adde et medie til watchedList
    public void watchedMovie(Login login, Media movie){
        System.out.println("You have watched" + movie.getTitle());
        login.watchedMovies.add(movie.getTitle());

    }

    public void saveSerie(Login login, Media series){
        System.out.println("You have now saved " + series.getTitle());
        login.savedseries.add(series.getTitle());
    }


    //metode til at adde et medie til watchedList
    public void watchedSerie(Login login, Media series){
        System.out.println("You are now watching " + series.getTitle());
        login.watchedseries.add(series.getTitle());
    }

    //metode til at fjerne et medie fra watchLaterList
    public void removeWatchedSerie(Login login, Serie series){
        if(login.watchedseries.remove(series.getTitle())){
            System.out.println("Media has been removed from your watch later list");
        } else {
            System.out.println("Media not found in your watch later list");
        }
    }

    public void removeWatchedMovie(Login login, Serie series){
        if(login.watchedseries.remove(series.getTitle())){
            System.out.println("Media has been removed from your watch later list");
        } else {
            System.out.println("Media not found in your watch later list");
        }
    }

    public void mediaNotFound(){
        System.out.println("Tittle not found try again");

    }
    //metode til at fjerne et medie fra watchLaterList
    /*public void removeMovie(Movie movie){
        if(getWatchMovieLaterList().remove(movie)){
            System.out.println("Media has been removed from your watch later list");
        } else {
            System.out.println("Media not found in your watch later list");
        }
    }*/

}