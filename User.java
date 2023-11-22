

import java.util.ArrayList;
import java.util.List;

public class User {

    private String userName;
    private String passWord; ´


Login log = new Login();


    public User(String userName, String passWord){
        this.userName = userName;
        this.passWord = passWord;

    }

    //metode til at adde et medie til WatchLaterLi


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

  /*  public List<> getWatchMovieLaterList(){
        return log.watchedmovies;
    }

    public List<> getWatchedMovieList(){
        return log.watchedmovies;
    }

    public List<> getWatchSerieLaterList(){
        return log.savedseries;
    }

    public List<> getWatchSerieList(){
        return log.watchedseries;
    }*/
}
