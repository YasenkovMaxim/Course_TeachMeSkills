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

    protected Object shallowClone() throws CloneNotSupportedException {
        return super.clone();
    }
    protected Object deepClone() throws CloneNotSupportedException {
        User cloneUser = (User) super.clone();
        Cat cloneCat =(Cat) cloneUser.getCat().clone();
        cloneUser.setCat(cloneCat);
        return cloneUser;
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
