package software.design.consulate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class File {

    @Id
    @GeneratedValue
    private long id;

    @Column(length = 100)
    private String name;

    private long size;

    @Column(length = 100)
    private String type;

    private String path;

    public File() {
    }

    public File(String name, long size, String type, String path) {
        this.name = name;
        this.size = size;
        this.type = type;
        this.path = path;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
