package m.kumagai.musicplayer2.ui.main;

import android.net.Uri;

public class RowData {
    public long     id;             //コンテントプロバイダに登録されたID
    public long     albumId;        //同じくトラックのアルバムのID
    public long     artistId;       //同じくトラックのアーティストのID
    public String   path;           //実データのPATH
    public String   title;          //トラックタイトル
    public String   album;          //アルバムタイトル
    public String   artist;         //アーティスト名
    public Uri uri;            // URI
    public long     duration;       // 再生時間(ミリ秒)
    public int      trackNo;        // アルバムのトラックナンバ



    public RowData(){

    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setAlbumId(long albumId) {
        this.albumId = albumId;
    }

    public void setArtistId(long artistId) {
        this.artistId = artistId;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTrackNo(int trackNo) {
        this.trackNo = trackNo;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public String getPath() {
        return path;
    }

    public String getAlbum() {
        return album;
    }

    public int getTrackNo() {
        return trackNo;
    }

    public long getAlbumId() {
        return albumId;
    }

    public long getArtistId() {
        return artistId;
    }

    public long getDuration() {
        return duration;
    }

    public long getId() {
        return id;
    }

    public Uri getUri() {
        return uri;
    }
}
