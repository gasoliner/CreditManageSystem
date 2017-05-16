package cn.creditmanage.po;

public class BasicSituation {
    private Integer bsid;

    private Integer bsscore;

    private String username;

    private String school;

    private String startschool;

    private Integer classmatescore;

    private Integer teacherscore;

    public Integer getBsid() {
        return bsid;
    }

    public void setBsid(Integer bsid) {
        this.bsid = bsid;
    }

    public Integer getBsscore() {
        return bsscore;
    }

    public void setBsscore(Integer bsscore) {
        this.bsscore = bsscore;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getStartschool() {
        return startschool;
    }

    public void setStartschool(String startschool) {
        this.startschool = startschool == null ? null : startschool.trim();
    }

    public Integer getClassmatescore() {
        return classmatescore;
    }

    public void setClassmatescore(Integer classmatescore) {
        this.classmatescore = classmatescore;
    }

    public Integer getTeacherscore() {
        return teacherscore;
    }

    public void setTeacherscore(Integer teacherscore) {
        this.teacherscore = teacherscore;
    }
}