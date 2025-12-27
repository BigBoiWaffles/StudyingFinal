package PlayList;

public class Demo {
    public static void main(String[] args){
        Playlist playlist = new Playlist("My Favorites");

        playlist.addSong(new Song("Bohemian Rhapsody", "Queen", 354));
        playlist.addSong(new Song("Stairway to Heaven", "Led Zeppelin", 482));
        playlist.addSong(new Song("Hotel California", "Eagles", 391));
        playlist.addSong(new Song("Imagine", "John Lennon", 183));
        playlist.addSong(new Song("Smells Like Teen Spirit", "Nirvana", 301));

        System.out.println("=== Playing in order ===");
        // You'll create your own iterator here
        // Example usage will depend on your iterator interface design

        System.out.println("\n=== Shuffle mode ===");
        // You'll create your shuffle iterator here

        System.out.println("\n=== Playing in order again (should be same order) ===");
        // Create another regular iterator to show the playlist wasn't modified
    }
}
