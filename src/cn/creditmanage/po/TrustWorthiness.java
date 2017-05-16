package cn.creditmanage.po;

public class TrustWorthiness {
    private Integer twid;

    private Integer twscore;

    private String username;

    private String activities;

    private String iscojob;

    private String jingdong;

    private String zhima;

    public Integer getTwid() {
        return twid;
    }

    public void setTwid(Integer twid) {
        this.twid = twid;
    }

    public Integer getTwscore() {
        return twscore;
    }

    public void setTwscore(Integer twscore) {
        this.twscore = twscore;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getActivities() {
        return activities;
    }

    public void setActivities(String activities) {
        this.activities = activities == null ? null : activities.trim();
    }

    public String getIscojob() {
        return iscojob;
    }

    public void setIscojob(String iscojob) {
        this.iscojob = iscojob == null ? null : iscojob.trim();
    }

    public String getJingdong() {
        return jingdong;
    }

    public void setJingdong(String jingdong) {
        this.jingdong = jingdong == null ? null : jingdong.trim();
    }

    public String getZhima() {
        return zhima;
    }

    public void setZhima(String zhima) {
        this.zhima = zhima == null ? null : zhima.trim();
    }
}