package DZ_10.Task_2;

public class User implements Cloneable {
    private int UserId;
    private Cat cat;

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public Cat getCat() {
        return cat;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserId=" + UserId +
                ", cat=" + cat +
                '}';
    }
}
