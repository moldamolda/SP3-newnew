public class TextUI extends FileIO{
    Login login = new Login();

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
        User name = new User("","");

        System.out.println(name.getUserName() + "," + " These are the movies that you have watched:");

        for(Movie s : user.getWatchMovieLaterList()){
            System.out.println(s);
        }

        System.out.println("Would you like to watch a movie from the list? \n ** Y/N **");

    }

    public void displaySavedMovie(User user){
        User name = new User("","");

        System.out.println(name.getUserName()+ "," + " These are the movies you have saved for later viewing:");

        for(Movie s : user.getWatchedMovieList()){
            System.out.println(s);
        }

        System.out.println("Would you like to watch a movie from the list? \n ** Y/N **");

    }

    public void displayWatchedSeries(User user){
        User name = new User("","");

        System.out.println(name.getUserName()+ "," + " This is a list of shows that you have watched:");

        for(Serie s : user.getWatchSerieList()){
            System.out.println(s);
        }

        System.out.println("Would you like to watch a show from the list? \n ** Y/N **");

    }

    public void displaySavedSeries(User user){
        User name = new User("","");

        System.out.println(name.getUserName()+ "," + " This is a list of shows you have saved for later viewing:");

        for(Serie s : user.getWatchSerieLaterList()){
            System.out.println(s);
        }

        System.out.println("Would you like to watch a show from the list? \n ** Y/N **");

    }*/

   /* public void addToWatchLaterList(Media movie){
        System.out.println("You are now watching " + movie.getTitle());
        log.savedmovies.add(movie.getTitle());
        //watchMovieLaterList.add(movie);
        //System.out.println("Media has been added to your watch later list");
    }

    //metode til at adde et medie til watchedList
    public void addToWatchedMovieList(Media movie){
        System.out.println("Media has been added to your watched list" + movie.getTitle());
        log.watchedmovies.add(movie.getTitle());

    }

    //metode til at fjerne et medie fra watchLaterList
    public void removeFromToWatchMovieLaterList(Movie movie){
        if(watchMovieLaterList.remove(movie)){
            System.out.println("Media has been removed from your watch later list");
        } else {
            System.out.println("Media not found in your watch later list");
        }
    }

    public void addToWatchSerieLaterList(Serie serie){
        watchSerieLaterList.add(serie);
        System.out.println("Media has been added to your watch later list");
    }

    //metode til at adde et medie til watchedList
    public void addToWatchedSeriesList(Serie serie){
        watchedSerieList.add(serie);
        System.out.println("Media has been added to your watched list");
    }

    //metode til at fjerne et medie fra watchLaterList
    public void removeFromToWatchSerieLaterList(Serie serie){
        if(watchSerieLaterList.remove(serie)){
            System.out.println("Media has been removed from your watch later list");
        } else {
            System.out.println("Media not found in your watch later list");
        }
    }*/

}