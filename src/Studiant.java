public class Studiant {
    private String name;
    private String id;
    private int age;
    private CurrentStatusEnum currentStatus;

    public Studiant(String name, String id, int age, CurrentStatusEnum currentStatus) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.currentStatus = currentStatus;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CurrentStatusEnum getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(CurrentStatusEnum currentStatus) {
        this.currentStatus = currentStatus;
    }

    @Override
    public String toString() {
        return "Studiant{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", currentStatus=" + currentStatus +
                '}';
    }
}
