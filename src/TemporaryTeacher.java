public class TemporaryTeacher extends Teacher {
    private int lessonCount;
    private int lessonPrice;

    public TemporaryTeacher(int id, String name, String jobTitle, int lessonCount, int lessonPrice) {
    super(id, name, jobTitle);
    this.lessonPrice = lessonPrice;
    this.lessonCount = lessonCount;
    }
    public int getSalary() {
        return lessonCount * lessonPrice;
    }
}
