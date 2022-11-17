//page to set and get
public class Page {
    private int option1;
    private int option2;
    private String pageDesc;
   

    public int getOption1() {
        return option1;
    }

    public void setOption1(int option1) {
        this.option1 = option1;
    }

    public int getOption2() {
        return option2;
    }

    public void setOption2(int option2) {
        this.option2 = option2;
    }

    public String getPageDesc() {
        return pageDesc;
    }

    public void setPageDesc(String pageDesc) {
        this.pageDesc = pageDesc;
    }

    public Page(int option1, int option2, String description){
        this.option1 = option1;
        this.option2 = option2;
        this.pageDesc = description;
    }
}
