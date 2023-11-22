import java.util.ArrayList;
import java.util.List;

public class User {
    String username;
    String password;


    User(String username, String password){
        this.username = username;
        this.password = password;

    }



    /* public User(String userName, String passWord){
         this.userName = userName;
         this.passWord = passWord;
         this.watchedMovieList = new ArrayList<>();
         this.watchMovieLaterList = new ArrayList<>();

     }

     //metode til at adde et medie til WatchLaterList
     // Skal

     public void addToWatchLaterList(Movie movie){
         watchMovieLaterList.add(movie);
         System.out.println("Media has been added to your watch later list");
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

     public void addToWatchSerieLaterList(Serie Serie){
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


     public void setUserName(String userName) {
         this.userName = userName;
     }


     public void setPassWord(String passWord) {
         this.passWord = passWord;
     }*/
    public String getUserName() {
        return username;
    }

    public String getPassWord() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
