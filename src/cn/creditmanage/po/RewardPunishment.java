package cn.creditmanage.po;

public class RewardPunishment {
    private Integer rpid;

    private Integer rpscore;

    private String username;

    private String goodthing;

    private String schoolreward;

    private String breakrule;

    private String breaklaw;

    public Integer getRpid() {
        return rpid;
    }

    public void setRpid(Integer rpid) {
        this.rpid = rpid;
    }

    public Integer getRpscore() {
        return rpscore;
    }

    public void setRpscore(Integer rpscore) {
        this.rpscore = rpscore;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getGoodthing() {
        return goodthing;
    }

    public void setGoodthing(String goodthing) {
        this.goodthing = goodthing == null ? null : goodthing.trim();
    }

    public String getSchoolreward() {
        return schoolreward;
    }

    public void setSchoolreward(String schoolreward) {
        this.schoolreward = schoolreward == null ? null : schoolreward.trim();
    }

    public String getBreakrule() {
        return breakrule;
    }

    public void setBreakrule(String breakrule) {
        this.breakrule = breakrule == null ? null : breakrule.trim();
    }

    public String getBreaklaw() {
        return breaklaw;
    }

    public void setBreaklaw(String breaklaw) {
        this.breaklaw = breaklaw == null ? null : breaklaw.trim();
    }
}