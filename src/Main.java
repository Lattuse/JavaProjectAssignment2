import SMP.User;
import SMP.Post;
import SMP.SocialMedia;



public class Main {
    public static void main(String[] args) {
        SocialMedia telegram = new SocialMedia("Telegram");

        User grisha = new User("Grisha", "Male");
        User sabina = new User("Sabina", "Female");
        User sultanbek = new User("Sultanbek", "Male");
        User alex = new User("Alex", "Female");

        telegram.addUser(grisha);
        telegram.addUser(sabina);
        telegram.addUser(sultanbek);
        telegram.addUser(alex);

        Post post1 = new Post(grisha.getId(), "B", "Where is the scholarship money?");
        Post post2 = new Post(sabina.getId(), "A", "Go to work if you want money!");
        Post post3 = new Post(sultanbek.getId(), "D", "Chill Guy)");
        Post post4 = new Post(alex.getId(), "C", "Just a new post :)");
        telegram.addPost(post1);
        telegram.addPost(post2);
        telegram.addPost(post3);
        telegram.addPost(post4);

        System.out.println("All users: " + telegram.getUsers());
        System.out.println("All posts: " + telegram.getPosts());

        System.out.println("\nSearch posts by keyword 'money': " + telegram.searchPostsByKeyword("money"));

        telegram.sortPostsByTitle();
        System.out.println("\nPosts sorted by title: " + telegram.getPosts());

        System.out.println("\nSearch user by name 'Grisha': " + telegram.searchUsersByName("Grisha"));

    }
}
