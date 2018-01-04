
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
        
        return mTitle.compareTo(data.getTitle());
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
