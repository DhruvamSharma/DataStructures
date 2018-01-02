
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