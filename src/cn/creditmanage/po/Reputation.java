package cn.creditmanage.po;

public class Reputation {
    private Integer reid;

    private Integer rescore;

    private String username;

    private String paytuition;

    private String nationalloan;

    private String other;

    public Integer getReid() {
        return reid;
    }

    public void setReid(Integer reid) {
        this.reid = reid;
    }

    public Integer getRescore() {
        return rescore;
    }

    public void setRescore(Integer rescore) {
        this.rescore = rescore;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPaytuition() {
        return paytuition;
    }

    public void setPaytuition(String paytuition) {
        this.paytuition = paytuition == null ? null : paytuition.trim();
    }

    public String getNationalloan() {
        return nationalloan;
    }

    public void setNationalloan(String nationalloan) {
        this.nationalloan = nationalloan == null ? null : nationalloan.trim();
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }
}