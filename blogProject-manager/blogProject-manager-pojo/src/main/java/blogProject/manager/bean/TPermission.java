package blogProject.manager.bean;

public class TPermission {

    private Integer id;

    private String permission;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    @Override
    public String toString() {
        return "TPermission [id=" + id + ", permission=" + permission + "]";
    }

}
