package Models;


public class ResaultsIn {
    private int resTime;
    private String resName;

    public int getResTime() {
        return resTime;
    }

    public void setResTime(int resTime) {
        this.resTime = resTime;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }


    public ResaultsIn(int resTime, String resName) {
        this.resTime = resTime;
        this.resName = resName;
    }
}




