import SMP.User;
import SMP.Post;
import SMP.SocialMedia;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        SocialMedia telegram = new SocialMedia("Telegram");

        User grisha = new User("Grisha", "Male");
        User sabina = new User("Sabina", "Female");
        telegram.addUser(grisha);
        telegram.addUser(sabina);
        Post post1 = new Post(grisha.getId(), "B", "Where is the scholarship money?");
        Post post2 = new Post(sabina.getId(), "A", "Go to work if you want money!");
        telegram.addPost(post1);
        telegram.addPost(post2);

        System.out.println("All users: " + telegram.getUsers());
        System.out.println("All posts: " + telegram.getPosts());

        System.out.println("\nSearch posts by keyword 'money': " + telegram.searchPostsByKeyword("money"));

        telegram.sortPostsByTitle();
        System.out.println("\nPosts sorted by title: " + telegram.getPosts());

        System.out.println("\nSearch user by name 'Grisha': " + telegram.searchUsersByName("Grisha"));
    }
}