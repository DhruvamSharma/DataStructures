
public class SongsData implements Comparable<SongsData> {
    String mTitle;
    String mSinger;
    String mDuration;
    String mBpm;

    public SongsData(String title, String singer, String duration, String bpm) {
        mTitle = title;
        mSinger = singer;
        mDuration = duration;
        mBpm = bpm;
    }

    /* Implementing Equals and hashcode method of Object Class */

    public int hashCode() {
        return mTitle.hashCode();
    }

    public boolean equals( Object two) {
        SongsData one = (SongsData) two;
        return (mTitle.equals(one.getTitle()));
    }

    public int compareTo(SongsData data){
        Integer temp= Integer.parseInt(mBpm);
        return temp.compareTo(data.getBpm());
    }

    public String getTitle(){
        return mTitle;
    }

    public Integer getBpm(){
        return Integer.parseInt(mBpm);
    }

    public String toString(){
        return mTitle;
    }
    
}
public class SongsData implements Comparable<SongsData> {
    String mTitle;
    String mSinger;
    String mDuration;
    String mBpm;

    public SongsData(String title, String singer, String duration, String bpm) {
        mTitle = title;
        mSinger = singer;
        mDuration = duration;
        mBpm = bpm;
    }

    public int compareTo(SongsData data){
        Integer temp= Integer.parseInt(mBpm);
        return temp.compareTo(data.getBpm());
    }

    public String getTitle(){
        return mTitle;
    }

    public Integer getBpm(){
        return Integer.parseInt(mBpm);
    }

    public String toString(){
        return mTitle;
    }
    
}