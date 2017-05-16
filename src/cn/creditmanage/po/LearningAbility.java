package cn.creditmanage.po;

public class LearningAbility {
    private Integer laid;

    private Integer lascore;

    private String username;

    private Float jidian;

    private Integer losemajor;

    private String scholarship;

    private Integer ranking;

    private Float point;

    @Override
    public String toString() {
        return "LearningAbility{" +
                "laid=" + laid +
                ", lascore=" + lascore +
                ", username='" + username + '\'' +
                ", jidian=" + jidian +
                ", losemajor=" + losemajor +
                ", scholarship='" + scholarship + '\'' +
                ", ranking=" + ranking +
                ", point=" + point +
                '}';
    }

    public Integer getLaid() {
        return laid;
    }

    public void setLaid(Integer laid) {
        this.laid = laid;
    }

    public Integer getLascore() {
        return lascore;
    }

    public void setLascore(Integer lascore) {
        this.lascore = lascore;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Float getJidian() {
        return jidian;
    }

    public void setJidian(Float jidian) {
        this.jidian = jidian;
    }

    public Integer getLosemajor() {
        return losemajor;
    }

    public void setLosemajor(Integer losemajor) {
        this.losemajor = losemajor;
    }

    public String getScholarship() {
        return scholarship;
    }

    public void setScholarship(String scholarship) {
        this.scholarship = scholarship == null ? null : scholarship.trim();
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public Float getPoint() {
        return point;
    }

    public void setPoint(Float point) {
        this.point = point;
    }
}