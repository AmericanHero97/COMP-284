// Recording.Java - Iakov Taranenko - 3/30/2021

/* 

Programming Exercise 9-3A

Radio station KJAVA wants a class to keep track of recordings it plays. Create a class named Recording that contains fields to hold methods for setting and getting a Recording’s title, artist, and playing time in seconds.

Implement the RecordingSort application that instantiates five Recording objects and prompts the user for values for the data fields. Then prompt the user to enter which field the Recordings should be sorted by—(S)ong title, (A)rtist, or playing (T)ime. Perform the requested sort procedure, and display the Recording objects.

The getter and setter methods for the song, artist, and playTime variables must be defined in the Recording class.

An example of the program is shown below:

Enter a song for recording 1
BlindingLights
Enter an artist for recording 1
TheWeekend
Enter the time for the recording in seconds 1
203
Enter a song for recording 2
Circles
Enter an artist for recording 2
PostMalone
Enter the time for the recording in seconds 2
227
Enter a song for recording 3
DontStartNow
Enter an artist for recording 3
DuaLipa
Enter the time for the recording in seconds 3
204
Enter a song for recording 4
AdoreYou
Enter an artist for recording 4
HarryStyles
Enter the time for the recording in seconds 4
219
Enter a song for recording 5
Memories
Enter an artist for recording 5
Maroon5
Enter the time for the recording in seconds 5
196
By which field do you want to sort?
(S)ong, (A)rtist, or (T)ime
T

artist: Maroon5    song: Memories    time: 196
artist: TheWeekend    song: BlindingLights    time: 203
artist: DuaLipa    song: DontStartNow    time: 204
artist: HarryStyles    song: AdoreYou    time: 219
artist: PostMalone    song: Circles    time: 227

*/

public class Recording {
    private String song;
    private String artist;
    private int playTime;

    public void setSong(String title) {
        // Write your code here
    }

    public void setArtist(String name) {
        // Write your code here
    }

    public void setPlayTime(int time) {
        // Write your code here
    }

    public String getSong() {
        // Write your code here
    }

    public String getArtist() {
        // Write your code here
    }

    public int getPlayTime() {
        // Write your code here
    }
}