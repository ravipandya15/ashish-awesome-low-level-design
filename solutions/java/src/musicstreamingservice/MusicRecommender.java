package musicstreamingservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MusicRecommender {
    private static MusicRecommender instance;
    private final Map<String, List<Song>> userRecommendations;

    private MusicRecommender() {
        userRecommendations = new ConcurrentHashMap<>();
    }

    public static synchronized MusicRecommender getInstance() {
        if (instance == null) {
            instance = new MusicRecommender();
        }
        return instance;
    }

    public List<Song> recommendSongs(User user) {
        // Generate song recommendations based on user's listening history and preferences
        // ...


        // my approach
        // once user play the song, add in in history of that user,add this field in User class -> List<Song> or List<SongType> songHistory [Queue<Song> so once size >= 10 then pop song]
        // then find top 5 songs from songType and add it in userRecommendations map. -> based on rating. Can add one field as rating in Song. Rating can be added to Artist and Album as well.
        return userRecommendations.getOrDefault(user.getId(), new ArrayList<>());
    }
}
