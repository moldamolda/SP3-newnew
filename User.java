

import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    private String passWord;

    private  List<Movie> watchMovieLaterList;
    private List<Movie> watchedMovieList;

    private  List<Serie> watchSerieLaterList;
    private List<Serie> watchedSerieList;
Login log = new Login();


    public User(String userName, String passWord){
        this.userName = userName;
        this.passWord = passWord;

    }

    //metode til at adde et medie til WatchLaterList
    // Skal

    public void addToWatchLaterList(Media movie){
        System.out.println("You are now watching " + movie.getTitle());
        log.watchedmovies.add(movie.getTitle());
        //watchMovieLaterList.add(movie);
        //System.out.println("Media has been added to your watch later list");
    }

    //metode til at adde et medie til watchedList
    public void addToWatchedMovieList(Movie movie){
        watchedMovieList.add(movie);
        System.out.println("Media has been added to your watched list");
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
    }

    // til at display watchLaterList


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public List<Movie> getWatchMovieLaterList(){
        return watchMovieLaterList;
    }

    public List<Movie> getWatchedMovieList(){
        return watchedMovieList;
    }

    public List<Serie> getWatchSerieLaterList(){
        return watchSerieLaterList;
    }

    public List<Serie> getWatchSerieList(){
        return watchedSerieList;
    }
}
