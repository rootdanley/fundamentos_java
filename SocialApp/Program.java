package SocialApp;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import SocialApp.entities.Comment;
import SocialApp.entities.Post;

public class Program {
  public static void main(String[] args) throws ParseException{
    
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    Comment c1 = new Comment("Have a nice trip");
    Comment c2 = new Comment("wow thats awesome");

    Post p1 = new Post(sdf.parse("21/06/2023 13:05:44"), "Traveling to New Zealand", "Im going to visit this wonderful country",21);


    p1.addComment(c1);
    p1.addComment(c2);

    System.out.println(p1);

    System.out.println();
    Comment c3 = new Comment("Good Night!");
    Comment c4 = new Comment("May the force be with you");
    Post p2 = new Post(sdf.parse("23/05/2023 14:55:44"), "Good night guys", "See you tomorrow",4);

    p2.addComment(c3);
    p2.addComment(c4);

    System.out.println(p2);
  }
}
