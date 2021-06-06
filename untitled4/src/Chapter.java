public class Chapter implements Print {

    private String nameChapter;
    private String chapterSummery;
    private int day;
    private int month;
    private int year;

    public Chapter(String nameChapter, String chapterSummery, int day, int month, int year) {
        this.nameChapter = nameChapter;
        this.chapterSummery = chapterSummery;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getNameChapter() {
        return nameChapter;
    }

    public void setNameChapter(String nameChapter) {
        this.nameChapter = nameChapter;
    }

    public String getChapterSummery() {
        return chapterSummery;
    }

    public void setChapterSummery(String chapterSummery) {
        this.chapterSummery = chapterSummery;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void print (){
        System.out.println("The chapter's name: " + nameChapter);
        System.out.println("The chapter's summery: " + chapterSummery);
        System.out.println("Date of airing: " + this.day + "/" + this.month + "/" + this.year );
    }
}
